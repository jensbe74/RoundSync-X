package ca.pkay.rcloneexplorer.util

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest

/**
 * Reports when the device loses its network connection while a worker is running.
 *
 * Replaces the WifiManager.SUPPLICANT_CONNECTION_CHANGE_ACTION broadcast, which is deprecated
 * and not delivered on current Android versions. A switch from one network to another
 * (e.g. wifi to mobile data) is not reported, only a complete loss of connectivity.
 */
class ConnectivityLossWatcher(context: Context, private val onConnectivityLost: () -> Unit) {

    private val connectivityManager =
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    private var registered = false

    private val callback = object : ConnectivityManager.NetworkCallback() {
        override fun onLost(network: Network) {
            if (connectivityManager.activeNetwork == null) {
                onConnectivityLost()
            }
        }
    }

    @Synchronized
    fun register() {
        if (registered) {
            return
        }
        val request = NetworkRequest.Builder()
            .addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
            .build()
        connectivityManager.registerNetworkCallback(request, callback)
        registered = true
    }

    /**
     * Safe to call more than once.
     */
    @Synchronized
    fun unregister() {
        if (!registered) {
            return
        }
        registered = false
        try {
            connectivityManager.unregisterNetworkCallback(callback)
        } catch (e: IllegalArgumentException) {
            FLog.e("ConnectivityLossWatcher", "Callback was not registered", e)
        }
    }
}

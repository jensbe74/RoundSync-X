package io.github.jensbe74.roundsyncx.explorer.BroadcastReceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import io.github.jensbe74.roundsyncx.explorer.Services.StreamingService;

public class ServeCancelAction extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent serveIntent = new Intent(context, StreamingService.class);
        context.stopService(serveIntent);
    }
}

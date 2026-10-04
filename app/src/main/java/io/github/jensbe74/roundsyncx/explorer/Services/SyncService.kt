package io.github.jensbe74.roundsyncx.explorer.Services

import android.app.IntentService
import android.content.Intent
import android.util.Log
import io.github.jensbe74.roundsyncx.explorer.Database.DatabaseHandler
import io.github.jensbe74.roundsyncx.explorer.workmanager.SyncManager
import io.github.jensbe74.roundsyncx.core.extensions.tag


/**
 * This service is only meant to provide other apps
 * the ability to start a task.
 * Do not actually implement any sync changes, they only belong in the SyncManager/Worker!
 */
class SyncService: IntentService("ca.pkay.rcexplorer.SYNC_SERCVICE"){
    override fun onHandleIntent(intent: Intent?) {
        if(intent == null){
            return
        }

        val action = intent.action
        val taskId = intent.getIntExtra("task", -1)
        // Todo: Allow SyncWorker to run in silent mode, or remove this!
        val silentRun = intent.getBooleanExtra("notification", true)


        if (action.equals("START_TASK")) {
            val db = DatabaseHandler(this)
            for (task in db.allTasks) {
                if (task.id == taskId.toLong()) {
                    SyncManager(this).queue(task)
                }
            }
        }
    }
}
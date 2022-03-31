package com.example.broadcastandservicespractise.services

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder

class SampleService : Service() {
    var startMode = 0 //indicates how to bahave if the service is killed
    var binder : IBinder? = null // interface for clients that bind
    var allowRebind = false //indicates whether onRebind should be used
    override fun onCreate() {
        //the service is being created
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return startMode
    }

    override fun onBind(p0: Intent?): IBinder? {
        return binder
    }

    override fun onUnbind(intent: Intent?): Boolean {
        return allowRebind
    }
}
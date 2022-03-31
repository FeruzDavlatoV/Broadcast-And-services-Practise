package com.example.broadcastandservicespractise.services

import android.app.IntentService
import android.content.Intent
import android.widget.Toast

open class IntentService(): IntentService("intent_service_thread") {

    override fun onHandleIntent(intent: Intent?) {
        synchronized(this){
            try {
                Thread.sleep(2000)
            } catch (e:Exception){
                e.printStackTrace()
            }
        }
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Toast.makeText(this, "IntentService started", Toast.LENGTH_SHORT).show()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "IntentService destroyed", Toast.LENGTH_SHORT).show()
    }
}
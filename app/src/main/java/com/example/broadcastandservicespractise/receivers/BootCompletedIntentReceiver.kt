package com.example.broadcastandservicespractise.receivers

import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast
import com.example.broadcastandservicespractise.services.NotifyingDailyService



class BootCompletedIntentReceiver : BaseReceiver() {
    override fun onRebooted(context: Context?, sms: String?) {
        Log.w("boot_broadcast_poc", "starting service...");
        context!!.startService(Intent(context, NotifyingDailyService::class.java))
        Toast.makeText(context, sms, Toast.LENGTH_SHORT).show()
    }
}
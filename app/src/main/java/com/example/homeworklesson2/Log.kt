package com.example.homeworklesson2

import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class Log(private val activity: AppCompatActivity) {

    fun logActivityCallback(callback: String) {
        val activityName = activity::class.simpleName.toString()
        Log.d("ActivityCallback", "$activityName: $callback")
    }
}
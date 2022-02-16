package com.example.homeworklesson2

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homeworklesson2.databinding.ActivityMainBinding

const val EXTRA_NUMBER = "number"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val log = Log(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        log.logActivityCallback("onCreate")
        binding.btnSecondActivity.setOnClickListener {
            sendMessage()
        }
    }

    private fun sendMessage() {
        val message = binding.tvNumber.text.toString().toInt()
        val intent = Intent(this, SecondActivity::class.java).apply {
            putExtra(EXTRA_NUMBER, message)
        }
        startActivity(intent)
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        log.logActivityCallback("onConfigurationChanged")
        increaseTextViewNumber()
    }

    private fun increaseTextViewNumber() {
        val newNumber = binding.tvNumber.text.toString().toInt() + 1
        binding.tvNumber.text = newNumber.toString()
    }

    override fun onStart() {
        super.onStart()
        log.logActivityCallback("onStart")
    }

    override fun onResume() {
        super.onResume()
        log.logActivityCallback("onResume")
    }

    override fun onRestart() {
        super.onRestart()
        log.logActivityCallback("onRestart")
    }

    override fun onPause() {
        super.onPause()
        log.logActivityCallback("onPause")
    }

    override fun onStop() {
        super.onStop()
        log.logActivityCallback("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        log.logActivityCallback("onDestroy")
    }
}
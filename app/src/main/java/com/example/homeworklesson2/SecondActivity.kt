package com.example.homeworklesson2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homeworklesson2.databinding.ActivitySecondBinding
import kotlin.math.pow

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    private val log = Log(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        log.logActivityCallback("onCreate")
        initTextViewNumber()
    }

    private fun initTextViewNumber() {
        val receivedNumber = intent.getIntExtra(EXTRA_NUMBER, 0)
        val numberForOutput = receivedNumber.toFloat().pow(2).toInt()
        binding.tvNumber.text = numberForOutput.toString()
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
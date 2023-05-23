package com.example.inflearn_coroutine_viewmodelscope

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.inflearn_coroutine_viewmodelscope.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnToSecondAct.setOnClickListener {
            Intent(this, SecondActivity::class.java).also {
                startActivity(it)
            }
        }

//        Log.d("MainActivity", "Starting...")
//        CoroutineScope(Dispatchers.IO).launch {
//            Log.d("MainActivity", "Coroutine Starting...")
//            first()
//            second()
//            Log.d("MainActivity", "...Coroutine Ended")
//        }
//        Log.d("MainActivity", "...Ended")
    }

    private suspend fun first() {
        delay(1000)
        Log.d("MainActivity", "First")

        delay(1000)
        Log.d("MainActivity", "First 2")
    }

    private suspend fun second() {
        delay(1000)
        Log.d("MainActivity", "Second")

        delay(1000)
        Log.d("MainActivity", "Second 2")
    }
}
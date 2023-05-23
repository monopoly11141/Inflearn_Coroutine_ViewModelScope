package com.example.inflearn_coroutine_viewmodelscope

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SecondActivityViewModel : ViewModel() {

    fun first() {
        CoroutineScope(Dispatchers.IO).launch {
            for(i in 0..10) {
                delay(1000)
                Log.d("SecondActivityViewModel", "First : $i")
            }
        }
    }

    fun second() {
        viewModelScope.launch{
            for(i in 0..10) {
                delay(1000)
                Log.d("SecondActivityViewModel", "Second : $i")
            }
        }
    }

}
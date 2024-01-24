package com.example.counter_mvvm_1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    private var counter = 0
    private val _counterMlv = MutableLiveData<Int>()
    val tvResult: LiveData<Int> = _counterMlv


    fun increment() {
        _counterMlv.value = ++counter
    }

    fun decrement() {
        _counterMlv.value = --counter
    }

    fun reset() {
        _counterMlv.value = 0
    }
}

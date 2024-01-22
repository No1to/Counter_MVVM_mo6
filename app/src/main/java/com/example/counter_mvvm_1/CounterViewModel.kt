package com.example.counter_mvvm_1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    private val counter = MutableLiveData<Int>()

    val count get() = counter

    fun increment() {
        counter.value = (counter.value ?: 0) + 1
    }

    fun decrement() {
        counter.value = (counter.value ?: 0) - 1
    }

    fun reset() {
        counter.value = 0
    }
}

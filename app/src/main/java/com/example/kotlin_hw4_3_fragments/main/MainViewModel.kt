package com.example.kotlin_hw4_3_fragments.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class MainViewModel: ViewModel() {

    private var mCounter = 0
    var historyList = MutableLiveData <ArrayList<String>>()
    val counter = MutableLiveData<Int>()

    fun onIncrementClick(){
        mCounter++
        counter.value =mCounter
    }

    fun onPreIncrementClick(){
        mCounter--
        counter.value =mCounter
    }

    fun setHistory(symbols: ArrayList<String>) {
        historyList.value =symbols
    }
}
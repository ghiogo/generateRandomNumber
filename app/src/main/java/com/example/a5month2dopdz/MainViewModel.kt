package com.example.a5month2dopdz

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel : ViewModel() {

    var randomNumber = MutableLiveData<Int>()
    var number: LiveData<Int> = randomNumber

    fun generateRandomNumber(): MutableLiveData<Int> {
        val generateRandomNumber = Random.nextInt(100)
        randomNumber.value = generateRandomNumber
        return randomNumber
    }
}
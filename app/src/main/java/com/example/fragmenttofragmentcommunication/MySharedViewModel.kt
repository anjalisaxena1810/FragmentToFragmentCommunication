package com.example.fragmenttofragmentcommunication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MySharedViewModel: ViewModel() {
    val textmsg = MutableLiveData<String>()

    fun SetText(text: String) {
        textmsg.postValue(text)


    }
}
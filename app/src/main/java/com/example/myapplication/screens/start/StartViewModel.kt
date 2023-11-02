package com.example.myapplication.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.repository.Repository
import com.example.myapplication.model.Nalichka1
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel:ViewModel() {

    var repo = Repository()
    var myMoneyList: MutableLiveData<Response<Nalichka1>> = MutableLiveData()

    fun getNalMoney(){
        viewModelScope.launch {
            myMoneyList.value = repo.getNal()

        }

    }



}
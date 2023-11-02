package com.example.myapplication.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.data.repository.Repository
import com.example.myapplication.model.BezNal1

import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel: ViewModel() {
    var repo = Repository()
    var myMoneyList: MutableLiveData<Response<BezNal1>> = MutableLiveData()

    fun getBezNalMoney(){
        viewModelScope.launch {
            myMoneyList.value = repo.getBezNal()

        }

    }
}
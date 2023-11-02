package com.example.myapplication.data.repository

import com.example.myapplication.data.api.RetrofitInstance
import com.example.myapplication.model.BezNal1
import com.example.myapplication.model.BezNal1Item
import com.example.myapplication.model.Nalichka1
import com.example.myapplication.model.Nalichka1Item
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<Nalichka1>{
        return RetrofitInstance.api.getNalMoneys()
    }
    suspend fun getBezNal(): Response<BezNal1>{
        return RetrofitInstance.api.getBezNalMoneys()
    }

}
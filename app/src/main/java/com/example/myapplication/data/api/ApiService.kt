package com.example.myapplication.data.api

import com.example.myapplication.model.BezNal1
import com.example.myapplication.model.BezNal1Item
import com.example.myapplication.model.Nalichka1
import com.example.myapplication.model.Nalichka1Item
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoneys(): Response<Nalichka1>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBezNalMoneys(): Response<BezNal1>

}
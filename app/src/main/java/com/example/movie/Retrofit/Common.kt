package com.example.movie.Retrofit

import com.example.movie.Interface.RetrofitService

object Common {

    private val BASE_URL = "https://www.simplifiedcoding.net/demos/"
    val retrofitService: RetrofitService
        get() = RetrofitClient.RetrofitClient.getClient(BASE_URL).create(RetrofitService::class.java)



}
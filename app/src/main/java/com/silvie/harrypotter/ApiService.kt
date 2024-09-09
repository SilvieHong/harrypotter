package com.silvie.harrypotter

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val retrofit =
    Retrofit.Builder().baseUrl("https://hp-api.onrender.com/api/")
        .addConverterFactory(GsonConverterFactory.create()).build()

val StudentService = retrofit.create(ApiService::class.java)

interface ApiService {
    @GET("characters/student")
    suspend fun getStudent(): StudentResponse
}


//https://hp-api.onrender.com/api/characters/students
//https://hp-api.onrender.com/api/characters/staff
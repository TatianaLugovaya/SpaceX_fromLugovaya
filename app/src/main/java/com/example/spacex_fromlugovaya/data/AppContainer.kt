package com.example.spacex_fromlugovaya.data

import com.example.spacex_fromlugovaya.network.APIService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
interface AppContainer {
    val rocketsRepository: RocketsRepository
}

class DefaultAppContainer : AppContainer {
    private val BASE_URL = "https://api.spacexdata.com/v3/"

    override val rocketsRepository: RocketsRepository by lazy {
        NetworkRocketsRepository(retrofitService)
    }

    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    private val retrofitService: APIService by lazy {
        retrofit.create(APIService::class.java)
    }
}
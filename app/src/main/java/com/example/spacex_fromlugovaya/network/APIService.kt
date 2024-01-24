package com.example.spacex_fromlugovaya.network

import com.example.spacex_fromlugovaya.network.model.rockets.RocketApi
import retrofit2.http.GET
interface APIService {
    @GET("rockets")
    suspend fun getRockets() : List<RocketApi>
}
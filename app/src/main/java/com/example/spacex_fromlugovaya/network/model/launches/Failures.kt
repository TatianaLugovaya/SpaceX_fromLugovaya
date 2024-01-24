package com.example.spacex_fromlugovaya.network.model.launches

import com.google.gson.annotations.SerializedName
data class Failures(
    @SerializedName("time") var time: Int? = null,
    @SerializedName("altitude") var altitude: String? = null,
    @SerializedName("reason") var reason: String? = null
)
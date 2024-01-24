package com.example.spacex_fromlugovaya.network.model.rockets

import com.google.gson.annotations.SerializedName
data class Height(
    @SerializedName("meters") var meters: Double? = null,
    @SerializedName("feet") var feet: Double? = null
)
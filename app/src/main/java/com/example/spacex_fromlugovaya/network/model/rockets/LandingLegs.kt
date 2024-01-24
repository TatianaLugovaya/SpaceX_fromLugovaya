package com.example.spacex_fromlugovaya.network.model.rockets

import com.google.gson.annotations.SerializedName
data class LandingLegs(
    @SerializedName("number") var number: Int? = null,
    @SerializedName("material") var material: String? = null
)
package com.example.spacex_fromlugovaya.network.model.rockets

import com.google.gson.annotations.SerializedName
data class Thrust(
    @SerializedName("kN") var kN: Int? = null,
    @SerializedName("lbf") var lbf: Int? = null
)
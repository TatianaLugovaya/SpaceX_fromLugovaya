package com.example.spacex_fromlugovaya.network.model.rockets

import com.google.gson.annotations.SerializedName
data class Mass(
    @SerializedName("kg") var kg: Int? = null,
    @SerializedName("lb") var lb: Int? = null
)
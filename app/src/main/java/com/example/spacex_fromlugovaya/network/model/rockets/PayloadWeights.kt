package com.example.spacex_fromlugovaya.network.model.rockets

import com.google.gson.annotations.SerializedName
data class PayloadWeights(
    @SerializedName("id") var id: String? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("kg") var kg: Int? = null,
    @SerializedName("lb") var lb: Int? = null
)
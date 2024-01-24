package com.example.spacex_fromlugovaya.network.model.launches

import com.google.gson.annotations.SerializedName
data class Patch(
    @SerializedName("small") var small: String? = null,
    @SerializedName("large") var large: String? = null
)
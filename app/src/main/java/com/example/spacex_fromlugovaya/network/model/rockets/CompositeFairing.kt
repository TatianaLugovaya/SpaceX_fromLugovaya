package com.example.spacex_fromlugovaya.network.model.rockets

import com.google.gson.annotations.SerializedName
data class CompositeFairing(
    @SerializedName("height") var height: Height? = Height(),
    @SerializedName("diameter") var diameter: Diameter? = Diameter()
)
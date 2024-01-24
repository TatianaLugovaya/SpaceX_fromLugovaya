package com.example.spacex_fromlugovaya.network.model.launches

import com.google.gson.annotations.SerializedName
data class Flickr(
    @SerializedName("small") var small: ArrayList<String> = arrayListOf(),
    @SerializedName("original") var original: ArrayList<String> = arrayListOf()
)
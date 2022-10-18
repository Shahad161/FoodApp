package com.example.foodapp.data.remote.response


import com.google.gson.annotations.SerializedName

data class Temperature(
    @SerializedName("number")
    val number: Double? = null,
    @SerializedName("unit")
    val unit: String? = null
)
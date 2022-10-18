package com.example.foodapp.data.remote.response


import com.google.gson.annotations.SerializedName

data class Step(
    @SerializedName("equipment")
    val equipment: List<Equipment?>? = null,
    @SerializedName("ingredients")
    val ingredients: List<Ingredient?>? = null,
    @SerializedName("length")
    val length: Length? = null,
    @SerializedName("number")
    val number: Int? = null,
    @SerializedName("step")
    val step: String? = null
)
package com.example.foodapp.data.remote.response

import com.google.gson.annotations.SerializedName


data class Recipes(
    @SerializedName("recipes")
    val recipes: List<Recipe>?
)
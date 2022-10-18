package com.example.foodapp.data.remote.response


import com.google.gson.annotations.SerializedName

data class AnalyzedInstruction(
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("steps")
    val steps: List<Step?>? = null
)
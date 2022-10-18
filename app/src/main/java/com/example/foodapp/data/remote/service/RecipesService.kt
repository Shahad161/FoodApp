package com.example.foodapp.data.remote.service

import com.example.foodapp.data.remote.response.Recipes
import retrofit2.Response
import retrofit2.http.*

interface RecipesService {

    @GET("recipes/random")
    suspend fun getRandomRecipes(): Response<Recipes>

}
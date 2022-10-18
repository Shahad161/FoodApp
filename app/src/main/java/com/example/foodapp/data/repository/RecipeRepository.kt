package com.example.foodapp.data.repository

import com.example.foodapp.data.remote.response.Recipes

interface RecipeRepository {

    suspend fun getRecipes(): Recipes

}
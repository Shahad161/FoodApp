package com.example.foodapp.data.repository

import com.example.foodapp.data.remote.response.Recipes
import com.example.foodapp.ui.UIState
import kotlinx.coroutines.flow.Flow

interface RecipeRepository {

    suspend fun getRecipes(): Flow<UIState<Recipes?>>

}
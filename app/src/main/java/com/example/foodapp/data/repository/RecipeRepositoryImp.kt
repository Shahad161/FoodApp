package com.example.foodapp.data.repository

import android.util.Log
import com.example.foodapp.data.remote.response.Recipes
import com.example.foodapp.data.remote.service.RecipesService
import com.example.foodapp.ui.UIState
import kotlinx.coroutines.flow.*
import retrofit2.Response
import javax.inject.Inject


class RecipeRepositoryImp @Inject constructor(
    private val recipeService: RecipesService
): BaseRepository(), RecipeRepository {

    override suspend fun getRecipes(): Recipes {
        return wrap {recipeService.getRandomRecipes()}
    }

  }
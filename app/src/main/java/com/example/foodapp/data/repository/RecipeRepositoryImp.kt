package com.example.foodapp.data.repository

import com.example.foodapp.data.remote.response.Recipes
import com.example.foodapp.data.remote.service.RecipesService
import com.example.foodapp.ui.UIState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response
import javax.inject.Inject

class RecipeRepositoryImp @Inject constructor(
    private val recipeService: RecipesService
): BaseRepository(), RecipeRepository {

    override suspend fun getRecipes(): Flow<UIState<Recipes?>> {
        return wrapWithFlow {recipeService.getRandomRecipes()}
    }

    private fun <T> wrapWithFlow(function: suspend () -> Response<T>): Flow<UIState<T?>> {
        return flow {
            emit(UIState.Loading)
            try {
                emit(checkIsSuccessful(function()))
            }catch (e: Exception) {
                emit(UIState.Error(e.message.toString()))
            }
        }
    }
    private fun <T> checkIsSuccessful(response: Response<T>): UIState<T?> =
        if (response.isSuccessful) {
            UIState.Success(response.body())
        }
        else {
            UIState.Error(response.message())
        }


}
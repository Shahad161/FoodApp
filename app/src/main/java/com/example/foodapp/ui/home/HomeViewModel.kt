package com.example.foodapp.ui.home

import android.util.Log
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.foodapp.data.repository.RecipeRepository
import com.example.foodapp.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val recipeRepository: RecipeRepository
): BaseViewModel() {

    init {
        viewModelScope.launch {
            var hh = recipeRepository.getRecipes().asLiveData()
            Log.i("kkk", hh.value.toString())
        }
    }

}
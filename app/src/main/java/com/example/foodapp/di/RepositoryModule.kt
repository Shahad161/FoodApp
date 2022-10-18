package com.example.foodapp.di

import com.example.foodapp.data.repository.*
import dagger.*
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped


@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @ViewModelScoped
    @Binds
    abstract fun bindRecipesRepository(
        RecipesRepositoryImp: RecipeRepositoryImp
    ): RecipeRepository

}
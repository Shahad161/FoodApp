package com.example.foodapp.di

import com.example.foodapp.BuildConfig
import com.example.foodapp.data.AuthInterceptor
import com.example.foodapp.data.remote.service.RecipesService
import com.google.gson.Gson
import dagger.*
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideRecipesService(retrofit: Retrofit): RecipesService {
        return retrofit.create(RecipesService::class.java)
    }

    @Singleton
    @Provides
    fun provideRetrofit(client: OkHttpClient, gsonConverterFactory: GsonConverterFactory): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .client(client)
            .addConverterFactory(gsonConverterFactory)
            .build()

    }

    @Singleton
    @Provides
    fun provideOkHttpClient(authInterceptor: AuthInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(authInterceptor)
            .build()
    }

    @Singleton
    @Provides
    fun provideGsonConverterFactory(): GsonConverterFactory {
        return GsonConverterFactory.create()
    }

    @Singleton
    @Provides
    fun provideGson(): Gson {
        return Gson()
    }

}
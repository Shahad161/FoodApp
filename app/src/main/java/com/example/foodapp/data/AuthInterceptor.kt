package com.example.foodapp.data

import android.util.Log
import com.example.foodapp.BuildConfig
import okhttp3.*
import javax.inject.Inject

class AuthInterceptor @Inject constructor() : Interceptor {

    private val apikey = BuildConfig.API_KEY
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val httpUrl = request.url.newBuilder().addQueryParameter(API_KEY_PARAMETER, apikey).build()
        request = request.newBuilder().url(httpUrl).build()
        return chain.proceed(request)
    }

    companion object {
        private const val API_KEY_PARAMETER = "apiKey"
    }

}
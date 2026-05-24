package com.example.data.di

import com.example.data.remote.WeatherApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun provideRetrofit(): Retrofit {

        return Retrofit.Builder()

            .baseUrl(
                "https://api.openweathermap.org/data/2.5/"
            )

            .addConverterFactory(
                GsonConverterFactory.create()
            )

            .build()
    }

    @Provides
    fun provideApi(
        retrofit: Retrofit
    ): WeatherApi {

        return retrofit.create(
            WeatherApi::class.java
        )
    }
}

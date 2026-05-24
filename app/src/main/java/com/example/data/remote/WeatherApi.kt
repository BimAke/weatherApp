package com.example.data.remote

import com.example.data.remote.dto.WeatherDto
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("weather")
    suspend fun getWeather(

        @Query("q")
        city: String,

        @Query("appid")
        apiKey: String

    ): WeatherDto
}

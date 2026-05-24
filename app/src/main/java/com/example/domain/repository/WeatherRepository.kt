package com.example.domain.repository

import com.example.data.remote.dto.WeatherDto

interface WeatherRepository {

    suspend fun getWeather(
        city: String
    ): WeatherDto
}

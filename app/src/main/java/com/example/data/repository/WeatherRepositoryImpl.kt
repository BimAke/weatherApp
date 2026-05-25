package com.example.data.repository

import com.example.data.remote.WeatherApi
import com.example.data.remote.dto.WeatherDto
import com.example.domain.repository.WeatherRepository

class WeatherRepositoryImpl(

    private val api: WeatherApi

) : WeatherRepository {

    override suspend fun getWeather(
        city: String
    ): WeatherDto {

        return api.getWeather(
            city,
            "73490fc56cc5034d82f4254c05a5bb4c"
        )
    }
}

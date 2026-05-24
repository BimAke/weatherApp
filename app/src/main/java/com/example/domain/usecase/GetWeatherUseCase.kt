package com.example.domain.usecase

import com.example.domain.repository.WeatherRepository

class GetWeatherUseCase(

    private val repository: WeatherRepository

) {

    suspend operator fun invoke(
        city: String
    ) = repository.getWeather(city)
}

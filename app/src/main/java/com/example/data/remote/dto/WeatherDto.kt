package com.example.data.remote.dto

data class WeatherDto(

    val name: String,

    val main: MainDto
)

data class MainDto(

    val temp: Double
)

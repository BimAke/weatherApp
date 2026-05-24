package com.example.feature_weather.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.usecase.GetWeatherUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(

    private val getWeatherUseCase: GetWeatherUseCase

) : ViewModel() {

    fun loadWeather(city: String) {

        viewModelScope.launch {

            getWeatherUseCase(city)
        }
    }
}

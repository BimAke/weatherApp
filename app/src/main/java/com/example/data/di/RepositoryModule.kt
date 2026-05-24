package com.example.data.di

import com.example.data.remote.WeatherApi
import com.example.data.repository.WeatherRepositoryImpl
import com.example.domain.repository.WeatherRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideRepository(
        api: WeatherApi
    ): WeatherRepository {

        return WeatherRepositoryImpl(api)
    }
}

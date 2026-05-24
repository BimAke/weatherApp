package com.example.data.di

import android.content.Context
import androidx.room.Room
import com.example.data.local.AppDatabase
import com.example.data.local.FavoriteDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ): AppDatabase {

        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "weather_db"
        ).build()
    }

    @Provides
    fun provideDao(
        db: AppDatabase
    ): FavoriteDao {

        return db.favoriteDao()
    }
}

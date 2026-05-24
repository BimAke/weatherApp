package com.example.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface FavoriteDao {

    @Insert
    suspend fun insert(
        city: FavoriteCity
    )

    @Query("SELECT * FROM FavoriteCity")
    suspend fun getAll(): List<FavoriteCity>
}

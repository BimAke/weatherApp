package com.example.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FavoriteCity(

    @PrimaryKey
    val name: String
)

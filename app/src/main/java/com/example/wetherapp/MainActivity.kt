package com.example.weatherapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val searchInput = findViewById<EditText>(
            R.id.searchInput
        )

        val searchButton = findViewById<Button>(
            R.id.searchButton
        )

        val cityText = findViewById<TextView>(
            R.id.cityText
        )

        val tempText = findViewById<TextView>(
            R.id.tempText
        )

        searchButton.setOnClickListener {

            val city = searchInput.text.toString()

            cityText.text = city

            tempText.text = "22°C"
        }
    }
}

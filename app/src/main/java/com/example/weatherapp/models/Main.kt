package com.example.weatherapp.models

import java.io.Serializable

data class Main(
    val temp: Double,

    val feelsLike: Double,

    val tempMin: Double,

    val tempMax: Double,

    val pressure: Long,
    val humidity: Long
) : Serializable
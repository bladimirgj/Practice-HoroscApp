package com.example.horoscapp.domain.model

import com.example.horoscapp.data.providers.network.response.PredictionResponse

interface Repository {
    suspend fun getPrediction(sign:String): PredictionModel?

}
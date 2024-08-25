package com.example.horoscapp.domain.model.usecase

import com.example.horoscapp.domain.model.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository) {
    suspend operator fun invoke(sign:String){ //Palabra clave operator, nos permite sobreescribir algunas funciones de la creación de esta clase
        repository.getPrediction(sign)
    }
}
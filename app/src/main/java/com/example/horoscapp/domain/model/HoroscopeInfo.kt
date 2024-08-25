package com.example.horoscapp.domain.model

import com.example.horoscapp.R

sealed class HoroscopeInfo(val img:Int, val name:Int){
    data object Aries:HoroscopeInfo( R.drawable.aries, R.string.Aries)
    data object Tauro:HoroscopeInfo( R.drawable.tauro, R.string.Taurus)
    data object Gemini: HoroscopeInfo(R.drawable.geminis,R.string.Gemini)
    data object Cancer: HoroscopeInfo(R.drawable.cancer, R.string.Cancer)
    data object Leo:HoroscopeInfo(R.drawable.leo, R.string.Leo)
    data object Virgo: HoroscopeInfo(R.drawable.virgo, R.string.Virgo)
    data object Libra: HoroscopeInfo(R.drawable.libra, R.string.Libra)
    data object Escorpio: HoroscopeInfo(R.drawable.escorpio, R.string.Scorpio)
    data object Sagitario: HoroscopeInfo(R.drawable.sagitario, R.string.Sagitaurus)
    data object Capricornio: HoroscopeInfo(R.drawable.capricornio, R.string.Capricorn)
    data object Acuario: HoroscopeInfo(R.drawable.aquario, R.string.Aquarius)
    data object Piscis: HoroscopeInfo(R.drawable.piscis, R.string.Piscis)
}
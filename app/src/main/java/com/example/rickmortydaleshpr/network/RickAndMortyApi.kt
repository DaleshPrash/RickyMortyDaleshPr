package com.example.projectaoct22.network

import com.example.projectaoct22.model.CharacterResponse
import retrofit2.http.GET

interface RickAndMortyApi {
    @GET("character")
    suspend fun getCharacters(): CharacterResponse
}

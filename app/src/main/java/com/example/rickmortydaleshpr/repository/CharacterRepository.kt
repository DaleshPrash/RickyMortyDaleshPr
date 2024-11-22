package com.example.projectaoct22.repository

import com.example.projectaoct22.model.Character
import com.example.projectaoct22.network.RetrofitClient
class CharacterRepository {
    private val api = RetrofitClient.api

    suspend fun getCharacters(): List<Character> {
        return api.getCharacters().results
    }
}

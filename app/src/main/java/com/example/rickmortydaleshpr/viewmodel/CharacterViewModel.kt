package com.example.projectaoct22.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.projectaoct22.model.Character
import com.example.projectaoct22.repository.CharacterRepository
import kotlinx.coroutines.launch

class CharacterViewModel : ViewModel() {
    private val repository = CharacterRepository()

    // Function to fetch characters from API
    fun fetchCharacters(onResult: (List<Character>) -> Unit) {
        viewModelScope.launch {
            try {
                val characters = repository.getCharacters()
                onResult(characters)
            } catch (e: Exception) {
                // Handle error (e.g., show a Toast or Log the error)
                e.printStackTrace()
            }
        }
    }
}

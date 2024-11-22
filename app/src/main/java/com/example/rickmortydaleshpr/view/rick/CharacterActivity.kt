package com.example.projectaoct22.view.rick

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectaoct22.R
import com.example.projectaoct22.adapter.CharacterAdapter
import com.example.projectaoct22.viewmodel.CharacterViewModel

class CharacterActivity : AppCompatActivity() {

    private val viewModel: CharacterViewModel by viewModels()
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CharacterAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character)

        recyclerView = findViewById(R.id.recyclerView)
        adapter = CharacterAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        // Fetch characters and update RecyclerView
        viewModel.fetchCharacters { characters ->
            adapter.submitList(characters)
        }
    }
}

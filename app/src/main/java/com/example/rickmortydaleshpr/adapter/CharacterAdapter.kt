package com.example.projectaoct22.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.projectaoct22.R
import com.example.projectaoct22.model.Character
import com.example.projectaoct22.view.rick.CharacterDetailBottomSheet

class CharacterAdapter : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>() {

    private var characters = listOf<Character>()

    fun submitList(list: List<Character>) {
        characters = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_character, parent, false)
        return CharacterViewHolder(view)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        val character = characters[position]
        holder.bind(character)

        holder.itemView.setOnClickListener {
            val bottomSheet = CharacterDetailBottomSheet(
                character.name,
                character.status,
                character.image
            )
            bottomSheet.show(
                (holder.itemView.context as AppCompatActivity).supportFragmentManager,
                bottomSheet.tag
            )
        }
    }

    override fun getItemCount() = characters.size

    inner class CharacterViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val nameTextView: TextView = view.findViewById(R.id.characterName)
        private val statusTextView: TextView = view.findViewById(R.id.characterStatus)
        private val imageView: ImageView = view.findViewById(R.id.characterImage)

        fun bind(character: Character) {
            nameTextView.text = character.name
            statusTextView.text = character.status
            Glide.with(itemView.context).load(character.image).into(imageView)
        }
    }
}

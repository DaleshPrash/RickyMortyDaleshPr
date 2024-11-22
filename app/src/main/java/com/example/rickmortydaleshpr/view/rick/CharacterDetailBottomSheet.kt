package com.example.projectaoct22.view.rick

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.projectaoct22.databinding.BottomSheetCharacterDetailBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class CharacterDetailBottomSheet(
    private val characterName: String,
    private val characterStatus: String,
    private val characterImage: String
) : BottomSheetDialogFragment() {

    private var _binding: BottomSheetCharacterDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BottomSheetCharacterDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set character details
        binding.characterName.text = characterName
        binding.characterStatus.text = characterStatus
        Glide.with(this)
            .load(characterImage)
            .into(binding.characterImage)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

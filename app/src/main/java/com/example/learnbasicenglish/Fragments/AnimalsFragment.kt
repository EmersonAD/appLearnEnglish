package com.example.learnbasicenglish.Fragments

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.learnbasicenglish.R
import com.example.learnbasicenglish.databinding.FragmentAnimalsBinding


class AnimalsFragment : Fragment() {
    private lateinit var binding:FragmentAnimalsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnimalsBinding.inflate(layoutInflater)
        val view = inflater.inflate(R.layout.fragment_animals, container, false)
        val imgCao = view.findViewById<ImageView>(R.id.imgCao)
        val imgGato = view.findViewById<ImageView>(R.id.imgGato)
        val imgVaca = view.findViewById<ImageView>(R.id.imgVaca)
        val imgLeao = view.findViewById<ImageView>(R.id.imgLeao)
        val imgMacaco = view.findViewById<ImageView>(R.id.imgMacaco)
        val imgOvelha = view.findViewById<ImageView>(R.id.imgOvelha)

        imgCao.setOnClickListener{
            val mediaPlayer = MediaPlayer.create(context, R.raw.dog)
            mediaPlayer.start()
        }
        imgGato.setOnClickListener{
            val mediaPlayer = MediaPlayer.create(context, R.raw.cat)
            mediaPlayer.start()
        }
        imgLeao.setOnClickListener{
            val mediaPlayer = MediaPlayer.create(context, R.raw.lion)
            mediaPlayer.start()
        }
        imgVaca.setOnClickListener{
            val mediaPlayer = MediaPlayer.create(context, R.raw.cow)
            mediaPlayer.start()
        }
        imgMacaco.setOnClickListener{
            val mediaPlayer = MediaPlayer.create(context, R.raw.monkey)
            mediaPlayer.start()
        }
        imgOvelha.setOnClickListener{
            val mediaPlayer = MediaPlayer.create(context, R.raw.sheep)
            mediaPlayer.start()
        }


        return view
        return binding.root
    }


}


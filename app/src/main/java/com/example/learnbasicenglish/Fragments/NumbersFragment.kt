package com.example.learnbasicenglish.Fragments

import android.media.MediaPlayer
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.learnbasicenglish.R
import com.example.learnbasicenglish.databinding.FragmentNumbersBinding

class NumbersFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_numbers, container, false)
        val imgUm = view.findViewById<ImageView>(R.id.imgUm)
        val imgDois = view.findViewById<ImageView>(R.id.imgDois)
        val imgTres = view.findViewById<ImageView>(R.id.imgTres)
        val imgQuatro = view.findViewById<ImageView>(R.id.imgQuatro)
        val imgCinco = view.findViewById<ImageView>(R.id.imgCinco)
        val imgSeis = view.findViewById<ImageView>(R.id.imgSeis)

        imgUm.setOnClickListener{
            val mediaPlayer = MediaPlayer.create(context, R.raw.one)
            mediaPlayer.start()
        }
        imgDois.setOnClickListener{
            val mediaPlayer = MediaPlayer.create(context, R.raw.two)
            mediaPlayer.start()
        }
        imgTres.setOnClickListener{
            val mediaPlayer = MediaPlayer.create(context, R.raw.three)
            mediaPlayer.start()
        }
        imgQuatro.setOnClickListener{
            val mediaPlayer = MediaPlayer.create(context, R.raw.four)
            mediaPlayer.start()
        }
        imgCinco.setOnClickListener{
            val mediaPlayer = MediaPlayer.create(context, R.raw.five)
            mediaPlayer.start()
        }
        imgSeis.setOnClickListener{
            val mediaPlayer = MediaPlayer.create(context, R.raw.six)
            mediaPlayer.start()
        }

        return view
    }


}
package com.example.learnbasicenglish

import android.R
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.learnbasicenglish.Fragments.AnimalsFragment
import com.example.learnbasicenglish.Fragments.LettersFragment
import com.example.learnbasicenglish.Fragments.NumbersFragment
import com.example.learnbasicenglish.databinding.ActivityMainBinding
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val viewPager = binding.viewPager
        val viewPagerTab = binding.viewPagerTab

        supportActionBar?.elevation = 0f

        val adapter = FragmentPagerItemAdapter(
            supportFragmentManager, FragmentPagerItems.with(this)
                .add("Numbers", NumbersFragment::class.java)
                .add("Animals", AnimalsFragment::class.java)
                .add("Letters", LettersFragment::class.java)
                .create()
        )

        viewPager.adapter = adapter
        viewPagerTab.setViewPager(viewPager)


    }
}
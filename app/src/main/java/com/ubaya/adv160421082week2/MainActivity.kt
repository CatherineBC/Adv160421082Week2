package com.ubaya.adv160421082week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ubaya.adv160421082week2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}
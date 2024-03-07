package com.ubaya.adv160421082week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ubaya.adv160421082week2.databinding.ActivityMainBinding
import com.ubaya.adv160421082week2.databinding.FragmentMain2Binding


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMain2Binding
    override fun onCreateView( inflater: LayoutInflater, container:
    ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMain2Binding.inflate(
            inflater,
            container, false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnStart.setOnClickListener {
            val playerName = binding.txtNama.text.toString()
            val action = MainFragmentDirections.actionGameFragment(playerName)
            Navigation.findNavController(it).navigate(action)
        }

        binding.btnOption.setOnClickListener {
            val action = MainFragmentDirections.actionOptionFragment()
            Navigation.findNavController(it).navigate(action)
        }

    }




}
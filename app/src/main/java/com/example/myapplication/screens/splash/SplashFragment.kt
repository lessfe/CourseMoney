package com.example.myapplication.screens.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentSplashBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class SplashFragment : Fragment() {
    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentSplashBinding.inflate(layoutInflater)
        val view = binding.root
        binding.txtView.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.rootFragment2)
        }

        CoroutineScope(Dispatchers.Main).launch {
            delay(1000)
            Navigation.findNavController(view).navigate(R.id.action_splashFragment2_to_rootFragment2)
        }
        return view


    }


}
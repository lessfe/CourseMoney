package com.example.myapplication.screens.root


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.findFragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import com.example.myapplication.ViewPagerAdapter
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.FragmentRootBinding


class RootFragment : Fragment() {
    private lateinit var binding: FragmentRootBinding



    private var ctx: Context? = null
    override fun onAttach(context: Context) {
        super.onAttach(context)
        ctx = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentRootBinding.inflate(layoutInflater)
        val view = binding.root

        binding.viewPager2.adapter = ViewPagerAdapter(ctx as FragmentActivity)
        /*binding.viewPager2.setOnClickListener{
           Navigation.findNavController(view).navigate(R.id.action_rootFragment2_to_splashFragment2)
        }*/

        return view


    }



}
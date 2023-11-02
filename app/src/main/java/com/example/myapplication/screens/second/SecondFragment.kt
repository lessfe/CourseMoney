package com.example.myapplication.screens.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentSecondBinding
import com.example.myapplication.databinding.FragmentStartBinding
import com.example.myapplication.screens.second.SecondAdapter
import com.example.myapplication.screens.second.SecondViewModel



class SecondFragment : Fragment() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: SecondAdapter
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this).get(SecondViewModel::class.java)
        binding = FragmentSecondBinding.inflate(layoutInflater)
        val view = binding.root
        recyclerView = binding.rvSecond

        adapter = SecondAdapter()
        recyclerView.adapter = adapter
        viewModel.getBezNalMoney()

        viewModel.myMoneyList.observe(viewLifecycleOwner) {
                list ->
            list.body()?.let { adapter.setList(it) }
        }

        return view
    }

}
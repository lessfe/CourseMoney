package com.example.myapplication.screens.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentStartBinding


class StartFragment : Fragment() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: StartAdapter
    private lateinit var binding: FragmentStartBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val viewModel = ViewModelProvider(this).get(StartViewModel::class.java)

        binding = FragmentStartBinding.inflate(layoutInflater)
        val view = binding.root

        recyclerView = binding.rvStart

        adapter = StartAdapter()
        recyclerView.adapter = adapter
        viewModel.getNalMoney()

        viewModel.myMoneyList.observe(viewLifecycleOwner) {
                list ->
                    list.body()?.let { adapter.setList(it) }
        }
        return view
    }


}
package com.example.myapplication.screens.second

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.model.BezNal1Item
import com.example.myapplication.model.Nalichka1Item

class SecondAdapter: RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {
    var listSecond = emptyList<BezNal1Item>()
    class SecondViewHolder(view: View): RecyclerView.ViewHolder(view)



    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SecondAdapter.SecondViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return SecondViewHolder(view)

    }

    override fun onBindViewHolder(holder: SecondAdapter.SecondViewHolder, position: Int) {
        val course: TextView = holder.itemView.findViewById(R.id.item_name)
        course.text = listSecond[position].ccy
        val course1: TextView = holder.itemView.findViewById(R.id.item_sale)
        course1.text = listSecond[position].sale
        val course2: TextView = holder.itemView.findViewById(R.id.item_buy)
        course2.text = listSecond[position].buy


    }

    override fun getItemCount(): Int {
        return listSecond.size
    }

    fun setList(list: List<BezNal1Item>) {
        listSecond = list
        notifyDataSetChanged()
    }

}
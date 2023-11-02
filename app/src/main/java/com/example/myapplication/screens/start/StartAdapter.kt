package com.example.myapplication.screens.start

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.BezNal1Item
import com.example.myapplication.model.Nalichka1
import com.example.myapplication.model.Nalichka1Item
import com.example.myapplication.screens.second.SecondAdapter

class StartAdapter: RecyclerView.Adapter<StartAdapter.StartViewHolder>() {
    var listStart = emptyList<Nalichka1Item>()
    class StartViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): StartAdapter.StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return StartViewHolder(view)

    }

    override fun onBindViewHolder(holder: StartAdapter.StartViewHolder, position: Int) {
        val course: TextView = holder.itemView.findViewById(R.id.item_name)
        course.text = listStart[position].ccy
        val course1: TextView = holder.itemView.findViewById(R.id.item_sale)
        course1.text = listStart[position].sale
        val course2: TextView = holder.itemView.findViewById(R.id.item_buy)
        course2.text = listStart[position].buy


    }

    override fun getItemCount(): Int {
        return listStart.size
    }
    fun setList(list: List<Nalichka1Item>) {
        listStart = list
        notifyDataSetChanged()
    }
}
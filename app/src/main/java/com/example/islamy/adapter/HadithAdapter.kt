package com.example.islamy.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islamy.R

class HadithAdapter (var items:List<String>):RecyclerView.Adapter<HadithAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.ahadith_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item = items.get(position)
        holder.hadith.setText(item)
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        lateinit var hadith:TextView
        init {
            hadith = itemView.findViewById(R.id.hadith)
        }
    }
}
package com.example.islamy.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islamy.R

class SuraAdapter(var items:List<String>):RecyclerView.Adapter<SuraAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.sura_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item = items.get(position)
        holder.aya.setText(item+"("+(position+1)+")")
    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        lateinit var aya:TextView
        init {
            aya = itemView.findViewById(R.id.ayaID)
        }
    }
}
package com.example.islamy.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islamy.Interfaces.OnItemClickListener
import com.example.islamy.R
import kotlinx.android.synthetic.main.history_item.view.*

class HistoryAdapter (var items:List<String>):RecyclerView.Adapter<HistoryAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.history_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item = items.get(position)
        holder.historyText.setText(item)
        if (onItemClickListener != null){
            holder.itemView.setOnClickListener({
                onItemClickListener.onItemClick(position,item)
            })
        }

    }

    val onItemClickListener : OnItemClickListener? = null

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        lateinit var historyText: TextView
        init {
            historyText = itemView.findViewById(R.id.history_text)
        }
    }
}
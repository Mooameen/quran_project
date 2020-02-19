package com.example.islamy.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islamy.Interfaces.OnItemClickListener
import com.example.islamy.R

class QuranAdapter(val items:List<String>) :RecyclerView.Adapter<QuranAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view:View = LayoutInflater.from(parent.context).inflate(R.layout.quran_activity,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item = items.get(position)
        holder.suraName.setText(item)
        if (onItemClickListenr != null){
            holder.itemView.setOnClickListener({
                onItemClickListenr?.onItemClick(position, item)
            })
        }
    }

    var onItemClickListenr : OnItemClickListener? = null

    class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){
        lateinit var suraName:TextView
        init {
            suraName = itemView.findViewById(R.id.suraNameID)
        }
    }
}
package com.example.islamy

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.islamy.adapter.QuranAdapter
import com.example.islamy.Interfaces.OnItemClickListener
import kotlinx.android.synthetic.main.fragment_quran.*

class QuranFragment() : Fragment(){
    lateinit var adapter:QuranAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_quran,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = QuranAdapter(Conestnt.ArSuras)
        navigation_quran_recycler_view.adapter = adapter
        adapter.onItemClickListenr = object : OnItemClickListener{
            override fun onItemClick(pos: Int, item: String) {
                var intent = Intent(context,SuraActivity::class.java)
                intent.putExtra(Conestnt.NAME_OF_SURA,item)
                intent.putExtra(Conestnt.POS_OF_SURA,pos)
                startActivity(intent)
            }
        }

    }
}
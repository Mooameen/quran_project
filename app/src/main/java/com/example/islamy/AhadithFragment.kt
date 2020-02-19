package com.example.islamy


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islamy.Interfaces.OnItemClickListener
import com.example.islamy.adapter.AhadithAdapter
import kotlinx.android.synthetic.main.fragment_ahadith.*

class AhadithFragment : Fragment() {

    lateinit var adapter:AhadithAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ahadith, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = AhadithAdapter(ahadithcount())
        adapter.onItemClickListener = object : OnItemClickListener {
            override fun onItemClick(pos: Int, item: String) {
                val intent : Intent = Intent(context,AhadithActivity::class.java)
                intent.putExtra(Conestnt.POS_OF_Hadith,pos)
                startActivity(intent)
            }
        }

        ahadith_recyclerview.adapter = adapter
    }

    fun ahadithcount() : List<Int>{
        var data = mutableListOf<Int>()
        var filecount = resources.assets.list("ahadith")?.size
        for (item in 1 ..filecount!!){
            data.add(item)
        }
        return data
    }

}

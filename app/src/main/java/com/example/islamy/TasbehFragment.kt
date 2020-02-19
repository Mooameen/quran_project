package com.example.islamy


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 */
class TasbehFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tasbeh, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sebha : ImageView = view.findViewById(R.id.sebha)
        val countBtn : ImageView = view.findViewById(R.id.repeat_btn)
        var count:Int = 1
        var tasbehat:TextView = view.findViewById(R.id.tasbehat_count)
        tasbehat.setText("0")

        sebha.setOnClickListener({
            tasbehat.setText("${count++}")
        })

        countBtn.setOnClickListener({
            count = 0
            tasbehat.setText("${count}")
        })


    }

}

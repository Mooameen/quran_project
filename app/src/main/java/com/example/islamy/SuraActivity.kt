package com.example.islamy

import android.os.Bundle
import android.widget.Adapter
import androidx.appcompat.app.AppCompatActivity
import com.example.islamy.adapter.SuraAdapter
import kotlinx.android.synthetic.main.activity_sura.*
import kotlinx.android.synthetic.main.sura_item.*
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader


class SuraActivity : AppCompatActivity() {

    lateinit var adapter:SuraAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sura)
        val getSuraName = intent.getStringExtra(Conestnt.NAME_OF_SURA)
        val pos = intent.getIntExtra(Conestnt.POS_OF_SURA,-1)
        suraNameTextID.setText(getSuraName)
        val browseSura = readFile("${pos+1}.txt")
        adapter = SuraAdapter(browseSura)
        aya_recycler_view.adapter = adapter
    }

    private fun readFile(filePos:String): List<String> {
        val data = mutableListOf<String>()
        val reader: BufferedReader
        try {
            val file: InputStream = assets.open(filePos)
            reader = BufferedReader(InputStreamReader(file))
            var line: String? = reader.readLine()
            while (line != null) {
                data.add(line)
                line = reader.readLine()
            }
        } catch (ioe: IOException) {
            ioe.printStackTrace()
        }
        return data
    }
}


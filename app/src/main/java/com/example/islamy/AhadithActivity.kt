package com.example.islamy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.TextView
import com.example.islamy.adapter.HadithAdapter
import kotlinx.android.synthetic.main.activity_ahadith.*
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader

class AhadithActivity : AppCompatActivity() {

    lateinit var hadithTitle:TextView
    lateinit var adapter: HadithAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ahadith)
        hadithTitle = findViewById(R.id.hadith_title)
        var pos = intent.getIntExtra(Conestnt.POS_OF_Hadith,-1)
        val hadith = readFile("ahadith/h${(pos+1)}.txt")
        hadithTitle.setText("${hadith.get(0)}")
        adapter = HadithAdapter(hadith.drop(1))
        hadith_recycler.adapter = adapter

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

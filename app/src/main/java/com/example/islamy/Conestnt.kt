package com.example.islamy

import android.content.res.AssetManager
import android.content.res.Resources
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader

class Conestnt {
    companion object{
        val ArSuras = listOf(
            "الفاتحه",
            "البقرة",
            "آل عمران",
            "النساء",
            "المائدة",
            "الأنعام",
            "الأعراف",
            "الأنفال",
            "التوبة",
            "يونس",
            "هود"
            ,
            "يوسف",
            "الرعد",
            "إبراهيم",
            "الحجر",
            "النحل",
            "الإسراء",
            "الكهف",
            "مريم",
            "طه",
            "الأنبياء",
            "الحج",
            "المؤمنون"
            ,
            "النّور",
            "الفرقان",
            "الشعراء",
            "النّمل",
            "القصص",
            "العنكبوت",
            "الرّوم",
            "لقمان",
            "السجدة",
            "الأحزاب",
            "سبأ"
            ,
            "فاطر",
            "يس",
            "الصافات",
            "ص",
            "الزمر",
            "غافر",
            "فصّلت",
            "الشورى",
            "الزخرف",
            "الدّخان",
            "الجاثية",
            "الأحقاف"
            ,
            "محمد",
            "الفتح",
            "الحجرات",
            "ق",
            "الذاريات",
            "الطور",
            "النجم",
            "القمر",
            "الرحمن",
            "الواقعة",
            "الحديد",
            "المجادلة"
            ,
            "الحشر",
            "الممتحنة",
            "الصف",
            "الجمعة",
            "المنافقون",
            "التغابن",
            "الطلاق",
            "التحريم",
            "الملك",
            "القلم",
            "الحاقة",
            "المعارج"
            ,
            "نوح",
            "الجن",
            "المزّمّل",
            "المدّثر",
            "القيامة",
            "الإنسان",
            "المرسلات",
            "النبأ",
            "النازعات",
            "عبس",
            "التكوير",
            "الإنفطار"
            ,
            "المطفّفين",
            "الإنشقاق",
            "البروج",
            "الطارق",
            "الأعلى",
            "الغاشية",
            "الفجر",
            "البلد",
            "الشمس",
            "الليل",
            "الضحى",
            "الشرح"
            ,
            "التين",
            "العلق",
            "القدر",
            "البينة",
            "الزلزلة",
            "العاديات",
            "القارعة",
            "التكاثر",
            "العصر",
            "الهمزة",
            "الفيل",
            "قريش",
            "الماعون",
            "الكوثر",
            "الكافرون",
            "النصر",
            "المسد",
            "الإخلاص",
            "الفلق",
            "الناس"
        )
        val NAME_OF_SURA : String = "nameSura"
        val POS_OF_SURA : String = "soraPosition"
        val POS_OF_Hadith : String = "hadithPosition"

/*
        fun readFile(filePos:String): List<String> {
            val data = mutableListOf<String>()
            val reader: BufferedReader
            try {
                 var assets:AssetManager? = null
                val file: InputStream = assets!!.open(filePos)
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
*/

/*
        fun ahadithcount() : List<Int>{
            var data = mutableListOf<Int>()
             var resources : Resources? = null
            var filecount = resources?.assets?.list("ahadith")?.size
            for (item in 1 ..filecount!!){
                data.add(item)
            }
            return data
        }
*/

    }
}
package com.example.islamy

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.MenuItem
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_quran.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nav_view.setOnNavigationItemSelectedListener { item ->
            var fragment:Fragment? = null
            if (item.itemId == R.id.navigation_quran){
                fragment = QuranFragment()
            }else if (item.itemId == R.id.navigation_tasbeh){
                fragment = TasbehFragment()
            }else if(item.itemId == R.id.navigation_ahadith){
                fragment = AhadithFragment()
            }else if(item.itemId == R.id.navigation_history){
                fragment = HistoryFragment()
            }
            supportFragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.fadein,R.anim.fadeout)
                .replace(R.id.fragment_container,fragment?:QuranFragment())
                .commit()

//            var animation = AnimationUtils.loadAnimation(fragment_container.context,R.anim.fadein)
  //          nav_view.startAnimation(animation)

            true
        }
        nav_view.selectedItemId = R.id.navigation_quran

    }

}

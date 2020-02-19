package com.example.islamy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler()
        .postDelayed(object : Runnable{
            override fun run() {
                var intent = Intent(this@SplashActivity,MainActivity::class.java)
                finish()
                startActivity(intent)
            }
        },2000)


    }
}

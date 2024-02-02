package com.rj.testmodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
//import com.rj.modulebottomnav.ActBottomNav


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<TextView>(R.id.tvHome).setOnClickListener {
//            val intent = Intent(applicationContext, ActBottomNav::class.java)
//            startActivity(intent)
        }

    }
}
package com.jpr.newbatchapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class HomeActivity : AppCompatActivity() {


    val TAG :String = "HomeActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val nametv = findViewById<TextView>(R.id.nameTV)
        val chktv = findViewById<TextView>(R.id.chkTv)



        val name = intent.getStringExtra("name")

        nametv.text = name


        if (intent.hasExtra("chk")){
            val chk = intent.getStringExtra("chk")
            chktv.text = chk
        }




    }
}
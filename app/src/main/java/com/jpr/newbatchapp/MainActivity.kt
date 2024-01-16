package com.jpr.newbatchapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val submit = findViewById<Button>(R.id.button)
        val nameEdt = findViewById<EditText>(R.id.nameEdt)
        val chk = findViewById<CheckBox>(R.id.checkBox)

        submit.setOnClickListener {

            val intent = Intent(this@MainActivity,HomeActivity::class.java)
            val name = nameEdt.text.toString()
            intent.putExtra("name",name)

            Log.d(TAG,name.toString())

            if (chk.isChecked){
                val checkBox = chk.text.toString()
                intent.putExtra("chk",checkBox)
                Log.d(TAG,checkBox.toString())
            }

            startActivity(intent)


        }

    }
}
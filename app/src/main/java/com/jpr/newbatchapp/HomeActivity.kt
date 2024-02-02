package com.jpr.newbatchapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jpr.newbatchapp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val freindlist =  arrayListOf<Student>()

        for (i in 1.. 100){

            val std = Student("Atul"+1,"atul"+i+"gmail.com","87439847394"+i,R.drawable.raj)

            freindlist.add(std)

        }


        val frendListAdapter = FrendListAdapter(freindlist)

        binding.nameRv.layoutManager = LinearLayoutManager(this)

        binding.nameRv.setHasFixedSize(true)

        binding.nameRv.adapter = frendListAdapter







    }
}
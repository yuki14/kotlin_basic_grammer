package com.example.user.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    var text = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnPlayString.setOnClickListener {
            //Ranges examples
            for (i in 1..10) // equivalent of 1 <= i && i<= 10
                    Log.d("LOOP", "" + i)
            //Other example
            for (i in 1..4)
                Log.d("TAG", i.toString())

            for (i in 4 downTo 1)
                Log.d("TAG", i.toString())

            for (i in 10 downTo 1 step 2)
                Log.d("TAG", i.toString())

            for (i in 1 until 10)// excluded 10
                Log.d("TAG", i.toString())

        }
    }
}

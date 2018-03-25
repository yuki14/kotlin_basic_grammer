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
            // If expression
            // Example find max with w numbers
            val a = 10 // Use val if value not changed, like final in Java
            val b = 20
            val max = if (a > b) a else b  //like : a > b ? a : b
            Log.d("MAX NUMBER", "" + max)

            // When Expression
            val x = 10
            when (x)
            {
                10 -> Log.d("WHEN", "X == 10")
                else ->{
                    Log.d("WHEN", "X != 10")
                }
            }
        }
    }
}

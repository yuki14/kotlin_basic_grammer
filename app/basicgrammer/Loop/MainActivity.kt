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
            //For loop
            val items = listOf<Int>(1,2,3,4,5,6,7,8,9,10)

            for (index in items)
                Log.d("DEBUG",""+index)


            for (index in items.indices)
                Log.d("DEBUG", "index : $index = ${items[index]}")

            for ((index,value) in items.withIndex())
                Log.d("DEBUG", "index : $index = $value")

            //While loop
            var x = 0
            while (x<10)
            {
                Log.d("DEBUG", "" + x)
                x++
            }

            //Do - While loop
            x = 0
            do {
                Log.d("DEBUG", "" + x)
                x++
            } while (x < 10)

            x = 0
            while (x < 10)
            {
                x++
                if (x % 2 != 0)
                    Log.d("DEBUG", "X = $x")
                else
                    continue
            }

            x = 0
            while (x < 10)
            {
                x++
                if (x % 2 != 0)
                    Log.d("DEBUG", "X = $x")
                else
                    break
            }
        }
    }
}

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
            //Collections example
            val numbers = mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10)
            for (i in numbers)
                Log.d("Number", i.toString())

            numbers.add(6)
            Log.d("After change", "")
            for (i in numbers)
                Log.d("Number", i.toString())

            Log.d("FIRST ITEM", numbers.first().toString())
            Log.d("LAST ITEM", numbers.last().toString())
            Log.d("FILLER", numbers.filter { it % 2 != 0 }.toString())

            val noDuplicate = hashSetOf<String>("a", "b", "c", "c", "d")
            for (item in noDuplicate)
                Log.d("ITEM", item)

            for (item in noDuplicate.toSortedSet())
                Log.d("ITEM", item)

            val myHashMap = hashMapOf<String, Int>("First" to 1, "Second" to 2)
            Log.d("ITEM", myHashMap["First"].toString())
            Log.d("ITEM", myHashMap["Second"].toString())


        }
    }
}

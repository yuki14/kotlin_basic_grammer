package com.example.user.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    var text = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnPlayString.setOnClickListener {
            text = edtString.text.toString()
            Toast.makeText(this, "${text.replace("cat", "dog")}, was replace from $text", Toast.LENGTH_SHORT).show()
        }
    }
}

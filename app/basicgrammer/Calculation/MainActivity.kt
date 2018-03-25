package com.example.user.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    fun sum2number(a: Int, b: Int):Int = a+b

    fun showToast(a: Int,b: Int):Unit{
        Toast.makeText(this, "${a + b}", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSum.setOnClickListener {
            Toast.makeText(this,""+sum2number(editNum1.text.toString().toInt(),editNum2.text.toString().toInt()),Toast.LENGTH_SHORT).show()
            showToast(editNum1.text.toString().toInt(), editNum2.text.toString().toInt())
        }
    }
}

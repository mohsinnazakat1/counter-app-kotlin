package com.example.counterappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.mybutton)
        val txt = findViewById<TextView>(R.id.mytext)
        val reset_btn = findViewById<TextView>(R.id.reset)
        var counter = 0;

        btn.setOnClickListener {
            counter++
            txt.text = counter.toString()

        }
        reset_btn.setOnClickListener {
            counter=0
            txt.text= "0"
        }
    }
}
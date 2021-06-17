package com.example.loginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnbutton2=findViewById<Button>(R.id.btnbutton2)

        btnbutton2.setOnClickListener{
            var intent=Intent(baseContext,signup::class.java)
            startActivity(intent)
        }
    }
}
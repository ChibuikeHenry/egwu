package com.example.egwu

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class third : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)


        val fourthActButton = findViewById<Button>(R.id.fourth_act_btn)
        fourthActButton.setOnClickListener {
            val Intent = Intent(this, fourth::class.java)
            startActivity(Intent)
        }
    }
}
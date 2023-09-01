package com.example.egwu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val thirdActButton = findViewById<Button>(R.id.third_act_btn)
        thirdActButton.setOnClickListener {
            val Intent = Intent(this, third::class.java)
            startActivity(Intent)
        }
    }
}
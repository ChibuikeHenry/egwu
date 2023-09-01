package com.example.egwu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class fourth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        var diceButton: Button = findViewById(R.id.fifth_act_btn)
        diceButton.setOnClickListener {
            Toast.makeText(this,"shine on", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        var diceImage = findViewById<ImageView>(R.id.diceimagee)

        val randomInt  = Random.nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else->R.drawable.dice_6
        }


        var diceImagee = null
        diceImage.setImageResource(drawableResource)


    }
}
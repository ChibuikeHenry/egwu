package com.example.egwu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val secondActButton= findViewById<Button>(R.id.second_act_btn)
        secondActButton.setOnClickListener {
            navigate()
        }



        findViewById<Button>(R.id.button).setOnClickListener {
            MaterialAlertDialogBuilder(this)
                .setMessage("Add Blossom")
                .setPositiveButton("YES"){_,_ ->
                    Toast.makeText(this@MainActivity,"You Selected Yes",Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("NO"){_,_ ->
                    Toast.makeText(this@MainActivity,"You Selected No",Toast.LENGTH_SHORT).show()

                }
                .setTitle("ADD CONTACT")



        }
    }

    fun navigate(){
        val Intent = Intent(this,SecondActivity::class.java)
        startActivity(Intent)

    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onStart() {
        println("IHAVE STARTED")
        super.onStart()
    }

    override fun onResume() {
        println("IHAVE resume")

        super.onResume()
    }

    override fun onPause() {
        println("IHAVE pause")

        super.onPause()
    }

    override fun onDestroy() {
        println("IHAVE STARTED")
        super.onDestroy()
    }
}
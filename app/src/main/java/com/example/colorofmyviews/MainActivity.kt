package com.example.colorofmyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redButton: Button = findViewById(R.id.red_button)
        val blueButton: Button = findViewById(R.id.blue_button)
        val greenButton: Button = findViewById(R.id.green_button)




        redButton.setOnClickListener(){
            redClick()
        }

        greenButton.setOnClickListener(){
            greenClick()
        }

        blueButton.setOnClickListener(){
            blueClick()
        }
    }

    private fun blueClick() {
        findViewById<TextView>(R.id.box_1).setBackgroundColor(Color.BLUE)
    }

    private fun greenClick() {
        findViewById<TextView>(R.id.box_1).setBackgroundColor(Color.GREEN)
    }

    private fun redClick() {
        findViewById<TextView>(R.id.box_1).setBackgroundColor(Color.RED)
    }
}
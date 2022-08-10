package com.example.dicerollertraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)
        val resultText : TextView = findViewById(R.id.result_text)
        val randomInt  = (1..6).random()
        resultText.text = randomInt.toString()
        rollButton.setOnClickListener{rollDice()}
    }

    private fun rollDice(){
        Toast.makeText(this,"botton clicked", Toast.LENGTH_SHORT).show()
    }
}
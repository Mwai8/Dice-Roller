package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener{
            rollDice()
        }
    }
    private fun rollDice(){
        val dice = Dice(numSides = 6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text= diceRoll.toString()

        val diceTwo = Dice(numSides = 6)
        val secondDiceRoll = diceTwo.roll()
        val secondResultTextView: TextView = findViewById(R.id.textView4)
        secondResultTextView.text= secondDiceRoll.toString()
    }
}
class Dice (private val numSides: Int){
    fun roll(): Int{
        return(1..numSides).random()
    }
}
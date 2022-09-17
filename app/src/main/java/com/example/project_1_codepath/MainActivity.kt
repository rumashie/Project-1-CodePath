package com.example.project_1_codepath

import android.R
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var wordToGuess = FourLetterWordList.getRandomFourLetterWord();

    var simpleEditText = findViewById<View>(R.id.et_simple) as EditText
    var userGuess = simpleEditText.text.toString()

    private fun checkGuess(guess: String) : String
    {
        var result = ""
        for (i in 0..3)
        {
            if (guess[i] == wordToGuess[i]) {
                result += "O"
            }
            else if (guess[i] in wordToGuess) {
                result += "+"
            }
            else {
                result += "X"
            }
        }
        return result
    }


} //Main Activity
package com.example.noteapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainPage : AppCompatActivity() , View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page)

        val startButton: Button = findViewById(R.id.startbutton)
        startButton.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        // Handle button clicks here
        when (view.id) {
            R.id.startbutton -> {
                // Start the QuizPage activity when startButton is clicked
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }
}
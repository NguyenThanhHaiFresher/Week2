package com.example.week2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class Welcome : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val signinscr = findViewById<TextView>(R.id.signinbtn)
        signinscr.setOnClickListener{opensignin()}
    }

    private fun opensignin() {
        val intent = Intent(this@Welcome, SignIn()::class.java)
        startActivity(intent)
    }
}
package com.example.week2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class onboard3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard3)

        val welcomescr = findViewById<ImageButton>(R.id.FinishOnboardButton)
        welcomescr.setOnClickListener{welcome()}


    }

    private fun welcome() {
        val intent = Intent(this@onboard3, Welcome()::class.java)
        startActivity(intent)
    }
}
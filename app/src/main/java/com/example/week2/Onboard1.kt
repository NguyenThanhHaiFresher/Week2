package com.example.week2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class Onboard1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard1)

        val onboard2btn = findViewById<ImageButton>(R.id.Onboard2Button)
        onboard2btn.setOnClickListener{Onboard2()}
    }

    private fun Onboard2(){
        val intent = Intent(this@Onboard1, Onboard2::class.java)
        startActivity(intent)
    }
}
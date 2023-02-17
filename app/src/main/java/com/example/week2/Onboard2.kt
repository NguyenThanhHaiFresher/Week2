package com.example.week2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Onboard2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard2)

        val onboard3btn = findViewById<ImageButton>(R.id.OnBoard3Button)
        onboard3btn.setOnClickListener{Onboard3()}
    }

    private fun Onboard3(){
        val intent = Intent(this@Onboard2, onboard3::class.java)
        startActivity(intent)
    }
}
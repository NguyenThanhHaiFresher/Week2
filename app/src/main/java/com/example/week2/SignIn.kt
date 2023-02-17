package com.example.week2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        val login = findViewById<Button>(R.id.login_btn)
        val email = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val password = findViewById<EditText>(R.id.editTextTextPassword)
        login.setOnClickListener{
            if(email.text.isNullOrBlank() && password.text.isNullOrBlank()){
                Toast.makeText(this,"Email or Password cannot be blanked",Toast.LENGTH_SHORT).show()
            }
            else if(email.text.toString() == "username@gmail.com" && password.text.toString() == "123456" ){
                startActivity(Intent(applicationContext, Profile::class.java))
                finish()
            }
            else {
                Toast.makeText(this,"Wrong Email or Password",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
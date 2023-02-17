package com.example.week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        opendialog()
    }

    private fun opendialog() {
        val fullname = findViewById<TextView>(R.id.editTextTextPersonName)
        fullname.setOnClickListener(){
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.fullname_dialog, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.fullname_edit)
            val profilename = findViewById<TextView>(R.id.profilename)

            with(builder) {
                setTitle("Change your fullname")
                setPositiveButton("Change"){dialog, which ->
                    fullname.text = editText.text.toString()
                    profilename.text = editText.text.toString()
                }
                setNegativeButton("Cancel") {dialog, which ->
                    Log.d("Main","Negative button clicked")
                }
                setView(dialogLayout)
                show()
            }


        val email = findViewById<TextView>(R.id.editTextTextPersonName2)
        email.setOnClickListener(){
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogLayout = inflater.inflate(R.layout.email_dialog, null)
            val editText = dialogLayout.findViewById<EditText>(R.id.et_editText)

            with(builder) {
                setTitle("Change your email")
                setPositiveButton("Change"){dialog, which ->
                    email.text = editText.text.toString()
                }
                setNegativeButton("Cancel") {dialog, which ->
                    Log.d("Main","Negative button clicked")
                }
                setView(dialogLayout)
                show()
        }

            val phonenumber = findViewById<TextView>(R.id.editTextTextPersonName3)
            phonenumber.setOnClickListener(){
                val builder = AlertDialog.Builder(this)
                val inflater = layoutInflater
                val dialogLayout = inflater.inflate(R.layout.phonenumber_dialog, null)
                val editText = dialogLayout.findViewById<EditText>(R.id.phonenumber_edit)

                with(builder) {
                    setTitle("Change your phone number")
                    setPositiveButton("Change"){dialog, which ->
                        phonenumber.text = editText.text.toString()
                    }
                    setNegativeButton("Cancel") {dialog, which ->
                        Log.d("Main","Negative button clicked")
                    }
                    setView(dialogLayout)
                    show()
                }
        }
    }
}
}
}




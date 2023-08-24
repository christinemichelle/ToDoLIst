package com.example.todolist

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        var back:TextView = findViewById(R.id.txtlogin)
        back.setOnClickListener {
            var goback = Intent (this,LogInActivity::class.java )
            startActivity(goback)
        }
    }
}
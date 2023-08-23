package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var sup: TextView = findViewById(R.id.sup)
        sup.setOnClickListener {
            var nxt_intent = Intent(this,SignUpActivity::class.java)
            startActivity(nxt_intent)
        }

        var login: Button = findViewById(R.id.btnlogin)
        login.setOnClickListener {
            var Login = Intent(this,WelcomeActivity::class.java)
            startActivity(Login)
        }
    }
}
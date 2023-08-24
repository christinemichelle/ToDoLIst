package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        var task: Button = findViewById(R.id.btnnxt)
        task.setOnClickListener {
            var gototask= Intent(this, TaskActivity::class.java)
            startActivity(gototask)
        }
    }
}
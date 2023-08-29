package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)


        var create: View? = findViewById(R.id.fab)
        if (create != null) {
            create.setOnClickListener {
                val nextintent =Intent(this,CreateTaskActivity::class.java)
                startActivity(nextintent)
            }
        }
    }
}
package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.controls.actions.FloatAction
import android.view.View
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TaskActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taskactivity)

        var create: View? = findViewById(R.id.fab)
        if (create != null) {
            create.setOnClickListener {
                val nextintent =Intent(this,CreateTaskActivity::class.java)
                startActivity(nextintent)
            }
        }
    }
}
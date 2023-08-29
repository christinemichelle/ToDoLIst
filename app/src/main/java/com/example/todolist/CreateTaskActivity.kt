package com.example.todolist

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class CreateTaskActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_task)


        val buttonShowToast: Button = findViewById(R.id.btncreate)

        buttonShowToast.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                // Display a toast message when the button is clicked
                Toast.makeText(applicationContext, "Button Clicked!", Toast.LENGTH_SHORT).show()
            }
        })
    }
}








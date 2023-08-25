package com.example.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.todolist.databinding.ActivityLoginBinding
import com.example.todolist.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth

class LogInActivity : AppCompatActivity() {


    private lateinit var binding: ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.sup.setOnClickListener {
            val intent= Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }

        binding.btnlogin.setOnClickListener {
            val Mail= binding.maill.text.toString()
            val pass = binding.password.text.toString()


            if (Mail.isNotEmpty()  && pass.isNotEmpty()){
                firebaseAuth.createUserWithEmailAndPassword(Mail, pass).addOnCompleteListener {
                    if (it.isSuccessful){
                        val intent =Intent(this, WelcomeActivity::class.java)
                        startActivity(intent)
                    }else
                    {
                        Toast.makeText(this,it.exception.toString() , Toast.LENGTH_SHORT) .show()

                    }
                }
            } else
            {
                Toast.makeText(this,"Empty fields are not allowed!" , Toast.LENGTH_SHORT) .show()
            }
        }


    }
}
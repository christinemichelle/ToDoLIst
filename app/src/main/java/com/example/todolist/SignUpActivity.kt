package com.example.todolist

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.todolist.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")


    private lateinit var binding:ActivitySignUpBinding
    private lateinit var firebaseAuth:FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)

        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.txtlogin.setOnClickListener {
            val intent =Intent(this, LogInActivity::class.java)
            startActivity(intent)
        }

        binding.btnnxt.setOnClickListener {
            val gmail= binding.mail.text.toString()
            val pass = binding.tpassword.text.toString()

            if (gmail.isNotEmpty() && pass.isNotEmpty()){
                firebaseAuth.createUserWithEmailAndPassword(gmail, pass).addOnCompleteListener {
                    if (it.isSuccessful){
                        val intent =Intent(this, LogInActivity::class.java)
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
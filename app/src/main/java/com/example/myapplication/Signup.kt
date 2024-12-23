package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)
        val btngoogle = findViewById<ImageButton>(R.id.btngoogle)
        btngoogle.setOnClickListener{
            Toast.makeText(this,"Signed in successfully returning back to home page", Toast.LENGTH_LONG).show()
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        val btnfacebook = findViewById<ImageButton>(R.id.btnfacebook)
        btnfacebook.setOnClickListener{
            Toast.makeText(this,"Signed in successfully returning back to home page", Toast.LENGTH_LONG).show()
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        val btnSignup = findViewById<MaterialButton>(R.id.btnSignup)
        btnSignup.setOnClickListener{
            Toast.makeText(this,"Signed in successfully returning back to home page", Toast.LENGTH_LONG).show()
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        val now = findViewById<TextView>(R.id.now)
        now.setOnClickListener{
            var intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
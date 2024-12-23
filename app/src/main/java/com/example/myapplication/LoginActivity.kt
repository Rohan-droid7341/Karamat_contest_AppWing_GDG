package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        val passwordField = findViewById<EditText>(R.id.pass)
        val showPasswordCheckbox = findViewById<CheckBox>(R.id.checkbox)

        showPasswordCheckbox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Show password
                passwordField.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            } else {
                // Hide password
                passwordField.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
            // Retain the cursor position
            passwordField.setSelection(passwordField.text.length)
        }
        val btnlogin = findViewById<MaterialButton>(R.id.btnLogin)
        btnlogin.setOnClickListener{
            Toast.makeText(this,"Logged in successfully returning back to home page", Toast.LENGTH_LONG).show()
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        val forgot = findViewById<TextView>(R.id.forgot)
        forgot.setOnClickListener{
            Toast.makeText(this,"There is nothing we can do about it",Toast.LENGTH_LONG).show()
        }
        val btngoogle = findViewById<ImageButton>(R.id.btngoogle)
        btngoogle.setOnClickListener{
            Toast.makeText(this,"Logged in successfully returning back to home page", Toast.LENGTH_LONG).show()
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        val btnfacebook = findViewById<ImageButton>(R.id.btnfacebook)
        btnfacebook.setOnClickListener{
            Toast.makeText(this,"Logged in successfully returning back to home page", Toast.LENGTH_LONG).show()
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        val now = findViewById<TextView>(R.id.now)
        now.setOnClickListener{
            var intent = Intent(this,Signup::class.java)
            startActivity(intent)
        }
    }
}
package com.bagicode.aplikasipertamaku.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bagicode.aplikasipertamaku.MainActivity
import com.bagicode.aplikasipertamaku.R

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val btnSignIn = this.findViewById<Button>(R.id.btn_signin)
        val tvSignUp = this.findViewById<TextView>(R.id.tv_signup)
        val etUsername = this.findViewById<EditText>(R.id.et_username)
        val etPassword = this.findViewById<EditText>(R.id.et_password)

        tvSignUp.setOnClickListener {
            startActivity(Intent(this@SigninActivity, SignupActivity::class.java))
        }

        btnSignIn.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if (username.equals("user", true) && password.equals("1234")) {
                startActivity(Intent(this@SigninActivity, MainActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Maaf user invalid", Toast.LENGTH_LONG).show()
            }

        }

    }
}
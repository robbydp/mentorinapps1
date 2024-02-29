package com.bagicode.aplikasipertamaku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.bagicode.aplikasipertamaku.auth.SigninActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val btnSignin = this.findViewById<Button>(R.id.btn_signin)
        btnSignin.setOnClickListener {
            startActivity(Intent(this@WelcomeActivity, SigninActivity::class.java))
            finish()
        }
    }
}
package com.bagicode.aplikasipertamaku.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bagicode.aplikasipertamaku.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            ivBack.setOnClickListener {
                finish()
            }

            btnSignup.setOnClickListener {
                finish()
            }

            tvSignin.setOnClickListener {
                finish()
            }
        }


    }
}
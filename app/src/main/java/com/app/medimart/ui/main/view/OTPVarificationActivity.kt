package com.app.medimart.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.medimart.R
import com.app.medimart.databinding.ActivityLoginBinding
import com.app.medimart.databinding.ActivityOtpvarificationBinding

class OTPVarificationActivity : AppCompatActivity() {
    private lateinit var binding:ActivityOtpvarificationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otpvarification)

        binding= ActivityOtpvarificationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbar.textTitle.text="Login"
        binding.toolbar.imgback.setOnClickListener { finish() }

    }
}
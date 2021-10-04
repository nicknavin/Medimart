package com.app.medimart.ui.main.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.medimart.R
import com.app.medimart.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbarDefault.textTitle.text="Login"
        binding.toolbarDefault.imgback.setOnClickListener { finish() }
        binding.btnContinue.setOnClickListener {callTOPVerify()  }
    }
    fun callTOPVerify()
    {
        val intent: Intent = Intent(this, OTPVarificationActivity::class.java)
        startActivity(intent)
    }
}
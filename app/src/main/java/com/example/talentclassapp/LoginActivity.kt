package com.example.talentclassapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.talentclassapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        buttonLoginState()
    }

    private fun buttonLoginState(){

        binding.buttonLogin.setOnClickListener {
            if(binding.etNameLogin.text.toString().isEmpty()){
                binding.etNameLogin.setError("Masukan Nama!")
            } else if(binding.etEmailLogin.text.toString().isEmpty()){
                binding.etEmailLogin.setError("Masukan Email!")
            } else if(binding.etMajorLogin.text.toString().isEmpty()){
                binding.etMajorLogin.setError("Masukan Jurusan!")
            } else if(binding.etSemesterLogin.text.toString().isEmpty()){
                binding.etSemesterLogin.setError("Masukan Semester!")
            } else{
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("Nama", binding.etNameLogin.text.toString())
                intent.putExtra("Email", binding.etEmailLogin.text.toString())
                intent.putExtra("Jurusan", binding.etMajorLogin.text.toString())
                intent.putExtra("Semester", binding.etSemesterLogin.text.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}
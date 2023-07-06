package com.example.talentclassapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var nama: String? = intent.getStringExtra("Nama")
        var email: String? = intent.getStringExtra("Email")
        var major: String? = intent.getStringExtra("Jurusan")
        var semester: String? = intent.getStringExtra("Semester")

        val tvName = findViewById<TextView>(R.id.tv_name_home)
        val tvEmail = findViewById<TextView>(R.id.tv_email_home)
        val tvMajor = findViewById<TextView>(R.id.tv_major_home)
        val tvSemester = findViewById<TextView>(R.id.tv_semester_home)

        tvName.text = "Nama : $nama"
        tvEmail.text = "Email : $email"
        tvMajor.text = "Jurusan : $major"
        tvSemester.text = "Semester : $semester"
    }
}
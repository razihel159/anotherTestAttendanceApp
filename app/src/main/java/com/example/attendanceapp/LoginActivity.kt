package com.example.attendanceapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.btnStudentLogin).setOnClickListener {
            startActivity(Intent(this, StudentDashboardActivity::class.java))
        }

        findViewById<Button>(R.id.btnTeacherLogin).setOnClickListener {
            startActivity(Intent(this, TeacherDashboardActivity::class.java))
        }

        findViewById<Button>(R.id.btnParentLogin).setOnClickListener {
            startActivity(Intent(this, ParentDashboardActivity::class.java))
        }
    }
}


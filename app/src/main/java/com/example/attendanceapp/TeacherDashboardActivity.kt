package com.example.attendanceapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TeacherDashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher_dashboard)

        findViewById<Button>(R.id.btnViewStudentList).setOnClickListener {
            // TODO: Implement student list view
            Toast.makeText(this, "Student list view not implemented yet", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnAddStudent).setOnClickListener {
            // TODO: Implement add student functionality
            Toast.makeText(this, "Add student functionality not implemented yet", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnSendMessage).setOnClickListener {
            // TODO: Implement message sending functionality
            Toast.makeText(this, "Message sent to parents", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnGenerateReport).setOnClickListener {
            // TODO: Implement report generation
            Toast.makeText(this, "Attendance report generated", Toast.LENGTH_SHORT).show()
        }
    }
}


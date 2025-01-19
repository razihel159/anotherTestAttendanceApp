package com.example.attendanceapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class StudentDashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_dashboard)

        findViewById<Button>(R.id.btnActivateGPS).setOnClickListener {
            // Simulate GPS activation
            Toast.makeText(this, "GPS activated", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnViewCalendar).setOnClickListener {
            // TODO: Implement calendar view
            Toast.makeText(this, "Calendar view not implemented yet", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnSubmitAbsenceRequest).setOnClickListener {
            // TODO: Implement absence request submission
            Toast.makeText(this, "Absence request submitted", Toast.LENGTH_SHORT).show()
        }
    }
}


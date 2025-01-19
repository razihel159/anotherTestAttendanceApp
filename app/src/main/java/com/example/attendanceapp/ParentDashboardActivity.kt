package com.example.attendanceapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ParentDashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parent_dashboard)

        findViewById<Button>(R.id.btnViewCalendar).setOnClickListener {
            // TODO: Implement calendar view
            Toast.makeText(this, "Calendar view not implemented yet", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnViewMessages).setOnClickListener {
            // TODO: Implement message view
            Toast.makeText(this, "Message view not implemented yet", Toast.LENGTH_SHORT).show()
        }

        // Simulate push notification
        Toast.makeText(this, "Push Notification: Your child has arrived at school", Toast.LENGTH_LONG).show()
    }
}


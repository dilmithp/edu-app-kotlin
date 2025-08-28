package com.sadeesha.platform.classroomappui

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class Settings : AppCompatActivity() {

    private lateinit var lst: ListView
    private val name = arrayOf(
        "About Classroom App", "Rate Me", "Refer Classroom App To Your Friend",
        "Email Your Feedback", "Report a bug"
    )
    private val num = arrayOf(
        "Version 1.0", "Application", "Share this app with friends",
        "Tell me your suggestions", "Tell me if you found any problem"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        lst = findViewById(R.id.listView)
        val adapter = CustomAdapterSetting(this, name, num)
        lst.adapter = adapter
    }
}
package com.sadeesha.platform.classroomappui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView

class Settings : AppCompatActivity() {
    // Changed from ListView? = null to lateinit var
    private lateinit var lst: ListView
    var name: Array<String> = arrayOf(
        "About Classroom App",
        "Rate Me",
        "Refer Classroom App To Your Friend",
        "Email Your Feedback",
        "Report a bug"
    )
    var num: Array<String> = arrayOf(
        "Version 1.0",
        "Application",
        "Share this app with friends",
        "Tell me your suggestions",
        "Tell me if you found any problem"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        lst = findViewById(R.id.listView)
        val adapter = CustomAdapterSetting(this, name, num)

        // No error here now
        lst.setAdapter(adapter)
    }
}
package com.sadeesha.platform.classroomappui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class SignupScreen : AppCompatActivity(), View.OnClickListener {
    // Changed from TextView? = null to lateinit var
    private lateinit var signIn: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_screen)
        signIn = findViewById(R.id.sign_in)

        // No error here now
        signIn.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.sign_in) {
            finish()
        }
    }
}
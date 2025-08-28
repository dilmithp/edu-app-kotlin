package com.sadeesha.platform.classroomappui

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignupScreen : AppCompatActivity(), View.OnClickListener {

    private lateinit var signIn: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_screen)
        signIn = findViewById(R.id.sign_in)
        signIn.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.sign_in) {
            finish()
        }
    }
}
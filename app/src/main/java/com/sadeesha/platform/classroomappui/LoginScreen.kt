package com.sadeesha.platform.classroomappui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginScreen : AppCompatActivity(), View.OnClickListener {

    private lateinit var signIn: Button
    private lateinit var signUp: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)
        signIn = findViewById(R.id.sign_in)
        signUp = findViewById(R.id.sign_up)

        signIn.setOnClickListener(this)
        signUp.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.sign_in -> startActivity(Intent(applicationContext, Home::class.java))
            R.id.sign_up -> startActivity(Intent(applicationContext, SignupScreen::class.java))
        }
    }
}
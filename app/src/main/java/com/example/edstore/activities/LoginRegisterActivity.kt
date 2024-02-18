package com.example.edstore.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.edstore.R
import com.google.firebase.FirebaseApp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actitivty_login_register)
        // Update the FirebaseApp.initializeApp line with your new google-services.json file
        FirebaseApp.initializeApp(this)

    }
}
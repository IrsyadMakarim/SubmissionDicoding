package com.example.submissiondicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AboutSection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_section)

        supportActionBar?.title = "About"
    }
}
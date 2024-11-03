package com.example.imageuploader
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_scrren)

        // Display the splash screen for 2 seconds, then navigate to MainActivity
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish() // Close the splash screen
        }, 2000) // Delay of 2 seconds
    }
}

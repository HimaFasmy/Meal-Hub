package com.example.mealhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

class splash : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {

        //hide status bar

        // Hide the status bar to display the app in full screen.
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        // Call the parent class's onCreate() method to perform the default initialization of the activity.
        super.onCreate(savedInstanceState)

        // Set the content view to the layout file for the cover page.
        setContentView(R.layout.activity_splash)

        // Hide the action bar.
        supportActionBar?.hide()

        // Use a Handler to wait for 1.5 seconds and then start the login activity.
        Handler().postDelayed({
            val intent = Intent(this@splash, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 1500)
    }
}
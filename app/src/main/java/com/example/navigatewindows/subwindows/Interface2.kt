package com.example.navigatewindows.subwindows

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.navigatewindows.MainActivity
import com.example.navigatewindows.R

class Interface2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.interface2)

        fun openInterface1(view: View){
            val intent = Intent(this, MainActivity::class.java).apply {  }
            startActivity(intent)
        }
    }
}
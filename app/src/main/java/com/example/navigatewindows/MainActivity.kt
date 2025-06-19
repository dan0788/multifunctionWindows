package com.example.navigatewindows

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.navigatewindows.subwindows.PairOrNotPairClass
import com.example.navigatewindows.subwindows.PerfectNumbersClass
import com.example.navigatewindows.subwindows.PrimeNumbersClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


    }

    fun goTo_pairornotpair_view(view: View) {
        val intent = Intent(this, PairOrNotPairClass::class.java).apply {  }
        startActivity(intent)
    }

    fun goTo_perfectnumbers_view(view: View) {
        val intent = Intent(this, PerfectNumbersClass::class.java).apply {  }
        startActivity(intent)
    }

    fun goTo_primenumbers_view(view: View) {
        val intent = Intent(this, PrimeNumbersClass::class.java).apply {  }
        startActivity(intent)
    }
}
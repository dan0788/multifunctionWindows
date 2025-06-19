package com.example.navigatewindows.subwindows

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.navigatewindows.MainActivity
import com.example.navigatewindows.R
import com.example.navigatewindows.classes.SeriesClass

class PairOrNotPairClass : AppCompatActivity() {

    private lateinit var btnResolve : Button
    private lateinit var inputEditText : EditText
    private lateinit var resultTextView : TextView
    private lateinit var seriesClass : SeriesClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.pairornotpair_view)

        btnResolve = findViewById(R.id.btnResolve1)
        inputEditText = findViewById(R.id.inputEditText1)
        resultTextView = findViewById(R.id.resultTextView1)
        seriesClass = SeriesClass()

        btnResolve.setOnClickListener(){
            resultTextView.text = "Calculando..."
            var value = inputEditText.text.toString().toInt()
            var isPairOrNot = seriesClass.isPairOrNotPair(value)
            resultTextView.text = " El número $value es $isPairOrNot"
            inputEditText.text.clear()

        }
    }

    fun returnToInicio(view: View){
        val intent = Intent(this, MainActivity::class.java).apply {  }
        startActivity(intent)
    }
}
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

class PrimeNumbersClass : AppCompatActivity() {

    private lateinit var btnResolve : Button
    private lateinit var inputEditText1 : EditText
    private lateinit var inputEditText2 : EditText
    private lateinit var resultTextView : TextView
    private lateinit var seriesClass : SeriesClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.primenumbers_view)

        btnResolve = findViewById(R.id.btnResolve2)
        inputEditText1 = findViewById(R.id.inputEditText2_1)
        inputEditText2 = findViewById(R.id.inputEditText2_2)
        resultTextView = findViewById(R.id.resultTextView2)
        seriesClass = SeriesClass()

        btnResolve.setOnClickListener(){
            resultTextView.text = "Calculando..."
            var startValue = inputEditText1.text.toString().toInt()
            var finalValue = inputEditText2.text.toString().toInt()
            var list : MutableList<Int> = seriesClass.primesNumbers(startValue, finalValue)

            resultTextView.text = " La lista de números primos desde $startValue hasta $finalValue es:\n$list"
            inputEditText1.text.clear()
            inputEditText2.text.clear()

        }
    }

    fun returnToInicio(view: View){
        val intent = Intent(this, MainActivity::class.java).apply {  }
        startActivity(intent)
    }
}
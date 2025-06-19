package com.example.navigatewindows.classes

import android.widget.EditText
import com.example.navigatewindows.interfaces.ValuesInterface

class ValuesClass : ValuesInterface {
    override fun getValueFromEditText(editText: EditText): Int {
        var editTextText = editText.toString().toInt()
        return editTextText
    }
}
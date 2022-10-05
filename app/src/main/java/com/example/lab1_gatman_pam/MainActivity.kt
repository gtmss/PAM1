package com.example.lab1_gatman_pam

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculateBtn =  findViewById<Button>(R.id.caluclateBtn)
        val weightInput = findViewById<TextView>(R.id.weightFill)
        val heightInput = findViewById<TextView>(R.id.heightFill)
        val outElementBox = findViewById<TextView>(R.id.textOut)
        val showHello = findViewById<TextView>(R.id.textOut2)


        calculateBtn.setOnClickListener{
            val weight = weightInput.text.toString().toDouble()
            val height = heightInput.text.toString().toDouble() / 100
            val result = weight / height.pow(2)

            outElementBox.text = (Math.round(result * 100.0) / 100.0).toString()
            showHello.text = "Hello"

//          /^  if (result < 18.5) {
//                outElementBox.text = "Underweight"
//
//            } else if (result < 25) {
//                outElementBox.text = "Normal"
//
//            } else if (result < 30) {
//                outElementBox.text = "Overweight"
//
//            } else if (result < 35) {
//                outElementBox.text = "Obese"
//
//            } else {
//                outElementBox.text = "Extremely obese"
////            } */

        }
    }
}
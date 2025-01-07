package com.learnkotlin.calcikotlin

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() , OnClickListener {

    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var tvResult : TextView
    lateinit var btnAddition : Button
    lateinit var btnSub : Button
    lateinit var btnMul : Button
    lateinit var btnDiv : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        tvResult = findViewById(R.id.tvResult)
        btnAddition = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnMul = findViewById(R.id.btnMulti)
        btnDiv = findViewById(R.id.btnDiv)


    }


    override fun onClick(v: View?) {

        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){

            R.id.btnAdd -> {
                result = a + b
            }
            R.id.btnSub -> {
                result = a - b
            }
            R.id.btnMulti -> {
                result = a * b
            }
            R.id.btnDiv -> {
                result = a / b
            }
        }

        tvResult.setText("Result is $result")
    }
}
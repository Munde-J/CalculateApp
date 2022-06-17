package dev.jojo.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class CalculatorApplication : AppCompatActivity() {
    lateinit var btnAddition: Button
    lateinit var btnSubtraction: Button
    lateinit var btnDivision: Button
    lateinit var btnModulus: Button
    lateinit var etNumber1: EditText
    lateinit var etNumber2: EditText
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_application)

        btnAddition = findViewById(R.id.btnAddition)
        btnSubtraction = findViewById(R.id.btnSubtraction)
        btnDivision = findViewById(R.id.btnDivision)
        btnModulus = findViewById(R.id.btnModulus)
        etNumber1 = findViewById(R.id.etNumber1)
        etNumber2 = findViewById(R.id.etNumber2)

        tvResult = findViewById(R.id.tvResult)

        btnAddition.setOnClickListener {
            val number1 = etNumber1.toString().toDouble()
            val number2 = etNumber2.toString().toDouble()
            addition(number1, number2)


        }
        btnSubtraction.setOnClickListener {
            val number1 = etNumber1.text.toString().toDouble()
            val number2 = etNumber2.text.toString().toDouble()
            subtraction(number1, number2)
        }
        btnDivision.setOnClickListener {
            val number1 = etNumber1.text.toString().toDouble()
            val number2 = etNumber2.text.toString().toDouble()
            division(number1, number2)
        }
        btnModulus.setOnClickListener {
            val number1 = etNumber1.text.toString().toDouble()
            val number2 = etNumber2.text.toString().toDouble()
            modulus(number1, number2)

        }

    }

    fun addition(Number1: Double, Number2:Double) {
        var add = Number1 + Number2
        tvResult.text = add.toString()
    }

    fun subtraction(Number1:Double, Number2:Double) {
        var add = Number1 - Number2
        tvResult.text = add.toString()
    }

    fun division(Number1:Double, Number2:Double) {
        var add = Number1 / Number2
        tvResult.text = add.toString()
    }

    fun modulus(Number1:Double, Number2:Double) {
        var add = Number1 % Number2
        tvResult.text = add.toString()
    }
}









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


    lateinit var tilNumber1: TextInputLayout
    lateinit var tilNumber2: TextInputLayout
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_application)

        btnAddition = findViewById(R.id.btnAddition)
        btnSubtraction = findViewById(R.id.btnSubtraction)
        btnDivision = findViewById(R.id.btnDivision)
        btnModulus = findViewById(R.id.btnModulus)

        tilNumber1 = findViewById(R.id.tilNumber1)
        tilNumber2 = findViewById(R.id.tilNumber2)
        etNumber1 = findViewById(R.id.etNumber1)
        etNumber2 = findViewById(R.id.etNumber2)

        tvResult = findViewById(R.id.tvResult)

        btnAddition.setOnClickListener {
            val number1 = tilNumber1.toString().toDouble()
            val number2 = tilNumber2.toString().toDouble()
            addition(number1, number2)


        }
        btnSubtraction.setOnClickListener {
            val number1 = tilNumber1.toString().toDouble()
            val number2 = tilNumber2.toString().toDouble()
            subtraction(number1, number2)
        }
        btnDivision.setOnClickListener {
            val number1 = tilNumber1.toString().toDouble()
            val number2 = tilNumber2.toString().toDouble()
            division(number1, number2)
        }
        btnModulus.setOnClickListener {
            val number1 = tilNumber1.toString().toDouble()
            val number2 = tilNumber2.toString().toDouble()
            modulus(number1, number2)

        }

    }

    fun addition(Number1: Double, Number2:Double) {
        var add = Number1 + Number2
        tvResult.text = add.toString()
    }

    fun subtraction(Number:Double, Number2:Double) {
        var subtract = Number - Number2
        tvResult.text = subtract.toString()
    }

    fun division(Number:Double, Number2:Double) {
        var divide = Number / Number2
        tvResult.text = divide.toString()
    }

    fun modulus(Number:Double, Number2:Double) {
        var modulus = Number % Number2
        tvResult.text = modulus.toString()
    }
}









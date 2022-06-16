package dev.jojo.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class CalculatorApplication : AppCompatActivity() {
     lateinit var btnAddition: Button
     lateinit var btnSubtraction: Button
     lateinit var btnDivision: Button
     lateinit var btnModulus: Button


     lateinit var tilNumber1:TextInputLayout
     lateinit var tilNumber2:TextInputLayout
     lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_application)

        btnAddition = findViewById(R.id.btnAddition)
        btnSubtraction = findViewById(R.id.btnSubtraction)
        btnDivision = findViewById(R.id.btnDivision)
        btnModulus = findViewById(R.id.btnModulus)

        tilNumber1= findViewById(R.id.tilNumber1)
        tilNumber2= findViewById(R.id.tilNumber2)

        tvResult = findViewById(R.id.tvResult)

        btnAddition.setOnClickListener {
            val Number1 = tilNumber1.toString()
            val Number2 = tilNumber2.toString()


        }
    }

    fun addition(Number1:Int,Number2:Int){
        var add = Number1 + Number2
        tvResult.text = add.toString()
    }

    fun subtraction(Number:Int,Number2:Int){
        var subtract = Number - Number2
        tvResult.text = subtract.toString()
    }

    fun Division(Number:Int,Number2:Int){
        var divide = Number / Number2
        tvResult.text = divide.toString()
    }

    fun modulus(Number:Int,Number2:Int){
        var modulus = Number % Number2
        tvResult.text = modulus.toString()
    }

}



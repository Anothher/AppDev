package com.anotherdev.appdev.androiddev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.anotherdev.appdev.R
import com.anotherdev.appdev.androiddev.firstapp.FirstAppActivity
import imccalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnImcApp = findViewById<Button>(R.id.IMCApp)
        btnSaludApp.setOnClickListener{navigateToSalidApp()}
        btnImcApp.setOnClickListener { navigateToImcApp() }

    }

    private fun navigateToImcApp() {
    val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSalidApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}
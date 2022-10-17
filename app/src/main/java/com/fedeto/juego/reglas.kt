package com.fedeto.juego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class reglas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reglas)

        val volver = findViewById<Button>(R.id.volver)

        volver.setOnClickListener {
            val eli = Intent(this, MainActivity::class.java)
            startActivity(eli)
        }
    }
}
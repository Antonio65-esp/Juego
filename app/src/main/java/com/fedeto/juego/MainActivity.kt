package com.fedeto.juego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jugarBoton = findViewById<Button>(R.id.jugar)
        val reglasBoton = findViewById<Button>(R.id.reglas)

        jugarBoton.setOnClickListener{
            val eli = Intent(this, elige::class.java)
            startActivity(eli)
        }

        reglasBoton.setOnClickListener{
            startActivity(Intent(this, reglas::class.java))
        }
    }
}
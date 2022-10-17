package com.fedeto.juego

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class ganar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ganar)

        val boton = findViewById<Button>(R.id.volverJugar)
        var cartel = findViewById<TextView>(R.id.cartel)
        val s = MediaPlayer.create(this, R.raw.ganar)
        val petate = intent.extras
        var eleccionMaquina = petate?.getString("ganar")

        s.start()
        Toast.makeText(this, "Has ganado, la maquina ha escogido $eleccionMaquina", Toast.LENGTH_LONG).show()

        boton.setOnClickListener {
            val eli = Intent(this, elige::class.java)
            startActivity(eli)
        }
    }
}
package com.fedeto.juego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class elige : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elige)

        val piedra = findViewById<ImageButton>(R.id.piedra)
        val tijera = findViewById<ImageButton>(R.id.tijera)
        val papel = findViewById<ImageButton>(R.id.papel)
        val spock = findViewById<ImageButton>(R.id.spok)
        val lagarto = findViewById<ImageButton>(R.id.lagarto)
        var pc = arrayOf("piedra","tijera","papel","spock","lagarto").random()

        fun ganaUsuario(){
            val intent1 = Intent(this, ganar::class.java)
            startActivity(intent1.putExtra("ganar",pc))
        }
        fun ganaPc(){
            Toast.makeText(this, "Ha ganado PC con $pc", Toast.LENGTH_LONG).show()
        }
        fun empate(){
            Toast.makeText(this, "Empate con $pc", Toast.LENGTH_LONG).show()
        }

            piedra.setOnClickListener {
                if (pc == "tijera") {
                    ganaUsuario()
                } else if (pc == "papel") {
                    ganaPc()
                } else if (pc == "spock") {
                    ganaPc()
                } else if (pc == "lagarto") {
                    ganaUsuario()
                } else {
                    empate()
                }
            }
            tijera.setOnClickListener {
                if (pc == "piedra") {
                    ganaPc()
                } else if (pc == "papel") {
                    ganaUsuario()
                } else if (pc == "spock") {
                    ganaPc()
                } else if (pc == "lagarto") {
                    ganaUsuario()
                } else {
                    empate()
                }
            }
            papel.setOnClickListener {
                if (pc == "piedra") {
                    ganaUsuario()
                } else if (pc == "tijera") {
                    ganaPc()
                } else if (pc == "spock") {
                    ganaUsuario()
                } else if (pc == "lagarto") {
                    ganaPc()
                } else {
                    empate()
                }
            }
            lagarto.setOnClickListener {
                if (pc == "piedra") {
                    ganaPc()
                } else if (pc == "tijera") {
                    ganaPc()
                } else if (pc == "spock") {
                    ganaUsuario()
                } else if (pc == "papel") {
                    ganaUsuario()
                } else {
                    empate()
                }
            }
            spock.setOnClickListener {
                if (pc == "piedra") {
                    ganaUsuario()
                } else if (pc == "tijera") {
                    ganaUsuario()
                } else if (pc == "lagarto") {
                    ganaUsuario()
                } else if (pc == "papel") {
                    ganaPc()
                } else {
                    empate()
                }
            }
    }
}
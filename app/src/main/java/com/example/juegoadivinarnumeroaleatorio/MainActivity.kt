package com.example.juegoadivinarnumeroaleatorio

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val numeroIntroducido: EditText = findViewById(R.id.entradaValor)
        val miBoton: Button = findViewById(R.id.button)
        val mensajeSalida : TextView = findViewById(R.id.salidaMensaje)

        var numeroAleatorio = Random.nextInt(1, 101)

        var intentos:Int = 0

        miBoton.setOnClickListener {
            intentos++

            val valorIntroducido = numeroIntroducido.text.toString().toInt()

            if(numeroAleatorio<valorIntroducido) mensajeSalida.text="Mas bajo"
            else if(numeroAleatorio>valorIntroducido) mensajeSalida.text="Mas alto"
            else mensajeSalida.text="Correcto!!!, te tomó " + intentos + " intentos."
        }
    }
}
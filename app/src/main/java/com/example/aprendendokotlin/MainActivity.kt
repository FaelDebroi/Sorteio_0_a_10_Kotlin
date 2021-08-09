package com.example.aprendendokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun Sortearnumero(view: View){

        var texto = findViewById(R.id.textoExibicao) as TextView

        var numerosorteado = Random().nextInt(11)

        texto.setText("numero sorteado é: $numerosorteado" )




    }


}
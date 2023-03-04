package com.example.primerparcial_uno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

private fun TextView.setOnClickListener(mainActivity: MainActivity, function: () -> Unit) {

}

class MainActivity : AppCompatActivity() {

    private lateinit var spHorarios: Spinner
    private lateinit var bnComprar: Button
    private lateinit var tvPiePagina: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bnComprar = findViewById(R.id.bnComprar)
        spHorarios.setOnItemSelectedListener(this)
        tvPiePagina = findViewById(R.id.tvPieDePagina)

        tvPiePagina.setOnClickListener(this){
            finish()
        }

        bnComprar.setOnClickListener(this){
        }

    }
}

private fun Spinner.setOnItemSelectedListener(mainActivity: MainActivity) {
    TODO("Not yet implemented")
}

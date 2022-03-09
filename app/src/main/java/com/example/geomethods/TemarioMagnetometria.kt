package com.example.geomethods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView

class TemarioMagnetometria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temario_magnetometria)


        val tema1 = TemarioCustom(
                "TEMA 1 - ¿Qué datos se necesitan para las correcciones magnetométricas?",
            R.drawable.fig1_magne
        )

        val tema2 = TemarioCustom(
            "TEMA 2 - F lineal y variación del campo externo",
            R.drawable.fig2_magne
        )

        val tema3 = TemarioCustom(
            "TEMA 3 - Introducción a las correcciones magnetométricas",
            R.drawable.fig3_magne
        )

        val tema4 = TemarioCustom(
            "TEMA 4 - Corrección por variación diurna",
            R.drawable.fig4_magne,
        )

        val tema5 = TemarioCustom(
            "TEMA 5 - Corrección por IGRF",
            R.drawable.fig5_magne,
        )

        val tema6 = TemarioCustom(
            "TEMA 6 - Interpolación espacial en Surfer",
            R.drawable.fig6_magne,
        )

        // Adapter que hace sentido a la lista

        val temario = listOf(tema1,tema2,tema3,tema4,tema5,tema6)

        val listViewMagne = findViewById<View>(R.id.listViewMagne) as ListView

        val adapter = TemarioAdapter(this,temario)
        listViewMagne.adapter = adapter

        // Click listener que actua para la lista

        listViewMagne.setOnItemClickListener { adapterView, view, position, id ->
            val intent = Intent(this,DetalleTema::class.java)
            intent.putExtra("tema", temario[position])
            startActivity(intent)
        }
    }
}

package com.example.geomethods
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView


class TemarioGravimetria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temario_gravimetria)

        val tema1 = TemarioCustom(
            "TEMA 1 - ¿Qué datos se necesitan para las correcciones gravimétricas?",
            R.drawable.fig01_gravi
        )

        val tema2 = TemarioCustom(
            "TEMA 2 - Introducción a las correcciones gravimétricas",
            R.drawable.fig2_gravi
        )

        val tema3 = TemarioCustom(
            "TEMA 3 - Gravedad teórica por la fórmula de Somigliana",
            R.drawable.fig3_gravi
        )

        val tema4 = TemarioCustom(
            "TEMA 4 - Altura elipsoidal",
            R.drawable.fig4_gravi
        )

        val tema5 = TemarioCustom(
            "TEMA 5 - Corrección por Aire Libre",
            R.drawable.fig5_gravi
        )

        val tema6 = TemarioCustom(
            "TEMA 6 - Corrección de Bouguer",
            R.drawable.fig6_gravi
        )

        val tema7 = TemarioCustom(
            "TEMA 7 - Anomalía de Gravedad",
            R.drawable.fig7_gravi
        )

        val tema8 = TemarioCustom(
            "TEMA 8 - Anomalía de Aire Libre",
            R.drawable.fig8_gravi
        )

        val tema9 = TemarioCustom(
            "TEMA 9 - Anomalía de Bouguer relativa simple",
            R.drawable.fig9_gravi
        )

        val tema10 = TemarioCustom(
            "TEMA 10 - Interpolación espacial en Surfer",
            R.drawable.fig10_gravi
        )


        val temario = listOf(tema1,tema2,tema3,tema4,tema5,tema6,tema7,tema8,tema9, tema10)

        val listViewGrav = findViewById<View>(R.id.listViewGrav) as ListView

        val adapter = TemarioAdapter(this,temario)
        listViewGrav.adapter = adapter

        listViewGrav.setOnItemClickListener { adapterView, view, position, id ->
            val intent = Intent(this,DetalleTema::class.java)
            intent.putExtra("tema", temario[position])
            startActivity(intent)
        }
    }
}
package com.example.geomethods

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detalle_tema.*


class DetalleTema : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_tema)

        val tema = intent.getSerializableExtra("tema") as TemarioCustom

        detalle_titulo.text = tema.titulo
        detalle_imagen1.setImageResource(tema.imagen1)

    }

}


package com.example.geomethods

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {



    private val itemTitles = arrayOf(
        "Procesamiento de datos gravimétricos",
        "Procesamiento de datos magnetométricos",
        "Calculadora de correcciones",
        "Manual de usuario"
    )
    private val itemDetails = arrayOf(
        "La filtración de los efectos indeseables de la gravedad medida comienza el procesado de los datos gravimétricos.",
        "El depurado del ruido magnético en los datos crudos comienza el procesado de la información medida.",
        "Una calculadora sencilla de correcciones gravimétricas y magnéticas, aun en desarrollo.",
        "Más información a cerca del proyecto y cómo puedes participar en el."
    )
    private val itemImages = intArrayOf(
        R.drawable.gravity_anomalies,
        R.drawable.modelo_magnetico,
        R.drawable.procesado_datos,
        R.drawable.manual
    )

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var image : ImageView
        var textTitle : TextView
        var textDes : TextView

        init {
            image = itemView.findViewById(R.id.item_image)
            textTitle = itemView.findViewById(R.id.item_title)
            textDes = itemView.findViewById(R.id.item_details)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_model, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textTitle.text = itemTitles[position]
        holder.textDes.text = itemDetails[position]
        holder.image.setImageResource(itemImages[position])

        holder.itemView.setOnClickListener { v : View ->
            if(itemTitles[position] == "Procesamiento de datos gravimétricos"){

                val intent = Intent(v.context,TemarioGravimetria::class.java)
                v.context.startActivity(intent)

            } else if(itemTitles[position] == "Procesamiento de datos magnetométricos"){

               // Toast.makeText(v.context, "Clickeaste en el item 2", Toast.LENGTH_SHORT).show()
                val intent = Intent(v.context,TemarioMagnetometria::class.java)
                v.context.startActivity(intent)

            } else if(itemTitles[position] == "Calculadora de correcciones"){

                Toast.makeText(v.context, "Aun en desarrollo...", Toast.LENGTH_SHORT).show()

            } else {
                val intent = Intent(v.context,Faq::class.java)
                v.context.startActivity(intent)

               // Toast.makeText(v.context, "Clickeaste en el item 4", Toast.LENGTH_SHORT).show()

            }

        }

    }

    override fun getItemCount(): Int {
        return itemTitles.size
    }



}

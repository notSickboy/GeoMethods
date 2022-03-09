package com.example.geomethods

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.temario_model.view.*

class TemarioAdapter(private val mContext: Context, private val temario:List<TemarioCustom>) : ArrayAdapter<TemarioCustom>(mContext,0,temario){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View{
        val layout = LayoutInflater.from(mContext).inflate(R.layout.temario_model, parent, false)

        val tema = temario[position]

        layout.titulo_tema.text = tema.titulo

        return layout
    }
}


package br.com.projetocarro

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class ConsoleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun gerenciarViewHolder(console:Console){

        var textMarca = itemView.findViewById<TextView>(R.id.layout_viewHolder_console_marca)
        var textModelo = itemView.findViewById<TextView>(R.id.layout_viewHolder_console_modelo)
        var textDescricao = itemView.findViewById<TextView>(R.id.layout_viewHolder_console_descricao)
        var textPreco = itemView.findViewById<TextView>(R.id.layout_viewHolder_console_preco)
        var imageView = itemView.findViewById<ImageView>(R.id.layout_viewHolder_console_image)

        textMarca.text = console.marca
        textModelo.text = console.modelo
        textDescricao.text = console.descricao
        textPreco.text = console.preco
        imageView.setImageDrawable(ContextCompat.getDrawable(imageView.context, console.idResourceImage))
    }
}
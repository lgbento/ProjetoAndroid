package br.com.projetocarro

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun gerenciarViewHolder(carro:Carro){

        var textMarca = itemView.findViewById<TextView>(R.id.layout_viewHolder_carro_marca)
        var textModelo = itemView.findViewById<TextView>(R.id.layout_viewHolder_carro_modelo)
        var textDescricao = itemView.findViewById<TextView>(R.id.layout_viewHolder_carro_descricao)
        var textPreco = itemView.findViewById<TextView>(R.id.layout_viewHolder_carro_preco)

        textMarca.text = carro.marca
        textModelo.text = carro.modelo
        textDescricao.text = carro.descricao
        textPreco.text = carro.preco
    }
}
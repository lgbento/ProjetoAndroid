package br.com.projetocarro

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CarrosAdapter(var carros:List<Carro>, var context: Context) : RecyclerView.Adapter<CarroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarroViewHolder {
        var viewHolder = LayoutInflater.from(context).inflate(R.layout.layout_view_holder_carro, parent, false)
        return CarroViewHolder(viewHolder)
    }

    override fun getItemCount(): Int {
        return carros.size
    }

    override fun onBindViewHolder(holder: CarroViewHolder, position: Int) {
        var carro = carros.get(position)
        holder.gerenciarViewHolder(carro)
    }
}
package br.com.projetocarro

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ConsoleAdapter(var consoles:List<Console>, var context: Context) : RecyclerView.Adapter<ConsoleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConsoleViewHolder {
        var viewHolder = LayoutInflater.from(context).inflate(R.layout.layout_view_holder_console, parent, false)
        return ConsoleViewHolder(viewHolder)
    }

    override fun getItemCount(): Int {
        return consoles.size
    }

    override fun onBindViewHolder(holder: ConsoleViewHolder, position: Int) {
        var console = consoles.get(position)
        holder.gerenciarViewHolder(console)
    }
}
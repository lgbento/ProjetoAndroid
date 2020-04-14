package br.com.projetocarro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recycleViewConsoles : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleViewConsoles = findViewById(R.id.activity_main_recycle_view_consoles)

        var consoles = ArrayList<Console>()
        consoles.add(Console("Microsoft", "Modelo: Xbox 360", "Preço:130.000",  "Desc:Carro Top de linha", R.drawable.xbox360))
        consoles.add(Console("Microsoft", "Modelo: Xbox One", "Preço: 120.000",  "Desc: Completa de tudo", R.drawable.xboxone))
        consoles.add(Console("Microsoft", "Modelo: Xbox One X", "Preço: 140.000",  "Desc: Tração nas 4 rodas", R.drawable.xboxonex))
        consoles.add(Console("Sony", "Modelo: Playstation 3", "Preço: 160.000",  "Desc: Cabine estendida", R.drawable.playstation3))
        consoles.add(Console("Sony", "Modelo: Playstation 4", "Preço: 135.000",  "Desc: Modelo 2021", R.drawable.playstation4))
        consoles.add(Console("Sony", "Modelo: Playstation 4", "Preço:130.000",  "Desc:Carro Top de linha", R.drawable.playstation4pro))
        consoles.add(Console("Nintendo", "Modelo: Nintendo 3DS", "Preço: 120.000",  "Desc: Completa de tudo", R.drawable.nintendo3ds))
        consoles.add(Console("Nintendo", "Modelo: Nintendo Wii U", "Preço: 140.000",  "Desc: Tração nas 4 rodas", R.drawable.wiiu))
        consoles.add(Console("Nintendo", "Modelo: Nintendo Switch", "Preço: 160.000",  "Desc: Cabine estendida", R.drawable.nintendoswitch))

        var consolesAdapter = ConsoleAdapter(consoles, this)
        recycleViewConsoles.adapter = consolesAdapter

        var layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycleViewConsoles.layoutManager = layoutManager

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId;
        if (id == R.id.sobre_action){
            Toast.makeText(this, "Nome do criador", Toast.LENGTH_SHORT).show()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}

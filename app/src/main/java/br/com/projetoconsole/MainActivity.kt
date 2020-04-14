package br.com.projetoconsole

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
        consoles.add(Console("Microsoft", "Modelo: Xbox 360", "Preço: R$ 600,00",  "Desc: Memória GDDR3 512MB 250GB", R.drawable.xbox360))
        consoles.add(Console("Microsoft", "Modelo: Xbox One", "Preço: R$ 1.300,00",  "Desc: Memória DDR3 8GBB 500GB", R.drawable.xboxone))
        consoles.add(Console("Microsoft", "Modelo: Xbox One X", "Preço: R$ 2.900,00",  "Desc: Memória GDDR5 12GB 1TB", R.drawable.xboxonex))
        consoles.add(Console("Sony", "Modelo: Playstation 3", "Preço:  R$ 600,00",  "Desc: Memória GDDR3 512MB 250GB", R.drawable.playstation3))
        consoles.add(Console("Sony", "Modelo: Playstation 4", "Preço: R$ 1.300,00",  "Desc: Memória GDDR5 8GB 500GB", R.drawable.playstation4))
        consoles.add(Console("Sony", "Modelo: Playstation 4", "Preço: R$ 2.900,00",  "Desc: Memória GDDR5 8GB 1TB", R.drawable.playstation4pro))
        consoles.add(Console("Nintendo", "Modelo: Nintendo 3DS", "Preço: R$ 950,00",  "Desc: Tela Superior LCD widescreen 3D ...", R.drawable.nintendo3ds))
        consoles.add(Console("Nintendo", "Modelo: Nintendo Wii U", "Preço: R$ 1.300,00",  "Desc: Memória DDR3 1GB 32GB", R.drawable.wiiu))
        consoles.add(Console("Nintendo", "Modelo: Nintendo Switch", "Preço: R$ 2.900,00",  "Desc: Memória LPDDR4 4GB 32GB", R.drawable.nintendoswitch))

        var consolesAdapter = ConsoleAdapter(consoles, this)
        recycleViewConsoles.adapter = consolesAdapter

        var layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycleViewConsoles.layoutManager = layoutManager

        supportActionBar?.setDisplayHomeAsUpEnabled(true);
        supportActionBar?.setDisplayUseLogoEnabled(true);
        //supportActionBar?.setLogo(R.mipmap.ic_launcher);
        supportActionBar?.title = "Lista de Consoles";
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu);
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.sobre_action ->{
                Toast.makeText(MainActivity@this , "Sobre", Toast. LENGTH_LONG ).show();
            }
        }

        return super.onOptionsItemSelected(item)
        /*val id = item.itemId;
        if (id == R.id.sobre_action){
            Toast.makeText(this, "Nome do criador", Toast.LENGTH_SHORT).show()
            return true
        }
        return super.onOptionsItemSelected(item)*/
    }

}

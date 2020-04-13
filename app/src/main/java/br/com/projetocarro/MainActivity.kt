package br.com.projetocarro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recycleViewCarros : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleViewCarros = findViewById(R.id.activity_main_recycle_view_carros)

        var carros = ArrayList<Carro>()
        carros.add(Carro("Renaut", "Modelo: Captur", "Preço:130.000",  "Desc:Carro Top de linha"))
        carros.add(Carro("Ford", "Modelo: Ecosport", "Preço: 120.000",  "Desc: Completa de tudo"))
        carros.add(Carro("VolksWagen", "Modelo: Amarock", "Preço: 140.000",  "Desc: Tração nas 4 rodas"))
        carros.add(Carro("Toyota", "Modelo: Hilux", "Preço: 160.000",  "Desc: Cabine estendida"))
        carros.add(Carro("Chevrolet", "Modelo: S10", "Preço: 135.000",  "Desc: Modelo 2021"))
        carros.add(Carro("Renaut", "Modelo: Captur", "Preço:130.000",  "Desc:Carro Top de linha"))
        carros.add(Carro("Ford", "Modelo: Ecosport", "Preço: 120.000",  "Desc: Completa de tudo"))
        carros.add(Carro("VolksWagen", "Modelo: Amarock", "Preço: 140.000",  "Desc: Tração nas 4 rodas"))
        carros.add(Carro("Toyota", "Modelo: Hilux", "Preço: 160.000",  "Desc: Cabine estendida"))
        carros.add(Carro("Chevrolet", "Modelo: S10", "Preço: 135.000",  "Desc: Modelo 2021"))

        var carrosAdapter = CarrosAdapter(carros, this)
        recycleViewCarros.adapter = carrosAdapter

        var layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycleViewCarros.layoutManager = layoutManager

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

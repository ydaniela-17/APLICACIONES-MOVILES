package com.example.listadinamicaheroes

import android.content.Context
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listadinamicaheroes.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), OnClickListener {

    private lateinit var heroeAdapter:HeroeAdapter
    private lateinit var linearLayoutManager:RecyclerView.LayoutManager
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val preferences = getPreferences(Context.MODE_PRIVATE)
        val isFirtTime = preferences.getBoolean(getString(R.string.spFirtTime),true)

        if(isFirtTime){
            val dialogView = layoutInflater.inflate(R.layout.dialog_register,null)
            MaterialAlertDialogBuilder(this)
                .setView(dialogView)
                .setCancelable(false)
                .setPositiveButton(R.string.confirm_dialog,{dialogInterface, i_->
                    val userName = dialogView.findViewById<EditText>(R.id.etUserName).text.toString()
                    with(preferences.edit()){
                        putBoolean(getString(R.string.spFirtTime),false)
                        putString(getString(R.string.spUserName),userName)
                            .apply()
                    }
                    Toast.makeText(this, "Registro Exitoso", Toast.LENGTH_SHORT).show()
                })
                .show()
        }else{
            val userName = preferences.getString(getString(R.string.spUserName),getString(R.string.userDefaul))
            Toast.makeText(this, "Bienvenido $userName", Toast.LENGTH_SHORT).show()
        }

        heroeAdapter = HeroeAdapter(getHeroes(), this)
        linearLayoutManager = LinearLayoutManager(this)

        viewBinding.rvListaHeroes.apply {
            layoutManager = linearLayoutManager
            adapter = heroeAdapter
        }
    }

    private fun getHeroes():MutableList<Heroe>{
        val heroes = mutableListOf<Heroe>()

        val ironMan = Heroe(name = "Iron Man", alterEgo = "Tony Star", url = "https://www.show.news/__export/1592352071295/sites/debate/img/2020/06/16/ironman-3_crop1592351959907.png_943222218.png")
        heroes.add(ironMan)
        val blackWidow = Heroe(name = "Black Widow", alterEgo = "Natacha Romanoff", url = "https://de10.com.mx/sites/default/files/styles/detalle_nota/public/2019/06/03/black_widow_pelicula_filtradas_p.jpg?itok=5Uy24wbw")
        heroes.add(blackWidow)
        val scarletWitch = Heroe(name = "Scarlet Witch", alterEgo = "Wanda Maximoff", url = "https://laverdadnoticias.com/__export/1611983421030/sites/laverdad/img/2021/01/30/wandavision_serie_wanda_maximoff_poderes.jpg_1347727009.jpg")
        heroes.add(scarletWitch)
        val capiAmerica = Heroe(name = "Capitán America", alterEgo = "Steve Rogers", url = "https://www.show.news/__export/1564796387615/sites/debate/img/2019/08/02/cap_crop1564796269640.jpg_943222218.jpg")
        heroes.add(capiAmerica)

        heroes.add(ironMan)
        heroes.add(blackWidow)
        heroes.add(scarletWitch)
        heroes.add(capiAmerica)
        heroes.add(ironMan)
        heroes.add(blackWidow)
        heroes.add(scarletWitch)
        heroes.add(capiAmerica)
        heroes.add(ironMan)
        heroes.add(blackWidow)
        heroes.add(scarletWitch)
        heroes.add(capiAmerica)

        return heroes
    }

    override fun onClick(heroe: Heroe) {
        Toast.makeText(this, heroe.getFullName(), Toast.LENGTH_SHORT).show()
    }
}
package com.example.listadinamicaheroes

import android.content.Context
import android.text.Layout
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.listadinamicaheroes.databinding.ItemListaBinding
import java.time.chrono.HijrahEra

class HeroeAdapter (private val dataSetHeroes: List<Heroe>, private val listener: OnClickListener) : RecyclerView.Adapter<HeroeAdapter.ViewHolder>() {

    private lateinit var context:Context

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val viewBinding = ItemListaBinding.bind(view)
        fun setListener(heroe: Heroe){
            viewBinding.root.setOnClickListener{
                listener.onClick(heroe)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.item_lista, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = dataSetHeroes.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val heroe = dataSetHeroes.get(position)
        with(holder){
            setListener(heroe)
            viewBinding.tvName.text = heroe.name
            viewBinding.tvAlterEgo.text = heroe.alterEgo
            Glide.with(context)
                    .load(heroe.url)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .centerCrop()
                    .circleCrop()
                    .into(viewBinding.ivImageHeroe)
        }
    }
}
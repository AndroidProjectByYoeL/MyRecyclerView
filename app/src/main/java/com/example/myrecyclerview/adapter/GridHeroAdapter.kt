package com.example.myrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.myrecyclerview.R
import com.example.myrecyclerview.model.Hero
import kotlinx.android.synthetic.main.item_grid_hero.view.*

class GridHeroAdapter(private val listHero: ArrayList<Hero>): RecyclerView.Adapter<GridHeroAdapter.GridViewHolder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): GridViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_grid_hero, viewGroup, false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int = listHero.size

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        holder.bind(listHero[position])
    }

    inner class GridViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(hero: Hero){
            with(itemView){
                Glide.with(itemView.context)
                        .load(hero.photo)
                        .apply(RequestOptions().override(350, 550))
                        .into(img_item_photo_grid)
            }
        }
    }

}
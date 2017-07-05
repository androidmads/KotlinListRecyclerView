package com.androidmads.kotlinlistrecyclerview.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.androidmads.kotlinlistrecyclerview.R
import com.androidmads.kotlinlistrecyclerview.models.Movies

/**
 * Created by AJ on 7/1/2017.
 */

class MoviesRecyclerAdapter(private val moviesList: List<Movies>) : RecyclerView.Adapter<MoviesRecyclerAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView = view.findViewById<TextView>(R.id.title)
        var year: TextView = view.findViewById<TextView>(R.id.year)
        var genre: TextView = view.findViewById<TextView>(R.id.genre)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.movie_list_row, parent, false)

        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val Movies = moviesList[position]
        holder.title.text = Movies.title
        holder.genre.text = Movies.genre
        holder.year.text = Movies.year
    }

    override fun getItemCount(): Int {
        return moviesList.size
    }
}
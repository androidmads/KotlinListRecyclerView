package com.androidmads.kotlinlistrecyclerview.adapters

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

import com.androidmads.kotlinlistrecyclerview.R
import com.androidmads.kotlinlistrecyclerview.models.Movies

import java.util.ArrayList

/**
 * Created by AJ on 7/1/2017.
 */

class MoviesListViewAdapter(private val activity: Activity, moviesList: List<Movies>) : BaseAdapter() {

    private var moviesList = ArrayList<Movies>()

    init {
        this.moviesList = moviesList as ArrayList<Movies>
    }

    override fun getCount(): Int {
        return moviesList.size
    }

    override fun getItem(i: Int): Any {
        return i
    }

    override fun getItemId(i: Int): Long {
        return i.toLong()
    }

    @SuppressLint("InflateParams", "ViewHolder")
    override fun getView(i: Int, convertView: View?, viewGroup: ViewGroup): View {
        var vi: View = convertView as View
        val inflater = activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        vi = inflater.inflate(R.layout.movie_list_row, null)
        val title = vi.findViewById<TextView>(R.id.title)
        val genre = vi.findViewById<TextView>(R.id.genre)
        val year = vi.findViewById<TextView>(R.id.year)
        title.text = moviesList[i].title
        genre.text = moviesList[i].genre
        year.text = moviesList[i].year
        return vi
    }
}

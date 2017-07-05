package com.androidmads.kotlinlistrecyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.androidmads.kotlinlistrecyclerview.adapters.MoviesListViewAdapter
import com.androidmads.kotlinlistrecyclerview.models.Movies
import java.util.*

/**
 * Created by AJ on 7/1/2017.
 */

class ListViewActivity : AppCompatActivity() {

    var listView: ListView? = null
    var movieList = ArrayList<Movies>()
    var adapter: MoviesListViewAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        listView = findViewById(R.id.listView) as ListView

        adapter = MoviesListViewAdapter(this, movieList)
        (listView as ListView).adapter = adapter

        prepareMovieData()

        // Click event for single list row
        (listView as ListView).onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l -> Toast.makeText(applicationContext, movieList?.get(i)?.title, Toast.LENGTH_SHORT).show() }
    }

    private fun prepareMovieData() {
        var movie = Movies("Mad Max: Fury Road", "Action & Adventure", "2015")
        movieList.add(movie)

        movie = Movies("Inside Out", "Animation, Kids & Family", "2015")
        movieList.add(movie)

        movie = Movies("Star Wars: Episode VII - The Force Awakens", "Action", "2015")
        movieList.add(movie)

        movie = Movies("Shaun the Sheep", "Animation", "2015")
        movieList.add(movie)

        movie = Movies("The Martian", "Science Fiction & Fantasy", "2015")
        movieList.add(movie)

        movie = Movies("Mission: Impossible Rogue Nation", "Action", "2015")
        movieList.add(movie)

        movie = Movies("Up", "Animation", "2009")
        movieList.add(movie)

        movie = Movies("Star Trek", "Science Fiction", "2009")
        movieList.add(movie)

        movie = Movies("The LEGO Movies", "Animation", "2014")
        movieList.add(movie)

        movie = Movies("Iron Man", "Action & Adventure", "2008")
        movieList.add(movie)

        movie = Movies("Aliens", "Science Fiction", "1986")
        movieList.add(movie)

        movie = Movies("Chicken Run", "Animation", "2000")
        movieList.add(movie)

        movie = Movies("Back to the Future", "Science Fiction", "1985")
        movieList.add(movie)

        movie = Movies("Raiders of the Lost Ark", "Action & Adventure", "1981")
        movieList.add(movie)

        movie = Movies("Goldfinger", "Action & Adventure", "1965")
        movieList.add(movie)

        movie = Movies("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014")
        movieList.add(movie)

        adapter?.notifyDataSetChanged()
    }
}

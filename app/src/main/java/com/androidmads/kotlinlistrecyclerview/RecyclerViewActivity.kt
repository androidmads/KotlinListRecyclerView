package com.androidmads.kotlinlistrecyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

import com.androidmads.kotlinlistrecyclerview.adapters.MoviesRecyclerAdapter
import com.androidmads.kotlinlistrecyclerview.models.Movies

import java.util.ArrayList

/**
 * Created by AJ on 7/1/2017.
 */

class RecyclerViewActivity : AppCompatActivity() {
    private var movieList = ArrayList<Movies>()
    private var recyclerView: RecyclerView? = null
    private var mAdapter: MoviesRecyclerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        mAdapter = MoviesRecyclerAdapter(movieList)
        val mLayoutManager = LinearLayoutManager(applicationContext)
        recyclerView!!.layoutManager = mLayoutManager
        recyclerView!!.itemAnimator = DefaultItemAnimator()
        recyclerView!!.adapter = mAdapter

        prepareMoviesData()
    }

    private fun prepareMoviesData() {
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

        mAdapter!!.notifyDataSetChanged()
    }
}

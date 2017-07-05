package com.androidmads.kotlinlistrecyclerview.models

/**
 * Created by AJ on 7/1/2017.
 */

class Movies {
    var title: String = ""
    var genre: String = ""
    var year: String = ""

    constructor() {}

    constructor(title: String, genre: String, year: String) {
        this.title = title
        this.genre = genre
        this.year = year
    }
}
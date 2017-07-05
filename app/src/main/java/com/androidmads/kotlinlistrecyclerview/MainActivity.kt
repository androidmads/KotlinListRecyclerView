package com.androidmads.kotlinlistrecyclerview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById(R.id.btnListView).setOnClickListener {
            startActivity(Intent(applicationContext, ListViewActivity::class.java))
        }

        findViewById(R.id.btnRecView).setOnClickListener {
            startActivity(Intent(applicationContext, RecyclerViewActivity::class.java))
        }
    }
}

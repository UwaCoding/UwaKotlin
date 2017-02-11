package com.uwacoding.uwakotlin

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.Toolbar
import com.uwacoding.uwakotlin.adapter.Adapter
import kotlinx.android.synthetic.main.content_main.*

/**
 * Created by Firman on 2/11/2017.
 * uwacoding.github.io
 */

class MainActivity : AppCompatActivity() {
    private val adapter by lazy {
        Adapter(Content.ITEMS) {
            Snackbar.make(fabutton, "Tap on: " + it, Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val fab = findViewById(R.id.fabutton) as FloatingActionButton
        fab.setOnClickListener {
            Snackbar.make(it, "Replace wae nya", Snackbar.LENGTH_LONG).setAction("Action",null).show()

        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter;
    }
}

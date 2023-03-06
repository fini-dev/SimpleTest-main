package org.com.testing.with.simpletest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: RVCustomAdapter

    private var viewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initLayout()
    }

    // TODO: My Method

    private fun initLayout() {
        val recyclerView = findViewById<RecyclerView>(R.id.mRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        // Let's suppose that the data is not empty here.
        adapter = RVCustomAdapter(listOf())
        recyclerView.adapter = adapter

        viewModel.data.observe(this) {
            adapter.items = it
            adapter.notifyDataSetChanged()
        }

        //
//        adapter.notifyDataSetChanged()
    }
}
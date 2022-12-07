package com.bugratoklu.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var txtList = mutableListOf<String>()
    private var imageList = mutableListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toList()


        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerAdapter(txtList,imageList)
    }
    private fun addList(desc : String, image : Int) {
        txtList.add(desc)
        imageList.add(image)
    }
    private fun toList() {
        for (i in 1..12)
            addList("description $i",R.mipmap.ic_launcher)

    }
}
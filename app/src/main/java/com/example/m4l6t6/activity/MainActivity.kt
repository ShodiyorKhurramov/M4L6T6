package com.example.m4l6t6.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.m4l6t6.R


import android.content.Context

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.m4l6t6.adapter.MainAdapter
import com.example.m4l6t6.model.Member


class MainActivity : AppCompatActivity() {

    private lateinit var context: Context
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

        refreshAdapter(prepareMemberList())

    }

    private fun initViews() {
        context = this
        recyclerView = findViewById(R.id.rv_main_recycler_view)
        recyclerView.layoutManager = GridLayoutManager(context, 1)
    }

    private fun refreshAdapter(members: List<Member>) {
        val adapter = MainAdapter(context, members)
        recyclerView.adapter = adapter
    }

    private fun prepareMemberList(): List<Member> {
        val members = ArrayList<Member>()
        for (i in 0..15) members.add(Member())
        return members
    }

}
package com.example.m5exam.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.m5exam.Adapter.HomeAdapterCtg
import com.example.m5exam.Adapter.HomeAdapterRes
import com.example.m5exam.Home.Home
import com.example.m5exam.R

class HomeActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var recyclerView1: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        initViews()
    }
    fun initViews(){
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView1 = findViewById(R.id.recyclerView1)
        recyclerView1.setLayoutManager(GridLayoutManager(this,2))

        refreshAdapterCtg(getAllChatsCtg())
        refreshAdapterRes(getAllChatsRes())

        var btn_collection = findViewById<ImageButton>(R.id.btn_collections)
        btn_collection.setOnClickListener(View.OnClickListener {
            openCollectionsActivity()
        })
        var btn_chat = findViewById<ImageButton>(R.id.btn_chat)
        btn_chat.setOnClickListener(View.OnClickListener {
            openChatActivity()
        })
        var btn_search = findViewById<ImageButton>(R.id.btn_search)
        btn_search.setOnClickListener(View.OnClickListener {
            openSearchActivity()
        })
    }

    fun refreshAdapterCtg(chats:ArrayList<Home>){
        val adapter = HomeAdapterCtg(this,chats)
        recyclerView.adapter = adapter
    }

    fun refreshAdapterRes(chats:ArrayList<Home>){
        val adapter = HomeAdapterRes(this,chats)
        recyclerView1.adapter = adapter
    }

    fun getAllChatsCtg():ArrayList<Home>{
        val items:ArrayList<Home> = ArrayList()
        items.add(Home(R.drawable.restaurant,"Restaurants"))
        items.add(Home(R.drawable.restaurant,"Restaurants"))
        items.add(Home(R.drawable.restaurant,"Restaurants"))
        items.add(Home(R.drawable.restaurant,"Restaurants"))
        items.add(Home(R.drawable.restaurant,"Restaurants"))
        items.add(Home(R.drawable.restaurant,"Restaurants"))
        return items
    }
    fun getAllChatsRes():ArrayList<Home>{
        val items:ArrayList<Home> = ArrayList()
        items.add(Home(R.drawable.hamburger,"Hamburger"))
        items.add(Home(R.drawable.hamburger,"Hamburger"))
        items.add(Home(R.drawable.hamburger,"Hamburger"))
        items.add(Home(R.drawable.hamburger,"Hamburger"))

        return items
    }

    fun openCollectionsActivity(){
        val intent = Intent(this,CollectionsActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun openChatActivity(){
        val intent = Intent(this,ChatActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun openSearchActivity(){
        val intent = Intent(this,SearchActivity::class.java)
        startActivity(intent)
        finish()
    }
}
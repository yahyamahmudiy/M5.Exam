package com.example.m5exam.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.m5exam.Adapter.CollectionsAdapter
import com.example.m5exam.Adapter.HomeAdapterCtg
import com.example.m5exam.Home.Home
import com.example.m5exam.R

class CollectionsActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collections)
        initViews()
    }

    fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this, 1))

        refreshAdapter(getAll())

        val btn_home = findViewById<ImageButton>(R.id.btn_home)
        btn_home.setOnClickListener(View.OnClickListener {
            openHomeActivity()
        })
        val btn_chat = findViewById<ImageButton>(R.id.btn_chat)
        btn_chat.setOnClickListener(View.OnClickListener {
            openChatActivity()
        })
        var btn_search = findViewById<ImageButton>(R.id.btn_search)
        btn_search.setOnClickListener(View.OnClickListener {
            openSearchActivity()
        })
    }
    fun refreshAdapter(chats:ArrayList<Home>){
        val adapter = CollectionsAdapter(this,chats)
        recyclerView.adapter = adapter
    }
    fun getAll():ArrayList<Home>{
        val items:ArrayList<Home> = ArrayList()
        items.add(Home(R.drawable.hotel,"Hotel"))
        items.add(Home(R.drawable.hotel,"Hotel"))
        items.add(Home(R.drawable.hotel,"Hotel"))
        items.add(Home(R.drawable.hotel,"Hotel"))
        items.add(Home(R.drawable.hotel,"Hotel"))
        items.add(Home(R.drawable.hotel,"Hotel"))
        return items
    }
    fun openHomeActivity(){
        val intent = Intent(this,HomeActivity::class.java)
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
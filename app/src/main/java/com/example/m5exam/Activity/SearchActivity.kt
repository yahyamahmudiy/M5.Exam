package com.example.m5exam.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.m5exam.Adapter.ChatAdapter
import com.example.m5exam.Adapter.SearchAdapter
import com.example.m5exam.Home.Home
import com.example.m5exam.R

class SearchActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

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
        val btn_collection = findViewById<ImageButton>(R.id.btn_collections)
        btn_collection.setOnClickListener(View.OnClickListener {
            openCollectionActivity()

        })
        val btn_chat = findViewById<ImageButton>(R.id.btn_chat)
        btn_chat.setOnClickListener(View.OnClickListener {
            openChatActivity()

        })
    }
    fun refreshAdapter(chats:ArrayList<Home>){
        val adapter = SearchAdapter(this,chats)
        recyclerView.adapter = adapter
    }
    fun getAll():ArrayList<Home>{
        val items:ArrayList<Home> = ArrayList()
        items.add(Home(R.drawable.img_1,"Valley Tavern"))
        items.add(Home(R.drawable.img_1,"Valley Tavern"))
        items.add(Home(R.drawable.img_1,"Valley Tavern"))
        items.add(Home(R.drawable.img_1,"Valley Tavern"))
        items.add(Home(R.drawable.img_1,"Valley Tavern"))
        items.add(Home(R.drawable.img_1,"Valley Tavern"))
        items.add(Home(R.drawable.img_1,"Valley Tavern"))
        items.add(Home(R.drawable.img_1,"Valley Tavern"))
        items.add(Home(R.drawable.img_1,"Valley Tavern"))
        return items
    }
    fun openHomeActivity(){
        val intent = Intent(this,HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun openCollectionActivity(){
        val intent = Intent(this,CollectionsActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun openChatActivity(){
        val intent = Intent(this,ChatActivity::class.java)
        startActivity(intent)
        finish()
    }
}
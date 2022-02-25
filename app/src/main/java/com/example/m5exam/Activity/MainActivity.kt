package com.example.m5exam.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.example.m5exam.Adapter.ViewPagerAdapter
import com.example.m5exam.Fragments.FirstFragment
import com.example.m5exam.Fragments.FourthFragment
import com.example.m5exam.Fragments.SecondFragment
import com.example.m5exam.Fragments.ThirdFragment
import com.example.m5exam.R

class MainActivity : AppCompatActivity() {
    var viewPagerAdapter: ViewPagerAdapter? = null
    private var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }
    fun initViews() {
            viewPager = findViewById(R.id.viewPager)
            viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
            viewPagerAdapter!!.add(FirstFragment())
            viewPagerAdapter!!.add(SecondFragment())
            viewPagerAdapter!!.add(ThirdFragment())
            viewPagerAdapter!!.add(FourthFragment())
            viewPager?.setAdapter(viewPagerAdapter)

      /*  val tv_done = findViewById<TextView>(R.id.tv_done)
        tv_done.setOnClickListener(View.OnClickListener {
            openActivity()
        }) */
    }

  /*  fun openActivity(){
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
    } */
}
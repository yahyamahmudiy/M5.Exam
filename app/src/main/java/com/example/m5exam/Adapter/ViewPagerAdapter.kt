package com.example.m5exam.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val fragments: MutableList<Fragment> = ArrayList()
    //private val fragmentTitle: MutableList<String> = ArrayList()

    fun add(fm: Fragment) {
        fragments.add(fm)
        //fragmentTitle.add(title)
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getCount(): Int {
        return fragments.size
    }

    /*override fun getPageTitle(position: Int): CharSequence {
        return fragmentTitle[position]
    }*/
}
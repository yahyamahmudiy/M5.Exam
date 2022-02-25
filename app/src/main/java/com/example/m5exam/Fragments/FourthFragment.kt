package com.example.m5exam.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.m5exam.Activity.MainActivity
import com.example.m5exam.R


class FourthFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_fourth,container,false)
        //(activity as MainActivity).openActivity()
        return view
    }

}
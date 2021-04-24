package com.nurgundogdu.hw5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_carpim.view.*
import kotlinx.android.synthetic.main.fragment_toplama.*


class CarpimSonuc : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        buttontopla.setOnClickListener()
        {
            val first:String=textView.text.toString()
            val second:String=textView2.text.toString()

            val result:Int=product(first,second)


        }

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        val tasarim=inflater.inflate(R.layout.fragment_carpim_sonuc, container, false)

        return tasarim
    }

    private fun product(first:String, second:String):Int {
        val a:Int=Integer.parseInt(first)
        val b:Int=Integer.parseInt(second)

        val topla:Int =a*b
        return topla

    }

}
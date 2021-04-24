package com.nurgundogdu.hw5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_carpim.view.*

class CarpimFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim=inflater.inflate(R.layout.fragment_carpim, container, false)
        tasarim.buttoncarpim.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.carpimSonuc)


        }
        return tasarim
    }



}
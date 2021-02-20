package com.leonardis.motionlayoutdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
    }

    private fun setupListeners() {
        button_basic.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToBasicUsage())
        }

        button_alpha.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToAlphaUsage())
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }
}
package com.leonardis.motionlayoutdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_alpha_usage.*

class AlphaUsageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_alpha_usage, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_alpha.setOnClickListener {
            if (imageView_charmander.isVisible) {
                motionLayout_alpha.transitionToEnd()
            } else {
                motionLayout_alpha.transitionToStart()
            }
        }
    }
}
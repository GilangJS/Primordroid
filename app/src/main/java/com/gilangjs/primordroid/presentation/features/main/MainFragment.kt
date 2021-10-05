package com.gilangjs.primordroid.presentation.features.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.gilangjs.primordroid.R
import com.gilangjs.primordroid.presentation.BaseFragment

class MainFragment : BaseFragment() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    companion object {
        fun newInstance() = MainFragment()
    }
}

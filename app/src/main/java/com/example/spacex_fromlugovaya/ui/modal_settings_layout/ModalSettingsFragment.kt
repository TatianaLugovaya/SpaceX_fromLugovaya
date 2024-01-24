package com.example.spacex_fromlugovaya.ui.modal_settings_layout

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.spacex_fromlugovaya.R
import com.example.spacex_fromlugovaya.databinding.FragmentModalSettingsBinding
import com.example.spacex_fromlugovaya.ui.launches_layout.LaunchesFragment

class ModalSettingsFragment : Fragment(R.layout.fragment_modal_settings) {

    private lateinit var binding: FragmentModalSettingsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentModalSettingsBinding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
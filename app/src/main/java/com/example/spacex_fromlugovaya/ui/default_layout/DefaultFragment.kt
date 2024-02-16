package com.example.spacex_fromlugovaya.ui.default_layout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.spacex_fromlugovaya.R
import com.example.spacex_fromlugovaya.databinding.FragmentDefaultBinding
import com.example.spacex_fromlugovaya.ui.launches_layout.LaunchesFragment
import com.example.spacex_fromlugovaya.ui.modal_settings_layout.ModalSettingsFragment

class DefaultFragment : Fragment(R.layout.fragment_default) {

    private lateinit var binding: FragmentDefaultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentDefaultBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding.viewLaunchesButton.setOnClickListener {
            replaceFragment(LaunchesFragment())
        }
        binding.settingsButton.setOnClickListener {
            addFragment(ModalSettingsFragment())
        }
        return binding.root;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun addFragment(fragment: Fragment) {
        val transaction: FragmentTransaction = childFragmentManager.beginTransaction()
        transaction.add(R.id.default_fragment_layout, fragment)
        transaction.commit()
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction: FragmentTransaction = childFragmentManager.beginTransaction()
        transaction.replace(R.id.default_fragment_layout, fragment)
        transaction.commit()
    }

}
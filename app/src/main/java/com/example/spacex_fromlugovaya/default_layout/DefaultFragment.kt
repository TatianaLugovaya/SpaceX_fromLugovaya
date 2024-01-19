package com.example.spacex_fromlugovaya.default_layout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.spacex_fromlugovaya.R
import com.example.spacex_fromlugovaya.databinding.FragmentDefaultBinding
import com.example.spacex_fromlugovaya.launches_layout.LaunchesFragment
import com.example.spacex_fromlugovaya.modal_settings_layout.ModalSettingsFragment

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
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewLaunchesButton.setOnClickListener {
            addFragment(LaunchesFragment())
        }

        binding.settingsButton.setOnClickListener {
            addFragment(ModalSettingsFragment())
        }
    }
    private fun addFragment(fragment: Fragment) {
        val transaction: FragmentTransaction = childFragmentManager.beginTransaction()
        transaction.add(R.id.default_fragment_layout, fragment)
        transaction.commit()
    }
}
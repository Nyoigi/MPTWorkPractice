package com.example.mptworkpractice.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mptworkpractice.databinding.FragmentInformationBinding
import com.example.mptworkpractice.databinding.FragmentMainBinding

class InformationFragment : Fragment() {

    private var binding: FragmentInformationBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInformationBinding.inflate(inflater, container, false)

        return binding?.root
    }
}
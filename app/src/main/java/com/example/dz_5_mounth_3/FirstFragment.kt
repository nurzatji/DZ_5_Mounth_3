package com.example.dz_5_mounth_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dz_5_mounth_3.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
private lateinit var binding :FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val result = arguments?.getString("key")
        if (!result.isNullOrEmpty())
            binding.tvResult.text = result.toString()
        else
            binding.tvResult.text ="hello"

    }
}
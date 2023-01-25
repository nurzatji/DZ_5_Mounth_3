package com.example.dz_5_mounth_3

import android.annotation.SuppressLint
import android.media.audiofx.DynamicsProcessing.BandBase
import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import androidx.fragment.app.FragmentContainerView
import com.example.dz_5_mounth_3.databinding.ActivityMainBinding
import com.example.dz_5_mounth_3.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private var ten: Boolean = false


    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        binding.tvResult.setText("0")
        ten = false
        return binding.root;

    }

    @SuppressLint("SuspiciousIndentation")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonClick.setOnClickListener {
            if (!ten) {
                binding.tvResult.text = (binding.tvResult.text.toString().toInt() + 1).toString()


                if (binding.tvResult.text.toString().toInt() == 10) {
                    binding.buttonClick.text = "-1"
                    ten = true
                }
            } else {
                binding.tvResult.text = (binding.tvResult.text.toString().toInt() - 1).toString()
                if (binding.tvResult.text.toString() == "0") {
                    val bandle = Bundle()
                    bandle.putString("result", binding.etString.text.toString())
                    val result = FirstFragment()
                    result.arguments = bandle

                    activity?.supportFragmentManager?.beginTransaction()
                        ?.replace(R.id.container, result)?.addToBackStack(null)?.commit()
                }
            }
        }
    }
}


//    }
//when (switch) {
//    true -> {
//        if (num != 10) {
//            num++
//            binding.tvResult.text = num.toString()
//
//        } else {
//            switch = false
//            num--
//            binding.tvResult.text = num.toString()
//        }
//    }
//
//

package com.example.dz_5_mounth_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz_5_mounth_3.databinding.ActivityMainBinding
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    private var switch = true
    private var num = 0
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
supportFragmentManager.beginTransaction().add(R.id.container,SecondFragment()).commit()
    }

}







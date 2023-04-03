package com.example.a5month2dopdz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.a5month2dopdz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var viewModel: MainViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        setupObserves()
        setupListeners()
    }

    private fun setupObserves() {
        viewModel?.number?.observe(this) {
            binding.countTxt.text = it.toString()
        }
    }

    private fun setupListeners() {
        binding.randomBtn.setOnClickListener {
            viewModel?.generateRandomNumber()
        }
    }
}
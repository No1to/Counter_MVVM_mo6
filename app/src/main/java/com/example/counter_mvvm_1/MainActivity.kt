package com.example.counter_mvvm_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.counter_mvvm_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        counterOperations()
    }

    private fun counterOperations() {
        viewModel.count.observe(this) { value ->
            binding.result.text = value.toString()
        }
        binding.decBtn.setOnClickListener {
            viewModel.decrement()
        }
        binding.incBtn.setOnClickListener {
            viewModel.increment()
        }
        binding.clearBtn.setOnClickListener {
            viewModel.reset()
        }
    }
}
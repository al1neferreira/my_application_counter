package br.com.aline.myapplicationcounter

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import br.com.aline.myapplicationcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val viewModel: MyViewModel by viewModels{MyViewModel.factory}

        binding.tvContador.text = viewModel.getContador().toString()

        binding.btnContador.setOnClickListener{

            viewModel.incrementaUm()

            binding.tvContador.text = viewModel.getContador().toString()
        }
    }
}




package com.example.aplicativotreinomusculacao.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplicativotreinomusculacao.R
import com.example.aplicativotreinomusculacao.databinding.ActivityMainBinding

class Cadastro : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar?.hide()




    }
}
package com.example.aplicativotreinomusculacao.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplicativotreinomusculacao.MainActivity
import com.example.aplicativotreinomusculacao.databinding.ActivityMainBinding

class Cadastro : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btEntrar.setOnClickListener {

            val navegarTelaInicial = Intent(this, MainActivity::class.java)
            startActivity(navegarTelaInicial)


        }

    }
}
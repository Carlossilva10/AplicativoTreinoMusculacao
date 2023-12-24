package com.example.aplicativotreinomusculacao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aplicativotreinomusculacao.databinding.ActivityMainBinding
import com.example.aplicativotreinomusculacao.view.Login

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btEntrar.setOnClickListener {

            val navegarParaLogin = Intent(this,Login::class.java)
            startActivity(navegarParaLogin)
        }
    }
}
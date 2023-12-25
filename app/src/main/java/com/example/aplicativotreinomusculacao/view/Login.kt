package com.example.aplicativotreinomusculacao.view

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.aplicativotreinomusculacao.MainActivity
import com.example.aplicativotreinomusculacao.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar


class Login : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.btEntrar.setOnClickListener {

            val nome = binding.editNomeLogin.text.toString()
            val senha = binding.editSenhaLogin.text.toString()

                when{
                nome.isEmpty() -> {
                    mensagem(it, "Coloque o seu nome!")
                }senha.isEmpty() ->{
                    mensagem(it, "Preencha a senha!")
                }senha.length <=5 -> {
                    mensagem(it, "A senha precisa ter pelo menos 6 caracteres!")
                }else -> {
                    navegarPraMain(nome)
                }

                }
            }
        }
    private  fun mensagem(view: View, mensagem: String){
        val snackbar = Snackbar.make(view, mensagem, Snackbar.LENGTH_SHORT)
        snackbar.setBackgroundTint(Color.parseColor("#FF0000"))
        snackbar.setTextColor(Color.parseColor("#FFFFFF"))
        snackbar.show()
    }

    private fun navegarPraMain(nome: String){
        val navegarTelaInicial = Intent(this, MainActivity::class.java)
        startActivity(navegarTelaInicial)
    }

    }

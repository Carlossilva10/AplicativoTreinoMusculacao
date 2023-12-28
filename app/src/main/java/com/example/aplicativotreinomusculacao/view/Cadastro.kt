package com.example.aplicativotreinomusculacao.view

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import com.example.aplicativotreinomusculacao.MainActivity
import com.example.aplicativotreinomusculacao.databinding.ActivityCadastroBinding
import com.example.aplicativotreinomusculacao.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import java.security.Principal


class Cadastro : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btSalvar.setOnClickListener {

            val nome = binding.editNome.text.toString()
            val email = binding.editNome.text.toString()
            val senha = binding.editNome.text.toString()

            when {
                nome.isEmpty() -> {
                    mensagem(it, "Preencha o Nome!")
                }
                email.isEmpty() -> {
                    mensagem(it, "Preencha o Nome!")
                }
                senha.isEmpty() -> {
                    mensagem(it, "Preencha a Senha!")
                }

                senha.length <= 5 -> {
                    val snackbar = Snackbar.make(
                        it,
                        "A senha precisa ter pelo menos 6 caracteres!",
                        Snackbar.LENGTH_SHORT
                    )
                    snackbar.show()
                }
                else -> {
                    navegarMaiActivity()
                }

            }

        }

        binding.btVoltar.setOnClickListener {

            val navegarTelaInicial= Intent(this,MainActivity::class.java)
            startActivity(navegarTelaInicial)
            finish()
        }

    }


    private fun mensagem(view: View, mensagem: String) {
        val snackbar = Snackbar.make(view, mensagem, Snackbar.LENGTH_SHORT)
        snackbar.setBackgroundTint(Color.parseColor("#FF0000"))
        snackbar.setTextColor(Color.parseColor("#FFFFFF"))
        snackbar.show()

    }


    private fun navegarMaiActivity() {
        val navegarTelaInicial = Intent(this, MainActivity::class.java)
        startActivity(navegarTelaInicial)
    }




}
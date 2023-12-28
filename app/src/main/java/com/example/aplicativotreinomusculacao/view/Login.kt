package com.example.aplicativotreinomusculacao.view

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.example.aplicativotreinomusculacao.MainActivity
import com.example.aplicativotreinomusculacao.databinding.ActivityLoginBinding
import com.example.aplicativotreinomusculacao.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import java.security.Principal


class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.btEntrar.setOnClickListener {



            val nome = binding.editNome.text.toString()
            val senha = binding.editSenha.text.toString()


            when{
                nome.isEmpty() -> {
                    mensagem(it, "Preencha o Nome!")
                }
                senha.isEmpty() -> {
                    mensagem(it, "Preencha a Senha!")
                }

                senha.length <= 5 -> {
                    val snackbar = Snackbar.make(it, "A senha precisa ter pelo menos e caracteres!", Snackbar.LENGTH_SHORT)
                    snackbar.show()
                }
                else -> {
                    navegarPraHome()
                }

            }



        }

        binding.btCadastrar.setOnClickListener {

            val navegarTelaCadastro = Intent(this,Cadastro::class.java)
            startActivity(navegarTelaCadastro)
            finish()
        }


    }
    private  fun mensagem(view: View, mensagem: String){
        val snackbar = Snackbar.make(view, mensagem, Snackbar.LENGTH_SHORT)
        snackbar.setBackgroundTint(Color.parseColor("#FF0000"))
        snackbar.setTextColor(Color.parseColor("#FFFFFF"))
        snackbar.show()
    }
    private fun navegarPraHome(){
        val navegarHome = Intent(this, Cadastro::class.java)
        startActivity(navegarHome)
    }

}

package com.example.recife_academy

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.recife_academy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tvTitulo = binding.textView
        val edNome = binding.edNome
        val edSenha = binding.edSenha
        val edButton = binding.Botao

        edButton.setOnClickListener{
            val texto = edNome.text.toString()
            Toast.makeText(this,texto,Toast.LENGTH_SHORT).show()
            intent.putExtra("intentNomeUsuario", edNome.text.toString())
            intent.putExtra("intentSenhaUsuario",edSenha.text.toString())
            startActivity(intent)



        }

    }
}
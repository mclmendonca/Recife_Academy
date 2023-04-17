package com.example.recife_academy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recife_academy.databinding.ActivityMainBinding
import com.example.recife_academy.databinding.ActivitySegundaTelaBinding

class SegundaTelaActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySegundaTelaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_segunda_tela)

        binding = ActivitySegundaTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nomeUsuario = binding.NameAnt
        val nome = intent.getStringExtra("intentNomeUsuario")
        nomeUsuario.text = nome


    }
}
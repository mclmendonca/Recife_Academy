package com.example.recife_academy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recife_academy.databinding.ActivitySegundaTelaBinding
import com.example.recife_academy.databinding.ActivityTerceiraTelaBinding

class TerceiraTelaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTerceiraTelaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_terceira_tela)

        binding = ActivityTerceiraTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val endereco = binding.textView9
        val nomeEndereco = intent.getStringExtra("intentEndereco")
        endereco.text = nomeEndereco

        val bairro = binding.textView11
        val nomeBairro = intent.getStringExtra("intentBairro")
        bairro.text = nomeBairro


    }
}
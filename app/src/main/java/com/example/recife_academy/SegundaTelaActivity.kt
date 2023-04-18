package com.example.recife_academy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

        val edEndereco = binding.edAdress
        val edBairro = binding.edBairro


        var bottom2 = binding.button2

        bottom2.setOnClickListener{
            val intent = Intent(this,TerceiraTelaActivity::class.java)
            intent.putExtra("intentEndereco", edEndereco.text.toString())
            intent.putExtra("intentBairro",edBairro.text.toString())
            startActivity(intent)
            Toast.makeText(this,"Salvo com Sucesso!", Toast.LENGTH_SHORT).show()
        }
    }
}
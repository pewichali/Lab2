package com.example.laboratorio2

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.laboratorio2.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        var contador : Int = 0

        binding.boton1.setOnClickListener {

            contador = contador + 1
            //binding.texto1.text = contador.toString()
            Snackbar.make(binding.root,contador.toString(), Snackbar.LENGTH_SHORT).show()

        }


    }
}
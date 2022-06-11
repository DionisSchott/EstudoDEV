package com.dionis.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.lifecycle.whenStarted
import com.dionis.meuprimeiroapp.databinding.ActivityMainBinding
import kotlinx.coroutines.joinAll


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUp()

    }


    private fun setUp() {
        setUpClicks()
    }

    private fun setUpClicks() {
        binding.button1.setOnClickListener {
            changeText()
        }
        binding.button2.setOnClickListener {
            changeText2()
        }
        binding.button3.setOnClickListener {
            changeText3()
        }
        binding.button4.setOnClickListener {
            changeText4()
        }




    }

    private fun changeText() {
        if (binding.sublinhado.text == "eu") {
            binding.sublinhado.text = underline
        } else {
            binding.sublinhado.text = "eu"
        }
    }


    private fun changeText2() {
        if (binding.sublinhado2.text == "vou") {
            binding.sublinhado2.text = underline
        } else {
            binding.sublinhado2.text = "vou"
        }
    }

    private fun changeText3() {
        if (binding.sublinhado3.text == "virar") {
            binding.sublinhado3.text = underline
        } else {
            binding.sublinhado3.text = "virar"
        }
    }

    private fun changeText4() {
        if (binding.sublinhado4.text == "DEV") {
            binding.sublinhado4.text = underline
        } else {
            binding.sublinhado4.text = "DEV"
        }
    }


    private fun changeColor() {
        if (binding.sublinhado.text == "eu" &&
            binding.sublinhado2.text == "vou" &&
            binding.sublinhado3.text == "virar" &&
            binding.sublinhado4.text == "DEV"
        ) {
            binding.backgroud.background = getDrawable(android.R.color.holo_orange_light)
        } else {
            binding.backgroud.background = getDrawable(android.R.color.holo_blue_light)
        }
    }

    val underline = "______"


}



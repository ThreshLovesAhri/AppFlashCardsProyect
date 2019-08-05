package com.example.flashcardssumas

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import kotlinx.android.synthetic.main.activity_main.*

import kotlinx.android.synthetic.main.activity_sumas_tarjetas.*

class SumasTarjetas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sumas_tarjetas)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        BtnSalir.setOnClickListener {
            val into1= Intent(this, MainActivity::class.java)
            startActivity(into1)
        }
    }

}

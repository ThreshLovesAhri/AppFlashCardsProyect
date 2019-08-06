package com.example.appflashcards20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Siguiente(View view){
        Intent siguiente= new Intent(this,AcercaDe.class);
        startActivity(siguiente);
    }
    public void Jugar(View view){
        Intent jugar= new Intent(this,JuegoFlash.class);
        startActivity(jugar);
    }
    public void Salir(View view){
         System.exit(0);

    }
}

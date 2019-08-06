package com.example.appflashcards20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);
    }

    public void AnteriorMenu(View view){
        Intent atras= new Intent(this,MainActivity.class);
        startActivity(atras);
        System.exit(0);
    }
}

package com.example.appflashcards20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JuegoFlash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_flash);
    }
    public void AnteriorMenu(View view){
        Intent atras= new Intent(this,MainActivity.class);
        startActivity(atras);
    }

}

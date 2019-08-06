package com.example.appflashcards20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Respuesta extends AppCompatActivity {

    TextView ress;
    String outpot1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuesta);
        ress=(TextView)findViewById(R.id.ResNum);
        Intent into = getIntent();
        outpot1=into.getStringExtra(JuegoFlash.RespExtra);
        ress.setText(outpot1);
    }
    public void AnteriorMenu(View view){
        Intent atras= new Intent(this,JuegoFlash.class);
        startActivity(atras);
        System.exit(1);
    }

}

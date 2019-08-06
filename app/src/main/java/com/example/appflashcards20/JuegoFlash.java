package com.example.appflashcards20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class JuegoFlash extends AppCompatActivity {
    public static final String RespExtra="com.example.appflashcards20.JuegoFlash";

    TextView num1,num2;
    Random r;
    int outpot1,outpot2, respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_flash);
        num1=(TextView)findViewById(R.id.ResNum);
        num2=(TextView)findViewById(R.id.Number2);
        r=new Random();
        outpot1=r.nextInt((999-100)+100)+100;
        outpot2=r.nextInt((999-100)+100)+100;
        do {
            if (outpot2 > outpot1) {
                outpot2 = r.nextInt((999-100)+100)+100;
            }
        }while(outpot2>outpot1);
        num1.setText(""+outpot1);
        num2.setText(""+outpot2);
        respuesta=outpot1+outpot2;


    }
    public void AnteriorMenu(View view){
        Intent atras= new Intent(this,MainActivity.class);
        startActivity(atras);
        System.exit(0);
    }
    public void res(View view){
        Intent intento = new Intent(this,Respuesta.class);
        intento.putExtra(RespExtra,respuesta);
        startActivity(intento);
        Intent ress= new Intent(this,Respuesta.class);
        startActivity(ress);
    }
    public void nuevosnumeros(View view){
        num1=(TextView)findViewById(R.id.ResNum);
        num2=(TextView)findViewById(R.id.Number2);
        r=new Random();
        outpot1=r.nextInt((999-100)+100)+100;
        outpot2=r.nextInt((999-100)+100)+100;
        do {
            if (outpot2 > outpot1) {
                outpot2 = r.nextInt((999-100)+100)+100;
            }
        }while(outpot2>outpot1);
        num1.setText(""+outpot1);
        num2.setText(""+outpot2);
        respuesta=outpot1+outpot2;

    }


}

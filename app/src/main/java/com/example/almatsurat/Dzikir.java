package com.example.almatsurat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dzikir extends AppCompatActivity {

    //deklarasi atribut Cardview
    private CardView dzikirPagi, dzikirPetang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzikir);

        //binding setiap CardView ke id yang ada di layout activity_dzikir
        dzikirPagi = findViewById(R.id.dzikir_pagi);
        dzikirPetang = findViewById(R.id.dzikir_Petang);

        //Code di bawah ini digunakan untuk membuat agar CardView dapat di operasikan/diklik
        dzikirPagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //diarahkan ke Activity Pagi
                startActivity(new Intent(Dzikir.this,PagiAct.class));
            }
        });

        dzikirPetang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //diarahkan ke Activity Petang
                startActivity(new Intent(Dzikir.this,PetangAct.class));
            }
        });
    }
}
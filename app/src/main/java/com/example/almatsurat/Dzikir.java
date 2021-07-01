package com.example.almatsurat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dzikir extends AppCompatActivity {

    CardView dzikirPagi, dzikirPetang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzikir);

        dzikirPagi = findViewById(R.id.dzikir_pagi);
        dzikirPetang = findViewById(R.id.dzikir_Petang);

        dzikirPagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dzikir.this,PagiAct.class));
            }
        });

        dzikirPetang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dzikir.this,PetangAct.class));
            }
        });
    }
}
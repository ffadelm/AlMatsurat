package com.example.almatsurat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tentang extends AppCompatActivity {

    private Button btLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        //membuat button yang terhubung oleh situs web
        btLink = findViewById(R.id.Link);
        btLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                //untuk memilih browser jika ada lebih dari satu browser
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                //memasukkan link ke button apabila di operasikan
                intent.setData(Uri.parse("https://github.com/ffadelm"));
                startActivity(intent);
            }
        });
    }
}
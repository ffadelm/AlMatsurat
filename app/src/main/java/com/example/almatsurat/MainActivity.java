package com.example.almatsurat;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //deklarasi CardView
    private CardView Dzikir, Manfaat, Tentang, Keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding setiap CardView ke id yang ada di layout activity_main
        Dzikir = findViewById(R.id.dzikir);
        Manfaat = findViewById(R.id.manfaat);
        Tentang = findViewById(R.id.tentang);
        Keluar = findViewById(R.id.keluar);


        //Code di bawah ini digunakan untuk membuat agar CardView dapat di operasikan/diklik
        Dzikir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Dzikir.class));
            }
        });

        Manfaat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ManfaatAct.class));
            }
        });

        Tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Tentang.class));
            }
        });

        Keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //membuat alertDialog yang muncul popup apabila jika mengklik button keluar
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this)
                        //set icaon pada Alertdialog
                        .setIcon(R.mipmap.ic_launcher)
                        //set Judul
                        .setTitle(R.string.app_name)
                        //set isi
                        .setMessage("Apakah anda yakin ingin keluar?")
                        //membuat pilihan ya beserta operasi nya
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //jika pilih YA maka system akan keluar dan terhenti.
                                finish();
                                System.exit(0); //untuk mengehentikan system
                            }
                        })
                        .setNegativeButton("Batal", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //apabila memilih Batal maka system akan stay di Main menu
                                dialog.cancel();
                            }
                        });
                //membangun alert dialog
                AlertDialog alertDialog = builder.create();
                //menshow/menampilkan jika di klik pilihan keluar
                alertDialog.show();
            }
        });
    }
}
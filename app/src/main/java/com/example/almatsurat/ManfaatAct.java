package com.example.almatsurat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.almatsurat.Adapter.AdapterManfaat;
import com.example.almatsurat.Adapter.AdapterPagi;

public class ManfaatAct extends AppCompatActivity {

    PagerAdapter adapter;
    ViewPager viewPager;

    String[] judulmanfaat={
            "Manfaat Membaca Dzikir Pagi & Petang"
    };

    String[] isimanfaat={
            "1. Disempurnakan Nikmat\n\n" +
                    "Berdasarkan hadis Nabi yang telah diriwayatkan oleh Ibnu Saunni telah dijelaskan bahwa barang siapa yang membaca ‘Allahumma inniasbahtu minka fi nikmati’ sebanyak tiga kali saat pagi dan sore hari maka Allah Swt. akan menyempurnakan nikmat atas dirinya, sehingga seseorang akan mendapat banyak limpahan kenikmatan baik itu dari segi rohani maupun jasmani.\n" +
                    "\n" +
                    "2. Dicukupi Segala Kebutuhan di Dunia\n\n" +
                    "Berdasarkan hadis Nabi yang diriwayatkan oleh Abu Dawud dan Turmudzi dijelaskan bahwa barang siapa yang membaca bacaan surat Al- Ma’tsurat yaitu surat Al-Falaq dan An-Nass di pagi dan sore hari sebanyak tiga kali maka Allah Swt. akan mencukupkan segala kebutuhannya di dunia. Sehingga seseorang tidak akan merasa kekurangan selama hidup di dunia.\n" +
                    "\n3. Sebagai Tanda Syukur kepada Allah Swt\n\n" +
                    "Berdasarkan hadis Nabi yang telah diriwayatkan oleh Abu Dawud telah diterangkan bahwa jika seorang muslim membaca ‘Allahumma ashbaha …’ pada sore hari maka sejatinya dia telah bersyukur untuk kehidupan malamnya.\n" +
                    "\n4. Rumah Terlindung dari Gangguan Setan\n\n" +
                    "Berdasarkan hadis Nabi yang telah diriwayatkan oleh Thabrani menerangkan bahwa barang siapa yang membaca 10 ayat dari surat Al-Baqarah di dalam rumahnya maka setan tidak akan mampu masuk ke dalam rumah tersebut hingga keesokan harinya. Kesepuluh ayat itu adalah empat ayat pertama surat Al-Baqarah, satu ayat kursi, dua ayat setelah ayat kursi, dan ditutup dengan tiga ayat terakhir surat Al-Baqarah.\n" +
                    "\n" +
                    "5. Mendapat Keridhaan dari Allah Swt.\n\n" +
                    "Berdasarkan hadis Nabi yang diriwayatkan oleh Turmudzi telah dijelaskan bahwa jika seorang Muslim membaca ‘radhitubillahi rabba …’ di waktu sore hari dengan ikhlas maka Allah Swt. akan memberikan keridhaan kepadanya atas semua pekerjaan yang dilakukannya.\n" +
                    "\n6. Mendapat Pahala Lebih Banyak\n\n" +
                    "Berdasarkan hadits Nabi yang telah diriwayatkan oleh Muslim telah diterangkan bahwa Rasulullah menemui Juwariyah yang berada dalam mushalanya. Beliau bertanya kepadanya mengapa dia berlama-lama berada di dalam mushala, padahal jika Juwariyyah membaca ‘Subhanallahu wabihandihi …’ sebanyak tiga kali maka pahalanya lebih berat dari apa yang telah dilakukan Juwariyah yaitu berlama-lama berada dalam mushala.\n" +
                    "\n7. Terhindar dari Segala Bahaya yang Dapat Mengancam\n\n" +
                    "Berdasarkan hadis Nabi yang diriwayatkan oleh Abu Turmudzi telah diterangkan bahwa jika seorang Muslim membaca ‘Bismillahilladzi laa yaadzurru …’ sebanyak tiga kali di waktu pagi dan sore hari maka Allah Swt. akan menjaganya dari segala bahaya yang dapat datang kepadanya.\n"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manfaat);

        viewPager = findViewById(R.id.manfaat);

        adapter = new AdapterManfaat(ManfaatAct.this, judulmanfaat, isimanfaat);
        viewPager.setAdapter(adapter);
    }
}
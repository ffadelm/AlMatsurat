package com.example.almatsurat.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.almatsurat.ManfaatAct;
import com.example.almatsurat.PagiAct;
import com.example.almatsurat.R;

public class AdapterManfaat extends PagerAdapter {

    /*LayoutInflater di gunakan untuk untuk menjadikan atau
    mengconvert file layout xml ,sebagai View object baru ,di dalam layout utama.*/

    /*jadi nantinya Untuk itu ,kita harus menggunakan LayoutInflater ,agar
    layout yang berisi konten (item_list.xml),dapat ditampilkan di dalam layout utama (actvity_main.xml).
    Bisa kita sebut juga layout konten ,bertugas menjadi anak atau ChildView ,
    bagi layout  utama ,yang bertugas sebagai ParentView*/
    LayoutInflater inflater;

    //data dari string array
    String judulmanfaat[];
    String isimanfaat[];

    //untuk memberikan akses ke class ManfaatAct
    ManfaatAct context;


    @Override
    public int getCount() {
        return judulmanfaat.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    /* Kata kunci this dipergunakan pada pembuatan kelas dan digunakan untuk menyatakan objek sekarang.
     * Untuk menghindari variabel yang sama antara variabel class dengan variabel property.*/
    public AdapterManfaat(ManfaatAct manfaatAct, String[] judulmanfaat, String[] isimanfaat){
        this.context = manfaatAct;
        this.judulmanfaat = judulmanfaat;
        this.isimanfaat = isimanfaat;
    }

    /*class instantiateItem disini merupakan class yang berhubungan dengan PagerAdapter
     * jadi halaman yang telah di berikan posisi (int Position), dan kemudian adaptor akan bertanggungjawan untuk
     * menambahkan tampilan ke wadah yang di berikan (ViewGroup container) */
    public Object instantiateItem(ViewGroup container, int position){

        //menambahkan konten layout atau layout view_manfaat
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.view_manfaat,container,false);

        //membinding TextVIew yang ada di layout view_manfaat
        TextView JudulManfaat = view.findViewById(R.id.judulmanfaat);
        TextView IsiManfaat = view.findViewById(R.id.isimanfaat);

        //meletakkan data data yang ada di string[] sesuai posisinya
        JudulManfaat.setText(judulmanfaat[position]);
        IsiManfaat.setText(isimanfaat[position]);

        //meletakan wadah ke view atau ke view_manfaat
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        //meremove bagian object layout atau activity_manfaat
        container.removeView((LinearLayout)object);
    }
}

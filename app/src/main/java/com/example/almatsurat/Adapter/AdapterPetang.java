package com.example.almatsurat.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.almatsurat.PetangAct;
import com.example.almatsurat.R;

public class AdapterPetang extends PagerAdapter {

    /*LayoutInflater di gunakan untuk untuk menjadikan atau
    mengconvert file layout xml ,sebagai View object baru ,di dalam layout utama.*/

    /*jadi nantinya Untuk itu ,kita harus menggunakan LayoutInflater ,agar
    layout yang berisi konten (item_list.xml),dapat ditampilkan di dalam layout utama (actvity_main.xml).
    Bisa kita sebut juga layout konten ,bertugas menjadi anak atau ChildView ,
    bagi layout  utama ,yang bertugas sebagai ParentView*/

    LayoutInflater inflater;

    //data dari string array
    String judul[];
    String arab[];
    String terjemahan[];
    //untuk memberikan akses ke class PetangAct
    PetangAct context;

    @Override
    public int getCount() {
        return judul.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    /*
    * Kata kunci this dipergunakan pada pembuatan kelas dan digunakan untuk menyatakan objek sekarang.
    * Untuk menghindari variabel yang sama antara variabel class dengan variabel property.
    * */
    public AdapterPetang(PetangAct petangAct, String judul[], String arab[], String terjemahan[]){
        this.context = petangAct;
        this.judul = judul;
        this.arab = arab;
        this.terjemahan = terjemahan;
    }

    /*class instantiateItem disini merupakan class yang berhubungan dengan PagerAdapter
     * jadi halaman yang telah di berikan posisi (int Position), dan kemudian adaptor akan bertanggung jawab untuk
     * menambahkan tampilan ke wadah yang di berikan (ViewGroup container) */
    public Object instantiateItem(ViewGroup container, int position){
        //menambahkan konten layout
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.view_petang, container, false);

        //membinding TextVIew yang ada di layout view_petang
        TextView Judul = view.findViewById(R.id.judul);
        TextView Arab = view.findViewById(R.id.tulisanarab);
        TextView Terjemahan = view.findViewById(R.id.tulisanterjemahan);

        //meletakkan data data yang ada di string[] sesuai posisinya
        Judul.setText(judul[position]);
        Arab.setText(arab[position]);
        Terjemahan.setText(terjemahan[position]);
        //meletakan wadah ke view atau ke view_petang
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        //meremove bagian object layout atau activity_petang
        container.removeView((LinearLayout) object);
    }
}

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

    LayoutInflater inflater;

    String judul[];
    String arab[];
    String terjemahan[];
    PetangAct context;

    @Override
    public int getCount() {
        return judul.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    public AdapterPetang(PetangAct petangAct, String judul[], String arab[], String terjemahan[]){
        this.context = petangAct;
        this.judul = judul;
        this.arab = arab;
        this.terjemahan = terjemahan;
    }

    public Object instantiateItem(ViewGroup container, int position){
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.view_petang, container, false);

        TextView Judul = view.findViewById(R.id.judul);
        TextView Arab = view.findViewById(R.id.tulisanarab);
        TextView Terjemahan = view.findViewById(R.id.tulisanterjemahan);

        Judul.setText(judul[position]);
        Arab.setText(arab[position]);
        Terjemahan.setText(terjemahan[position]);
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}

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

    String judulmanfaat[];
    String isimanfaat[];
    ManfaatAct context;
    LayoutInflater inflater;

    @Override
    public int getCount() {
        return judulmanfaat.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    public AdapterManfaat(ManfaatAct manfaatAct, String[] judulmanfaat, String[] isimanfaat){
        this.context = manfaatAct;
        this.judulmanfaat = judulmanfaat;
        this.isimanfaat = isimanfaat;
    }

    public Object instantiateItem(ViewGroup container, int position){
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.view_manfaat,container,false);

        TextView JudulManfaat = view.findViewById(R.id.judulmanfaat);
        TextView IsiManfaat = view.findViewById(R.id.isimanfaat);

        JudulManfaat.setText(judulmanfaat[position]);
        IsiManfaat.setText(isimanfaat[position]);
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}

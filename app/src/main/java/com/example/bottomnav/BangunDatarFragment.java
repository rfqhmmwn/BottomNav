package com.example.bottomnav;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class BangunDatarFragment extends Fragment {

    private ImageView Segitiga;
    private ImageView Lingkaran;
    private ImageView Persegi;
    private ImageView PersegiPanjang;
    private ImageView PersegiEnam;

    public BangunDatarFragment() {
    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bangun_datar, container, false);

        Segitiga = view.findViewById(R.id.Segitiga);
        Segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hitungSegitiga = new Intent(getActivity(), HitungSegitiga.class);

                startActivity(hitungSegitiga);
            }
        });

        Lingkaran = view.findViewById(R.id.Lingkaran);
        Lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hitungLingkaran = new Intent(getActivity(), HitungSegitiga.class);

                startActivity(hitungLingkaran);
            }
        });

        Persegi = view.findViewById(R.id.Persegi);
        Persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hitungPersegi = new Intent(getActivity(), HitungPersegi.class);

                startActivity(hitungPersegi);
            }
        });

        PersegiPanjang = view.findViewById(R.id.PersegiPanjang);
        PersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hitungPersegiPanjang = new Intent(getActivity(), HitungPersegiPanjang.class);

                startActivity(hitungPersegiPanjang);
            }
        });

        PersegiEnam = view.findViewById(R.id.SegiEnam);
        PersegiEnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hitungPersegiEnam = new Intent(getActivity(), HitungPersegiEnam.class);

                startActivity(hitungPersegiEnam);
            }
        });


        return view;
    }
}
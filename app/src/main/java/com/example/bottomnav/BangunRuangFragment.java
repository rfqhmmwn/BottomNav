package com.example.bottomnav;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class BangunRuangFragment extends Fragment {

    private ImageView kubus;
    private ImageView balok;
    private ImageView LSegitiga;
    private ImageView bola;
    private ImageView PSegitiga;

    public BangunRuangFragment() {
    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bangun_ruang, container, false);

        kubus = view.findViewById(R.id.imageViewKubus);
        kubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Kubus = new Intent(getActivity(), Kubus.class);

                startActivity(Kubus);
            }
        });

        balok = view.findViewById(R.id.imageViewBalok);
        balok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent balok = new Intent(getActivity(), Balok.class);

                startActivity(balok);
            }
        });

        LSegitiga = view.findViewById(R.id.imageViewLimasSegitiga);
        LSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LSegitiga = new Intent(getActivity(), LSegitiga.class);

                startActivity(LSegitiga);
            }
        });

        bola = view.findViewById(R.id.imageViewBola);
        bola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bola = new Intent(getActivity(), Bola.class);

                startActivity(bola);
            }
        });

        PSegitiga = view.findViewById(R.id.imageViewPrismaSegitiga);
        PSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent PSegitiga = new Intent(getActivity(), PSegitiga.class);

                startActivity(PSegitiga);
            }
        });


        return view;
    }
}
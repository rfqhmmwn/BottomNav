package com.example.bottomnav;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PSegitiga extends AppCompatActivity {
    EditText editTextAlas, editTextTinggiAlas, editTextTinggiPrisma;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psegitiga);

        editTextAlas = findViewById(R.id.editTextAlas);
        editTextTinggiAlas = findViewById(R.id.editTextTinggiAlas);
        editTextTinggiPrisma = findViewById(R.id.editTextTinggiPrisma);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumePrismaSegitiga();
            }
        });
    }

    private void hitungVolumePrismaSegitiga() {
        String alasStr = editTextAlas.getText().toString();
        String tinggiAlasStr = editTextTinggiAlas.getText().toString();
        String tinggiPrismaStr = editTextTinggiPrisma.getText().toString();

        if (!alasStr.isEmpty() && !tinggiAlasStr.isEmpty() && !tinggiPrismaStr.isEmpty()) {
            double alas = Double.parseDouble(alasStr);
            double tinggiAlas = Double.parseDouble(tinggiAlasStr);
            double tinggiPrisma = Double.parseDouble(tinggiPrismaStr);
            double volume = (alas * tinggiAlas * tinggiPrisma) / 2;
            textViewHasil.setText("Volume prisma segitiga: " + volume);
        } else {
            textViewHasil.setText("Masukkan panjang alas, tinggi alas, dan tinggi prisma terlebih dahulu!");
        }
    }
}

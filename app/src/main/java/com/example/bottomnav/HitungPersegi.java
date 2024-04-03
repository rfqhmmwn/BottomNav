package com.example.bottomnav;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HitungPersegi extends AppCompatActivity {

    private EditText editTextSisi;
    private Button buttonHitung;
    private TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_persegi);

        // Inisialisasi view
        editTextSisi = findViewById(R.id.editTextSisi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        // Set listener untuk tombol hitung
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasPersegi();
            }
        });
    }

    private void hitungLuasPersegi() {
        // Mendapatkan nilai panjang sisi dari EditText
        String strSisi = editTextSisi.getText().toString();

        // Validasi apakah EditText diisi atau tidak
        if (strSisi.isEmpty()) {
            textViewHasil.setText("Mohon isi panjang sisi persegi");
            return;
        }

        // Konversi nilai panjang sisi menjadi tipe double
        double sisi = Double.parseDouble(strSisi);

        // Menghitung luas persegi
        double luas = sisi * sisi;

        // Menampilkan hasil perhitungan
        textViewHasil.setText("Luas persegi: " + luas);
    }
}

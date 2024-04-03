package com.example.bottomnav;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HitungPersegiEnam extends AppCompatActivity {

    private EditText editTextSisi;
    private Button buttonHitung;
    private TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_persegi_enam);

        // Inisialisasi view
        editTextSisi = findViewById(R.id.editTextSisi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        // Set listener untuk tombol hitung
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasHexagon();
            }
        });
    }

    private void hitungLuasHexagon() {
        // Mendapatkan nilai panjang sisi dari EditText
        String strSisi = editTextSisi.getText().toString();

        // Validasi apakah EditText diisi atau tidak
        if (strSisi.isEmpty()) {
            textViewHasil.setText("Mohon isi panjang sisi");
            return;
        }

        // Konversi nilai panjang sisi menjadi tipe double
        double sisi = Double.parseDouble(strSisi);

        // Menghitung luas segi enam
        double luas = 3 * Math.sqrt(3) * Math.pow(sisi, 2) / 2;

        // Menampilkan hasil perhitungan
        textViewHasil.setText("Luas segi enam: " + luas);
    }
}

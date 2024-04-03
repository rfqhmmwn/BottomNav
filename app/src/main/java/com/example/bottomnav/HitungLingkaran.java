package com.example.bottomnav;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HitungLingkaran extends AppCompatActivity {

    private EditText editTextJariJari;
    private Button buttonHitung;
    private TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_lingkaran);

        // Inisialisasi view
        editTextJariJari = findViewById(R.id.editTextJariJari);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        // Set listener untuk tombol hitung
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasLingkaran();
            }
        });
    }

    private void hitungLuasLingkaran() {
        // Mendapatkan nilai jari-jari dari EditText
        String strJariJari = editTextJariJari.getText().toString();

        // Validasi apakah EditText diisi atau tidak
        if (strJariJari.isEmpty()) {
            textViewHasil.setText("Mohon isi jari-jari lingkaran");
            return;
        }

        // Konversi nilai jari-jari menjadi tipe double
        double jariJari = Double.parseDouble(strJariJari);

        // Menghitung luas lingkaran
        double luas = Math.PI * jariJari * jariJari;

        // Menampilkan hasil perhitungan
        textViewHasil.setText("Luas lingkaran: " + luas);
    }
}

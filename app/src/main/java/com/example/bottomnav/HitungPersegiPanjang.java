package com.example.bottomnav;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HitungPersegiPanjang extends AppCompatActivity {

    private EditText editTextPanjang, editTextLebar;
    private Button buttonHitung;
    private TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_persegi_panjang);

        // Inisialisasi view
        editTextPanjang = findViewById(R.id.editTextPanjang);
        editTextLebar = findViewById(R.id.editTextLebar);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        // Set listener untuk tombol hitung
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasPersegiPanjang();
            }
        });
    }

    private void hitungLuasPersegiPanjang() {
        // Mendapatkan nilai panjang dan lebar dari EditText
        String strPanjang = editTextPanjang.getText().toString();
        String strLebar = editTextLebar.getText().toString();

        // Validasi apakah EditText diisi atau tidak
        if (strPanjang.isEmpty() || strLebar.isEmpty()) {
            textViewHasil.setText("Mohon isi panjang dan lebar persegi panjang");
            return;
        }

        // Konversi nilai panjang dan lebar menjadi tipe double
        double panjang = Double.parseDouble(strPanjang);
        double lebar = Double.parseDouble(strLebar);

        // Menghitung luas persegi panjang
        double luas = panjang * lebar;

        // Menampilkan hasil perhitungan
        textViewHasil.setText("Luas persegi panjang: " + luas);
    }
}

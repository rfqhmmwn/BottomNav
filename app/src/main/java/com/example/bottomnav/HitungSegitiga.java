package com.example.bottomnav;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HitungSegitiga extends AppCompatActivity {

    private EditText editTextAlas, editTextTinggi;
    private Button buttonHitung;
    private TextView textViewHasil;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi view
        editTextAlas = findViewById(R.id.editTextAlas);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);


        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasSegitiga();
            }
        });
    }

    private void hitungLuasSegitiga() {
        // Mendapatkan nilai alas dan tinggi dari EditText
        String strAlas = editTextAlas.getText().toString().trim();
        String strTinggi = editTextTinggi.getText().toString().trim();

        // Validasi apakah kedua EditText diisi atau tidak
        if (TextUtils.isEmpty(strAlas) || TextUtils.isEmpty(strTinggi)) {
            textViewHasil.setText("Mohon isi panjang alas dan tinggi");
            return;
        }

        // Konversi nilai alas dan tinggi menjadi tipe double
        double alas = Double.parseDouble(strAlas);
        double tinggi = Double.parseDouble(strTinggi);

        // Menghitung luas segitiga
        double luas = (alas * tinggi) / 2;

        // Menampilkan hasil perhitungan
        textViewHasil.setText("Luas segitiga: " + luas);
    }
}

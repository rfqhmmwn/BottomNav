package com.example.bottomnav;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LSegitiga extends AppCompatActivity {
    EditText editTextAlas, editTextTinggiAlas, editTextTinggiLimas;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lsegitiga);

        editTextAlas = findViewById(R.id.editTextAlas);
        editTextTinggiAlas = findViewById(R.id.editTextTinggiAlas);
        editTextTinggiLimas = findViewById(R.id.editTextTinggiLimas);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeLimasSegitiga();
            }
        });
    }

    private void hitungVolumeLimasSegitiga() {
        String alasStr = editTextAlas.getText().toString();
        String tinggiAlasStr = editTextTinggiAlas.getText().toString();
        String tinggiLimasStr = editTextTinggiLimas.getText().toString();

        if (!alasStr.isEmpty() && !tinggiAlasStr.isEmpty() && !tinggiLimasStr.isEmpty()) {
            double alas = Double.parseDouble(alasStr);
            double tinggiAlas = Double.parseDouble(tinggiAlasStr);
            double tinggiLimas = Double.parseDouble(tinggiLimasStr);
            double volume = (alas * tinggiAlas * tinggiLimas) / 3;
            textViewHasil.setText("Volume limas segitiga: " + volume);
        } else {
            textViewHasil.setText("Masukkan panjang alas, tinggi alas, dan tinggi limas terlebih dahulu!");
        }
    }
}

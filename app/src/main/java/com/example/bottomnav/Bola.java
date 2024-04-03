package com.example.bottomnav;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Bola extends AppCompatActivity {
    EditText editTextJariJari;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);

        editTextJariJari = findViewById(R.id.editTextJariJari);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeBola();
            }
        });
    }

    private void hitungVolumeBola() {
        String jariJariStr = editTextJariJari.getText().toString();

        if (!jariJariStr.isEmpty()) {
            double jariJari = Double.parseDouble(jariJariStr);
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
            textViewHasil.setText("Volume bola: " + volume);
        } else {
            textViewHasil.setText("Masukkan jari-jari terlebih dahulu!");
        }
    }
}

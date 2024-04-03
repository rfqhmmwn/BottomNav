package com.example.bottomnav;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Balok extends AppCompatActivity {
    EditText editTextPanjang, editTextLebar, editTextTinggi;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        editTextPanjang = findViewById(R.id.editTextPanjang);
        editTextLebar = findViewById(R.id.editTextLebar);
        editTextTinggi = findViewById(R.id.editTextTinggi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolumeBalok();
            }
        });
    }

    private void hitungVolumeBalok() {
        String panjangStr = editTextPanjang.getText().toString();
        String lebarStr = editTextLebar.getText().toString();
        String tinggiStr = editTextTinggi.getText().toString();

        if (!panjangStr.isEmpty() && !lebarStr.isEmpty() && !tinggiStr.isEmpty()) {
            double panjang = Double.parseDouble(panjangStr);
            double lebar = Double.parseDouble(lebarStr);
            double tinggi = Double.parseDouble(tinggiStr);
            double volume = panjang * lebar * tinggi;
            textViewHasil.setText("Volume balok: " + volume);
        } else {
            textViewHasil.setText("Masukkan panjang, lebar, dan tinggi terlebih dahulu!");
        }
    }
}

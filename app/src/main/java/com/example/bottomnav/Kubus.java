package com.example.bottomnav;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Kubus extends AppCompatActivity {
    EditText editTextSisi;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        editTextSisi = findViewById(R.id.editTextSisi);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.textViewHasil);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasKubus();
            }
        });
    }

    private void hitungLuasKubus() {
        String sisiStr = editTextSisi.getText().toString();

        if (!sisiStr.isEmpty()) {
            double sisi = Double.parseDouble(sisiStr);
            double luas = 6 * sisi * sisi;
            textViewHasil.setText("Luas kubus: " + luas);
        } else {
            textViewHasil.setText("Masukkan panjang sisi terlebih dahulu!");
        }
    }
}

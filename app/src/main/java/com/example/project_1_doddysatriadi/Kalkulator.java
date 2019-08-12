package com.example.project_1_doddysatriadi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {
    TextView Hasil;
    Button buttonTambah, buttonKurang, buttonKali, buttonBagi, buttonReset;
    EditText angkaPertama, angkaKedua;
    int nilai1, nilai2, total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        setTitle("Kalkulator");

        Hasil = (TextView) findViewById(R.id.hasil);
        buttonTambah = (Button) findViewById(R.id.buttonTambah);
        buttonKurang = (Button) findViewById(R.id.buttonKurang);
        buttonKali = (Button) findViewById(R.id.buttonKali);
        buttonBagi = (Button) findViewById(R.id.buttonBagi);
        buttonReset = (Button) findViewById(R.id.buttonReset);
        angkaPertama = (EditText) findViewById(R.id.angkaPertama);
        angkaKedua = (EditText) findViewById(R.id.angkaKedua);

        angkaPertama.setOnClickListener(new EditText.
                OnClickListener() {
            @Override
            public void onClick(View clearTextPertama) {
                angkaPertama.getText().clear();
                angkaKedua.getText().clear();
            }
        });

        angkaKedua.setOnClickListener(new EditText.
                OnClickListener() {
            @Override
            public void onClick(View clearTextKedua) {
                angkaPertama.getText().clear();
                angkaKedua.getText().clear();
            }
        });

        buttonTambah.setOnClickListener(new Button.
                OnClickListener() {
            @Override
            public void onClick(View tambah) {
                nilai1 = Integer.parseInt(angkaPertama.getText().toString());
                nilai2 = Integer.parseInt(angkaKedua.getText().toString());
                total = nilai1 + nilai2;
                Hasil.setText(String.valueOf(total));
            }
        });

        buttonKurang.setOnClickListener(new Button.
                OnClickListener() {
            @Override
            public void onClick(View kurang) {
                nilai1 = Integer.parseInt(angkaPertama.getText().toString());
                nilai2 = Integer.parseInt(angkaKedua.getText().toString());
                total = nilai1 - nilai2;
                Hasil.setText(String.valueOf(total));
            }
        });

        buttonKali.setOnClickListener(new Button.
                OnClickListener() {
            @Override
            public void onClick(View kali) {
                nilai1 = Integer.parseInt(angkaPertama.getText().toString());
                nilai2 = Integer.parseInt(angkaKedua.getText().toString());
                total = nilai1 * nilai2;
                Hasil.setText(String.valueOf(total));
            }
        });

        buttonBagi.setOnClickListener(new Button.
                OnClickListener() {
            @Override
            public void onClick(View bagi) {
                nilai1 = Integer.parseInt(angkaPertama.getText().toString());
                nilai2 = Integer.parseInt(angkaKedua.getText().toString());
                total = nilai1 / nilai2;
                Hasil.setText(String.valueOf(total));
            }
        });

        buttonReset.setOnClickListener(new Button.
                OnClickListener() {
            @Override
            public void onClick(View resetCalculator) {
                angkaPertama.setText("Masukan Angka Pertama");
                angkaKedua.setText("Masukan Angka Kedua");
                Hasil.setText("[]");
            }
        });
    }
}

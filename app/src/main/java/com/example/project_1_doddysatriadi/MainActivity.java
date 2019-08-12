package com.example.project_1_doddysatriadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonToNama, buttonToKalkulator, buttonToList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Menu");

        buttonToNama = (Button) findViewById(R.id.toNama);
        buttonToKalkulator = (Button) findViewById(R.id.toCalculator);
        buttonToList = (Button) findViewById(R.id.toListView);

        buttonToNama.setOnClickListener(new Button.
                OnClickListener() {
            @Override
            public void onClick(View viewNamaActivity) {
                startActivity(new Intent(MainActivity.this, InputNama.class));
            }
        });

        buttonToKalkulator.setOnClickListener(new Button.
                OnClickListener() {
            @Override
            public void onClick(View viewKalkulatorActivity) {
                startActivity(new Intent(MainActivity.this, Kalkulator.class));
            }
        });
        buttonToList.setOnClickListener(new Button.
                OnClickListener() {
            @Override
            public void onClick(View viewListActivity) {
                startActivity(new Intent(MainActivity.this, ViewList.class));
            }
        });
    }
}


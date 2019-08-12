package com.example.project_1_doddysatriadi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InputNama extends AppCompatActivity {
    EditText nameInput;
    Button submitButton;
    TextView showName;
    String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_nama);
        setTitle("Input Nama");

        nameInput = (EditText) findViewById(R.id.inputName);
        submitButton = (Button) findViewById(R.id.submitButton);
        showName = (TextView) findViewById(R.id.showName);

        submitButton.setOnClickListener(new Button.
                OnClickListener() {
            @Override
            public void onClick(View view1) {
                name = nameInput.getText().toString();
                showName.setText("Hallo " + name);
            }
        });
    }
}


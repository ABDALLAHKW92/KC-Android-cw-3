package com.example.cw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            TextView Calculator = findViewById(R.id.Calculator);

            TextView Results = findViewById(R.id.result);


            EditText firstNumber = findViewById(R.id.first);

            EditText secondNumber = findViewById(R.id.second);


            Button calculate = findViewById(R.id.calculate);


    }
}
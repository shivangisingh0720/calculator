package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etNumber1, etNumber2;
    private TextView tvResult;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber1 = findViewById(R.id.etNumber1);
        etNumber2 = findViewById(R.id.etNumber2);
        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnSubtract = findViewById(R.id.btnSubtract);
        Button btnMultiply = findViewById(R.id.btnMultiply);
        Button btnDivide = findViewById(R.id.btnDivide);
        tvResult = findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etNumber1.getText().toString());
                double num2 = Double.parseDouble(etNumber2.getText().toString());
                double result = num1 + num2;
                tvResult.setText("Result: " + result);
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etNumber1.getText().toString());
                double num2 = Double.parseDouble(etNumber2.getText().toString());
                double result = num1 - num2;
                tvResult.setText("Result: " + result);
            }
        });

        btnMultiply.setOnClickListener(v -> {
            double num1 = Double.parseDouble(etNumber1.getText().toString());
            double num2 = Double.parseDouble(etNumber2.getText().toString());
            double result = num1 * num2;
            tvResult.setText("Result: " + result);
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(etNumber1.getText().toString());
                double num2 = Double.parseDouble(etNumber2.getText().toString());
                if (num2 != 0) {
                    double result = num1 / num2;
                    tvResult.setText("Result: " + result);
                } else {
                    tvResult.setText("Cannot divide by zero");
                }
            }
        });
    }
}
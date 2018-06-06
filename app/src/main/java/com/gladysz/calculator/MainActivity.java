package com.gladysz.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button nine;
    private Button eight;
    private Button seven;
    private Button six;
    private Button five;
    private Button four;
    private Button three;
    private Button two;
    private Button one;
    private Button zero;
    private Button clear;
    private Button plus;
    private TextView window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();
        addButtonListeners();

    }

    private void addButtonListeners() {
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                window.append(nine.getText());
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                window.append(eight.getText());
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                window.append(seven.getText());
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                window.append(six.getText());
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                window.append(five.getText());
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                window.append(nine.getText());
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                window.append(three.getText());
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                window.append(two.getText());
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                window.append(one.getText());
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                window.append(zero.getText());
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                window.setText("");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                window.setText("");
            }
        });
    }

    private void setupUIViews() {
        nine = findViewById(R.id.btn9);
        eight = findViewById(R.id.btn8);
        seven = findViewById(R.id.btn7);
        six = findViewById(R.id.btn6);
        five = findViewById(R.id.btn5);
        four = findViewById(R.id.btn4);
        three = findViewById(R.id.btn3);
        two = findViewById(R.id.btn2);
        one = findViewById(R.id.btn1);
        zero = findViewById(R.id.btn0);
        window = findViewById(R.id.textWindow);
        clear = findViewById(R.id.clear);
        plus = findViewById(R.id.plus);
    }
}

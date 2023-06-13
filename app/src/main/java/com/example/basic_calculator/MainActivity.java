package com.example.basic_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText first_no=(EditText) findViewById(R.id.fn);
        EditText second_no=(EditText) findViewById(R.id.sn);
        EditText result=(EditText) findViewById(R.id.result);


        Button plus=(Button) findViewById(R.id.button_plus);
        Button minus=(Button) findViewById(R.id.button_minus);
        Button multiply=(Button) findViewById(R.id.button_multiply);
        Button divide=(Button) findViewById(R.id.button_divide);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(first_no.getText().toString());
                int b=Integer.parseInt(second_no.getText().toString());
                int c=a+b;
                result.setText(Integer.toString(c));


            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(first_no.getText().toString());
                int b=Integer.parseInt(second_no.getText().toString());
                int c=a-b;
                result.setText(Integer.toString(c));


            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(first_no.getText().toString());
                int b=Integer.parseInt(second_no.getText().toString());
                int c=a*b;
                result.setText(Integer.toString(c));


            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(first_no.getText().toString());
                int b=Integer.parseInt(second_no.getText().toString());
                double c=(double)a/b;
                result.setText(Double.toString(c));


            }
        });


    }
}
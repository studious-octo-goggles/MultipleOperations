package com.example.prateek.multipleoperations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumericOperation extends AppCompatActivity {
    EditText editText,editText2;
    TextView textView;

    Button BtnBc,BtnAd,BtnSb,BtnMul,BtnDiv,BtnMod,BtnRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeric_operation);
        BtnBc=  (Button) findViewById(R.id.btnBc);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView = (TextView) findViewById(R.id.textView2);
        BtnAd =(Button) findViewById(R.id.btnAd);
        BtnSb =(Button) findViewById(R.id.btnSb);
        BtnMul =(Button) findViewById(R.id.btnMul);
        BtnDiv =(Button) findViewById(R.id.btnDiv);
        BtnMod =(Button) findViewById(R.id.btnMod);
        BtnRes =(Button) findViewById(R.id.btnRes);
        BtnBc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(NumericOperation.this,MainActivity.class);
                startActivity(intent);
            }
        });
        BtnAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = editText.getText().toString();
                String s2 = editText2.getText().toString();

                if (s1.isEmpty()) {
                    editText.setError("Enter 1st no.");
                    editText.requestFocus();

                }
                else if(s2.isEmpty())

                {
                    editText2.setError("Enter 2nd no.");
                    editText2.requestFocus();

                }
                else {

                    int i = Integer.parseInt(s1);
                    int j = Integer.parseInt(s2);
                    int k = i + j;

                    textView.setText(k + "");
                }


            }
        });

        BtnSb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = editText.getText().toString();
                String s2 = editText2.getText().toString();

                if (s1.isEmpty()) {
                    editText.setError("Enter 1st no.");
                    editText.requestFocus();

                }
                else if(s2.isEmpty())

                {
                    editText2.setError("Enter 2nd no.");
                    editText2.requestFocus();

                }
                else {

                    int i = Integer.parseInt(s1);
                    int j = Integer.parseInt(s2);
                    int k = i - j;

                    textView.setText(k + "");
                }

            }
        });
        BtnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = editText.getText().toString();
                String s2 = editText2.getText().toString();

                if (s1.isEmpty()) {
                    editText.setError("Enter 1st no.");
                    editText.requestFocus();

                }
                else if(s2.isEmpty())

                {
                    editText2.setError("Enter 2nd no.");
                    editText2.requestFocus();

                }
                else {

                    int i = Integer.parseInt(s1);
                    int j = Integer.parseInt(s2);
                    int k = i * j;

                    textView.setText(k + "");
                }
            }
        });
        BtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = editText.getText().toString();
                String s2 = editText2.getText().toString();

                if (s1.isEmpty()) {
                    editText.setError("Enter 1st no.");
                    editText.requestFocus();

                }
                else if(s2.isEmpty())

                {
                    editText2.setError("Enter 2nd no.");
                    editText2.requestFocus();

                }
                else {

                    float i = Integer.parseInt(s1);
                    float j = Integer.parseInt(s2);
                    float k = i / j;

                    textView.setText(k + "");
                }
            }
        });
        BtnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = editText.getText().toString();
                String s2 = editText2.getText().toString();

                if (s1.isEmpty()) {
                    editText.setError("Enter 1st no.");
                    editText.requestFocus();

                }
                else if(s2.isEmpty())

                {
                    editText2.setError("Enter 2nd no.");
                    editText2.requestFocus();

                }
                else {

                    float i = Integer.parseInt(s1);
                    float j = Integer.parseInt(s2);
                    float k = i % j;

                    textView.setText(k + "");
                }
            }
        });
        BtnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(" ");
                editText2.setText(" ");
                textView.setText(" ");
            }

        });
    }
}

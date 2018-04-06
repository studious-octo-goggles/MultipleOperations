package com.example.prateek.multipleoperations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StringOperation extends AppCompatActivity {

    EditText editText;
    Button btnUp,btnLw,btnRev,btnRes,btnBc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_operation);

        editText = (EditText) findViewById(R.id.editText4);
        btnUp =(Button) findViewById(R.id.upper);
        btnLw =(Button) findViewById(R.id.lower);
        btnRev =(Button) findViewById(R.id.reverse);
        btnRes =(Button) findViewById(R.id.reset);
        btnBc= (Button)findViewById(R.id.back);

        btnBc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(StringOperation.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();

                if(s.isEmpty()) {
                    editText.setError("Enter Text");
                }
                else {
                    s = s.toUpperCase();
                    editText.setText(s);
                }

            }
        });
        btnLw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();


                if (s.isEmpty()) {
                    editText.setError("Enter Text");
                }
                else {

                    s = s.toLowerCase();
                    editText.setText(s);
                }

            }
        });
        btnRev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();

                if(s.isEmpty()) {
                    editText.setError("Enter Text");
                }
                else {
                    StringBuffer sb = new StringBuffer(s);
                    sb.reverse();
                    s = sb.toString();
                    editText.setText(s);
                }

            }
        });
        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(" ");
            }

        });


    }
}

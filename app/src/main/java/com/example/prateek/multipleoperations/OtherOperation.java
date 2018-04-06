package com.example.prateek.multipleoperations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OtherOperation extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Button Back,even,prime,reset,fact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_operation);

        Back=(Button)findViewById(R.id.back);
        editText=(EditText) findViewById(R.id.editText3);
        textView=(TextView)findViewById(R.id.textView);
        even =(Button) findViewById(R.id.even);
        prime =(Button) findViewById(R.id.prime);
        reset =(Button) findViewById(R.id.reset);
        fact =(Button) findViewById(R.id.fact);
                Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OtherOperation.this,MainActivity.class);
                startActivity(intent);
            }
        });
                even.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s= editText.getText().toString();
                        if (s.isEmpty()) {
                            editText.setError("Enter no.");
                        }
                        else {
                            int n = Integer.parseInt(s);
                            if ((n % 2) == 0)
                            {
                                textView.setText(n + " is even");
                            }
                            else {
                                textView.setText(n + " is odd");
                            }

                        }

                    }



                });
                prime.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s= editText.getText().toString();
                        if (s.isEmpty()) {
                            editText.setError("Enter no.");
                        }
                        else {
                            int n=Integer.parseInt(s);
                            int f = 0;



                            for (int i = 2; i < n; i++)
                            {
                                if (n % i == 0)
                                    f = 1;
                            }

                            if (f == 0)
                            {
                            textView.setText(n + " is Prime");}
                            else{
                                textView.setText(n +" is not prime");

                            }
                        }

                    }
                });
                fact.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String s= editText.getText().toString();
                        if (s.isEmpty()) {
                            editText.setError("Enter no.");
                        }
                        else {
                            int num=Integer.parseInt(s);
                            long factorial=1;

                            for(int i = 1; i<=num; i++){

                                factorial = i * factorial;

                            }
                            textView.setText(factorial+ "");

                        }
                    }
                });
                reset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        editText.setText(" ");
                        textView.setText(" ");
                    }
                });
    }
}

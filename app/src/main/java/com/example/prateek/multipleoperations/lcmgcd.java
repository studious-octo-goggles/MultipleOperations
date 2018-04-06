package com.example.prateek.multipleoperations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class lcmgcd extends AppCompatActivity {
    EditText editText5,editText6,editText7,editText8;
    TextView textView3,textView4;
    Button lcm,hcf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lcmgcd);
        editText5=findViewById(R.id.editText5);
        editText6=findViewById(R.id.editText6);
        editText7=findViewById(R.id.editText7);
        editText8=findViewById(R.id.editText8);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        lcm=findViewById(R.id.button2);
        hcf=findViewById(R.id.button3);
        lcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = editText5.getText().toString();
                String s2 = editText7.getText().toString();
               // String s3 = editText7.getText().toString();
               // String s4 = editText8.getText().toString();

                float i = Integer.parseInt(s1);
                float j = Integer.parseInt(s2);
               // long k = Integer.parseInt(s3);
               // long l = Integer.parseInt(s4);

                float a =  i;
                float b =  j;
                float t,lcm,hcf;

                while(b != 0)
                {
                    t = b;
                    b = a%b;
                    a = t;
                }

                hcf = a;
                lcm = ((i*j)/hcf);
                textView3.setText(lcm + "");


            }
        });
        hcf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = editText5.getText().toString();
                String s2 = editText7.getText().toString();
                // String s3 = editText7.getText().toString();
                // String s4 = editText8.getText().toString();

                float i = Integer.parseInt(s1);
                float j = Integer.parseInt(s2);
                // long k = Integer.parseInt(s3);
                // long l = Integer.parseInt(s4);

                float a =  i;
                float b =  j;
                float t,lcm,hcf;

                while(b != 0)
                {
                    t = b;
                    b = a%b;
                    a = t;
                }

                hcf = a;
                lcm = ((i*j)/hcf);

                textView4.setText(hcf + "");



            }
        });


    }
}

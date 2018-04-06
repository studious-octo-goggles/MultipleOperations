package com.example.prateek.multipleoperations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button NumOpr,OtrOpr,StrOpr,button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NumOpr= (Button)findViewById(R.id.NumOpr);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,lcmgcd.class);
                startActivity(intent);


            }
        });
        NumOpr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,NumericOperation.class);
                startActivity(intent);

            }
        });
        OtrOpr= (Button)findViewById(R.id.OtrOpr);
        OtrOpr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,OtherOperation.class);
                startActivity(intent);
            }
        });
        StrOpr=(Button) findViewById(R.id.StrOpr);
        StrOpr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,StringOperation.class);
               // Intent intent= new Intent();

               // intent.setClassName("com.example.prateek.myfirstapp","com.example.prateek.myfirstapp.MainActivity");
                startActivity(intent);
            }
        });
    }
}

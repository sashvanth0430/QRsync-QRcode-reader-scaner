package com.example.qrsync;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class buttonpage extends AppCompatActivity {
    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttonpage2);
        getWindow().setStatusBarColor(ContextCompat.getColor(buttonpage.this,R.color.Green));
        getSupportActionBar().hide();
         button1 = (Button) findViewById(R.id.button4);
        button2 = (Button) findViewById(R.id.button5);
         button1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 openNewActivity1();
             }
         });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity2();
            }
        });
    }
    public void openNewActivity1(){
        Intent intent = new Intent(this, QRGenerate.class);
        startActivity(intent);
    }
    public void openNewActivity2(){
        Intent intent = new Intent(this, QRScanner.class);
        startActivity(intent);
    }



}
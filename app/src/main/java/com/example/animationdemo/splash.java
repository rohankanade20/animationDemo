package com.example.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class splash extends AppCompatActivity {
TextView txt1;
Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        txt1 = findViewById(R.id.txt1);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anm1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation1);
                txt1.startAnimation(anm1);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anm2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation2);
                txt1.startAnimation(anm2);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anm3 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation3);
                txt1.startAnimation(anm3);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anm4 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation4);
                txt1.startAnimation(anm4);

            }
        });


    }
}
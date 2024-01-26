package com.example.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Thread td = new Thread(){
           public void run(){
               try {
                   sleep(5000);
               }catch (Exception ex){

                   ex.printStackTrace();
           }finally {

                   Intent intent = new Intent(MainActivity.this, splash.class);
                   startActivity(intent);
                   finish();
               }
               }
       };
       td.start();
    }
}
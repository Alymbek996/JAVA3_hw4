package com.geektech.java3_hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container_two_x,new Fragment_Two()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container_one_x,new Fragment_One()).commit();
    }
}
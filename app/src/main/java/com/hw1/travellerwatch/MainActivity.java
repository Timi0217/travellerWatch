package com.hw1.travellerwatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button goToNewYork;
    private Button goToDetroit;
    private Button goToOregon;
    private Button goToAlaska;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToNewYork = (Button) findViewById(R.id.newyork);
        goToNewYork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NewYork.class));
            }
        });

        goToOregon = (Button) findViewById(R.id.Oregon);
        goToOregon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Oregon.class));
            }
        });

        goToAlaska = (Button) findViewById(R.id.Alaska);
        goToAlaska.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Alaska.class));
            }
        });

        goToDetroit = (Button) findViewById(R.id.detroit);
        goToDetroit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Detroit.class));
            }
        });
        //why won't git work?

    }
}
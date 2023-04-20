package com.zergivs.fatastictravelapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button destinationButton = findViewById(R.id.destinationButton);

        destinationButton.setOnClickListener(view -> {
            Intent intent =  new Intent(MainActivity.this, Activity_destinos.class);
            startActivity(intent);
        });

        Button registerButton = findViewById(R.id.registerButton);

        registerButton.setOnClickListener(view -> {
            Intent intent2 =  new Intent(MainActivity.this, Activity_resgistro.class);
            startActivity(intent2);
        });
    }
}
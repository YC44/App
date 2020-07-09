package com.example.second_try;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FithActivity extends AppCompatActivity {

    private Button abgeben1;
    private Button zurueck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fith);

        zurueck = findViewById(R.id.zurueck);
        zurueck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FithActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        abgeben1 = findViewById(R.id.abgeben1);
        abgeben1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FithActivity.this, SixthActivity.class);
                startActivity(intent);
            }
        });

    }
}
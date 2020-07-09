package com.example.second_try;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SixthActivity extends AppCompatActivity {

    private Button fertig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);


        fertig = findViewById(R.id.fertig);
        fertig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SixthActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }
}
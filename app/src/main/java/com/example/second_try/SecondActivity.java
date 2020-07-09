package com.example.second_try;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private Button logout;
    private Button searchb;
    private EditText suchen;
    private ArrayList<String> Raueme;
    private Button anfrodern;
    private Button abgeben;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        abgeben=findViewById(R.id.abgeben);
        abgeben.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, FithActivity.class);
                startActivity(intent);
            }
        });

        anfrodern=findViewById(R.id.anfordern);
        anfrodern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, FithActivity.class);
                startActivity(intent);
            }
        });

        logout = findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Raueme = new ArrayList<String>();
        Raueme.add("1.110");
        Raueme.add("1.111");
        Raueme.add("1.112");
        Raueme.add("1.113");
        Raueme.add("1.114");
        Raueme.add("1.115");
        Raueme.add("1.116");
        Raueme.add("1.117");


        searchb = findViewById(R.id.searchb);
        suchen = findViewById(R.id.suchen);

        searchb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             check(suchen.getText().toString());
            }
        });

       anfrodern=findViewById(R.id.anfordern);
        anfrodern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });

    }


  private void check(String Room_number) {
        for (String i : Raueme) {
            if ((i.equals(Room_number))) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            } else {
                System.out.println("Falshes Passwort oder Benutzername");
            }
        }
    }
}
package com.example.second_try;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText campid;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campid = findViewById(R.id.campid);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check(campid.getText().toString(),password.getText().toString());
            }
        });
    }

    private void check(String username, String pass) {
        if ((username.equals("inf1111")) && (pass.equals("0000"))){
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }else {
            System.out.println("Falshes Passwort oder Benutzername");
        }
    }
}
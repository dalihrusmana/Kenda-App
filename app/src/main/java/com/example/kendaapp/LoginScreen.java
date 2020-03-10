package com.example.kendaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginScreen extends AppCompatActivity {

    //Declaration EditTexts
    EditText editTextEmail;
    EditText editTextPassword;

    //Declaration TextInputLayout

    //Declaration Button
    Button buttonLogin;
    private TextView registerDulu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        registerDulu = findViewById(R.id.btn_daftar);

        registerDulu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(LoginScreen.this, RegisterScreen.class);
                startActivity(register);
            }
        });

        buttonLogin = findViewById(R.id.btn_masuk);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(LoginScreen.this, MainActivity.class);
                startActivity(home);
            }
        });
    }


}

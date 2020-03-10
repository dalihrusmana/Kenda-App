package com.example.kendaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterScreen extends AppCompatActivity {

    private TextView masuk_langsung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);
        masuk_langsung=findViewById(R.id.btn_masuk_langsung);

        masuk_langsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masuk = new Intent(RegisterScreen.this, LoginScreen.class);
                startActivity(masuk);
            }
        });
    }

}

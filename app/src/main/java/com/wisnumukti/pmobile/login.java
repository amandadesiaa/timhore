package com.wisnumukti.pmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void login(View view) {
        Intent intent = new Intent(login.this, home.class);
        startActivity(intent);
    }

    public void kembali(View view) {
        Intent intent = new Intent(login.this, MainActivity.class);
        startActivity(intent);
    }
}
package com.wisnumukti.pmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void back(View view) {
        Intent intent = new Intent(register.this, login.class);
        startActivity(intent);
    }
    public void Login(View view) {
        Intent intent = new Intent(register.this, home.class);
        startActivity(intent);
    }
    public void awal(View view) {
        Intent intent = new Intent(register.this, MainActivity.class);
        startActivity(intent);
    }
}
package com.wisnumukti.pmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void masuk(View view) {
        Intent intent = new Intent(MainActivity.this, login.class);
        startActivity(intent);
    }

    public void daftar(View view) {
        Intent intent = new Intent(MainActivity.this, register.class);
        startActivity(intent);
    }
}
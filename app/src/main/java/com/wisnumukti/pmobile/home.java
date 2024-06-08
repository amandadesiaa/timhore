package com.wisnumukti.pmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void list1(View view) {
        Intent intent = new Intent(home.this, list1.class);
        startActivity(intent);
    }

    public void list2(View view) {
        Intent intent = new Intent(home.this, list2.class);
        startActivity(intent);
    }

    public void list3(View view) {
        Intent intent = new Intent(home.this, list3.class);
        startActivity(intent);
    }
}
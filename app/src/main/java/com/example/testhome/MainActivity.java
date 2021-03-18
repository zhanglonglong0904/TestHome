package com.example.testhome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addA();
        addB();
        addC();
    }

    private void addA() {
        Log.d("aaa", "add void a");
    }

    private void addB() {
        Log.d("aaa", "add void b");
    }

    private void addC() {
        Log.d("aaa", "add void c");
    }
}
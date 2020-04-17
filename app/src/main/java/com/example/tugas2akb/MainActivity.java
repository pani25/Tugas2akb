//14 april 2020
//nim : 10117144
//nama : muhamad pani rayadi
//kelas : IF4
package com.example.tugas2akb;

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

    public void next(View view) {
        Intent intent = new Intent( MainActivity.this,register.class);
        startActivity(intent);
    }
}

//14 april 2020
//nim : 10117144
//nama : muhamad pani rayadi
//kelas : IF4
package com.example.tugas2akb;

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
        Intent intent = new Intent( register.this,MainActivity.class);
        startActivity(intent);
    }

    public void register(View view) {
        Intent intent = new Intent( register.this,almost.class);
        startActivity(intent);
    }
}

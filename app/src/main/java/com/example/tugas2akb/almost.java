//14 april 2020
//nim : 10117144
//nama : muhamad pani rayadi
//kelas : IF4
package com.example.tugas2akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class almost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);
    }

    public void verify(View view) {
        Intent intent = new Intent( almost.this,verify.class);
        startActivity(intent);
    }
}

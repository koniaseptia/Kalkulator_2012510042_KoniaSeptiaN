package com.example.kalkulator_2012510042_koniaseptian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText pertama, kedua;
    Button Btntambah, Btnkurang, Btnkali, Btnbagi, Btnbersihkan;
    TextView vhasil;

    protected float yPertama, yKedua, yHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pertama = (EditText) findViewById(R.id.angka_pertama);
        kedua = (EditText) findViewById(R.id.angka_kedua);
        vhasil = (TextView) findViewById(R.id.hasil);

        Btntambah = (Button) findViewById(R.id.tambah);
        Btnkurang = (Button) findViewById(R.id.kurang);
        Btnkali = (Button) findViewById(R.id.kali);
        Btnbagi = (Button) findViewById(R.id.bagi);
        Btnbersihkan = (Button) findViewById(R.id.bersihkan);

        Btntambah.setOnClickListener(this);
        Btnkurang.setOnClickListener(this);
        Btnbagi.setOnClickListener(this);
        Btnkali.setOnClickListener(this);
        Btnbersihkan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        yPertama = Float.parseFloat(pertama.getText().toString());
        yKedua = Float.parseFloat(kedua.getText().toString());
        switch (v.getId()) {
            case R.id.tambah:
                yHasil = yPertama + yKedua;
                vhasil.setText(String.valueOf(yHasil));
                break;
        }
        switch (v.getId()) {
            case R.id.kurang:
                yHasil = yPertama - yKedua;
                vhasil.setText(String.valueOf(yHasil));
                break;
        }
        switch (v.getId()) {
            case R.id.kali:
                yHasil = yPertama * yKedua;
                vhasil.setText(String.valueOf(yHasil));
                break;
        }
        switch (v.getId()) {
            case R.id.bagi:
                yHasil = yPertama / yKedua;
                vhasil.setText(String.valueOf(yHasil));
                break;
        }
        switch (v.getId()) {
            case R.id.bersihkan:
                pertama.setText("");
                kedua.setText("");
                vhasil.setText("0");
                break;
        }
    }

}
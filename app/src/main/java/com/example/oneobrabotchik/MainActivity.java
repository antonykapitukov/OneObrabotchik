package com.example.oneobrabotchik;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.oneobrabotchik.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());


    }

    public void onClickBtn(View v) {
        if (R.id.firstBtn == v.getId()) {
            Toast.makeText(this, "first", Toast.LENGTH_LONG).show();
        }
        if (R.id.secondBtn == v.getId()) {
            Toast.makeText(this, "second", Toast.LENGTH_LONG).show();
        }
        if (R.id.thirdBtn == v.getId()) {
            Toast.makeText(this, "third", Toast.LENGTH_LONG).show();
        }
    }
}
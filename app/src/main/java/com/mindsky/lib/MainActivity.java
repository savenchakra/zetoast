package com.mindsky.lib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mindsky.zetoast.Zetoast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Zetoast.singletoast(this,"Library worked ");

    }
}
package com.mindsky.lib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.button.MaterialButton;
import com.mindsky.zetoast.Zetoast;

public class MainActivity extends AppCompatActivity {

    MaterialButton simpleToast, shortT,longT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleToast = findViewById(R.id.simple);
        shortT = findViewById(R.id.shortToast);
        longT = findViewById(R.id.LongToast);


        simpleToast.setOnClickListener(v -> {

        Zetoast.singletoast(this,"Simple Toast worked ");
        });

        shortT.setOnClickListener(v -> {

        Zetoast.shortToast(this,"Short Toast Worked");
        });

        longT.setOnClickListener(v -> {
        Zetoast.longToast(this,"Long Toast Worked");

        });
    }
}
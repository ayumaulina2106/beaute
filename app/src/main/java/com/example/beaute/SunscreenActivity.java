package com.example.beaute;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SunscreenActivity extends AppCompatActivity {
    private ImageView imageView_sunscreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Sunscreen");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunscreen);
        imageView_sunscreen = (ImageView) findViewById(R.id.sunscreen);
    }
}
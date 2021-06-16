package com.example.beaute;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class TonerActivity extends AppCompatActivity {
    private ImageView imageView_toner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Toner");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toner);

        imageView_toner = (ImageView) findViewById(R.id.toner);
    }
}
package com.example.beaute;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SerumActivity extends AppCompatActivity {
    private ImageView imageView_serum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Serum");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serum);

        imageView_serum = (ImageView) findViewById(R.id.serum);
    }
}
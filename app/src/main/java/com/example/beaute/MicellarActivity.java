package com.example.beaute;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MicellarActivity extends AppCompatActivity {
    private ImageView imageView_micellar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Micellar Water");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_micellar);
        imageView_micellar =(ImageView) findViewById(R.id.micellar);
    }
}
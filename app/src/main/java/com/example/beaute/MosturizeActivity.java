package com.example.beaute;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MosturizeActivity extends AppCompatActivity {
    private ImageView imageView_mosturize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Moisturizer");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mosturize);
        imageView_mosturize =(ImageView) findViewById(R.id.mosturize);
    }
}
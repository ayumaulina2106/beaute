package com.example.beaute;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HairActivity extends AppCompatActivity {
    private ImageView imageView_hair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Haircare");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair);
        imageView_hair =(ImageView) findViewById(R.id.hair);
    }
}
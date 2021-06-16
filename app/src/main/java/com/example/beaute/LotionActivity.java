package com.example.beaute;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LotionActivity extends AppCompatActivity {
    private ImageView imageView_lotion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Lotion");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lotion);
        imageView_lotion = (ImageView) findViewById(R.id.lotion);



    }
}

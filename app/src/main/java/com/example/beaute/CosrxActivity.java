package com.example.beaute;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CosrxActivity extends AppCompatActivity {
    private ImageView imageView_corsx;
    private TextView textView_cosrx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("COSRX gel cleanser");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosrx);

        imageView_corsx = (ImageView)findViewById(R.id.cosrx);
        textView_cosrx =(TextView)findViewById(R.id.cosrxrinci);
    }
}
package com.example.beaute;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FacialwashActivity extends AppCompatActivity {
    private ImageView imageView_facialwash;
    private Button button_cosrx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Facial Wash");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facialwash);

        imageView_facialwash = (ImageView)findViewById(R.id.facialwash);
        button_cosrx = (Button)findViewById(R.id.cosrxbutton);

        button_cosrx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FacialwashActivity.this, CosrxActivity.class);
                startActivity(intent);
            }
        });
    }
}
package com.example.beaute;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class dashboardActivity extends AppCompatActivity {
    private ImageView imageView_dashboard;
    private CardView cardView_facial;
    private ImageButton imageButton_buttonFacial;
    private ImageButton imageButton_buttonToner;
    private ImageButton imageButton_buttonSerum;
    private ImageButton imageButton_buttonSunscreen;
    private ImageButton imageButton_buttonMosturize;
    private ImageButton imageButton_buttonLotion;
    private ImageButton imageButton_buttonMicellar;
    private ImageButton imageButton_buttonHair;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Dashbosrd");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        imageView_dashboard = (ImageView) findViewById(R.id.dashboard);
        imageButton_buttonFacial =(ImageButton) findViewById(R.id.buttonfacial);
        imageButton_buttonToner =(ImageButton) findViewById(R.id.buttontoner);
        imageButton_buttonSerum =(ImageButton) findViewById(R.id.buttonserum);
        imageButton_buttonSunscreen =(ImageButton) findViewById(R.id.buttonsunscreen);
        imageButton_buttonMosturize =(ImageButton) findViewById(R.id.buttonmosturize);
        imageButton_buttonLotion =(ImageButton) findViewById(R.id.buttonlotion);
        imageButton_buttonMicellar =(ImageButton) findViewById(R.id.buttonmicellar);
        imageButton_buttonHair =(ImageButton) findViewById(R.id.buttonhair);



        imageButton_buttonFacial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboardActivity.this, FacialwashActivity.class);
                startActivity(intent);
            }
        });

        imageButton_buttonToner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboardActivity.this, TonerActivity.class);
                startActivity(intent);
            }
        });

        imageButton_buttonSerum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboardActivity.this, SerumActivity.class);
                startActivity(intent);
            }
        });

        imageButton_buttonSunscreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboardActivity.this, SunscreenActivity.class);
                startActivity(intent);
            }
        });

        imageButton_buttonMosturize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboardActivity.this, MosturizeActivity.class);
                startActivity(intent);
            }
        });

        imageButton_buttonLotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboardActivity.this, LotionActivity.class);
                startActivity(intent);
            }
        });

        imageButton_buttonMicellar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboardActivity.this, MicellarActivity.class);
                startActivity(intent);
            }
        });

        imageButton_buttonHair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboardActivity.this, HairActivity.class);
                startActivity(intent);
            }
        });
    }


}
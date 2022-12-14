package com.example.pricepredictor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class InformationScreen extends AppCompatActivity {
    ImageView previous_Exp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_screen);
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        previous_Exp = (ImageView) findViewById(R.id.selectionButtons);
        previous_Exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InformationScreen.this, CountryScreen.class));
            }
        });
    }
}
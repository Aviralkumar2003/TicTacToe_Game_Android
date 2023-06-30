package com.example.xoxo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SPLScreen extends AppCompatActivity {
    Intent homee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splscreen);

        homee=new Intent(SPLScreen.this, MainMenu.class);

        new Handler().postDelayed(() -> {
            startActivity(homee);
            finish();
        },1500);
    }
}
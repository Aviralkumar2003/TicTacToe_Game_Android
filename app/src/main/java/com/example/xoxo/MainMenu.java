package com.example.xoxo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {
    Intent next;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        next=new Intent(MainMenu.this, MainActivity.class);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) { startActivity(next); }
        });
    }
}
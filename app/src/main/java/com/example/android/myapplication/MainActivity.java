package com.example.android.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button show;
    ImageView sampleImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exercising (View v)
    {
        Intent intent = new Intent(this, Page2.class);
        startActivity(intent);
    }
    public void EVERYWHERE (View v)
    {
        Intent intent2 = new Intent(this, Page3.class);
        startActivity(intent2);
    }
    public void searching (View v)
    {
        Intent intent3 = new Intent(this, Page4.class);
        startActivity(intent3);
    }
    public void Poké (View v)
    {
        Intent intent4 = new Intent(this, Page5.class);
        startActivity(intent4);
    }
    public void dangerous (View v)
    {
        Intent intent5 = new Intent(this, Page6.class);
        startActivity(intent5);
    }

}


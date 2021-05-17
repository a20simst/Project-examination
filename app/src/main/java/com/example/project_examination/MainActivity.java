package com.example.project_examination;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button omOss = findViewById(R.id.om_oss);
        Button listFood = findViewById(R.id.button_food);

        ImageView imageView1 = findViewById(R.id.image1);
        ImageView imageView2 = findViewById(R.id.image2);
        ImageView imageView3 = findViewById(R.id.image3);
        ConstraintLayout mainActivity = findViewById(R.id.cActivityMain);
        ConstraintLayout aboutUsActivity = findViewById(R.id.about_us);

        Picasso.get().load("https://live.staticflickr.com/759/21103832420_94040e9f7a_b.jpg").into(imageView1);
        Picasso.get().load("https://live.staticflickr.com/3835/15017552912_538f3745a6_b.jpg").into(imageView2);
        Picasso.get().load("https://live.staticflickr.com/5488/31118916352_a15653b356_b.jpg").into(imageView3);

        omOss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent omOssActivity = new Intent(MainActivity.this,  AboutUs.class);
                startActivity(omOssActivity);
            }
        });
        listFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ListFoodActivity = new Intent(MainActivity.this,  ListFoodActivity.class);
                startActivity(ListFoodActivity);
            }
        });

    }
}
package com.example.project_examination;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button omOss = findViewById(R.id.om_oss);
        Button listFood = findViewById(R.id.button_food);
        Button changeThemeLight =findViewById(R.id.theme);
        Button changeThemeDark =findViewById(R.id.theme2);
        ConstraintLayout mainActivity = findViewById(R.id.cActivityMain);
        ConstraintLayout aboutUsActivity = findViewById(R.id.about_us);
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
        changeThemeLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setBackgroundColor(0xFFFFFFFF);



            }
        });

        changeThemeDark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.setBackgroundColor(Color.parseColor("#000000"));


            }
        });
    }
}
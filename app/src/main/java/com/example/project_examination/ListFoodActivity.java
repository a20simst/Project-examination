package com.example.project_examination;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ListFoodActivity extends AppCompatActivity {
    private ArrayList<Food> foodList = new ArrayList<>();
    private ArrayAdapter<Food> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_food);
        Button back = findViewById(R.id.back);
        ListView listView;
        listView = findViewById(R.id.list_view);
        adapter = new ArrayAdapter<Food>(ListFoodActivity.this, R.layout.list_food_textview,foodList);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
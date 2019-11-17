package com.example.thefoodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FoodActivity extends AppCompatActivity {

    public static final String EXTRA_FOODNO = "Foodno";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        int Foodno = (Integer) getIntent().getExtras().get(EXTRA_FOODNO);
        Food food = Food.foods[Foodno];
    }
}

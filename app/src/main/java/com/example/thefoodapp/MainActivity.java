 package com.example.thefoodapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  AdapterView.OnClickListener itemClickListner = new AdapterView.OnClickListener(){

            @Override
            public void onClick(View v) {

            }
        }; */
        AdapterView.OnItemClickListener itermClickListner = new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position ==0){
                    Intent intent = new Intent(MainActivity.this, FoodCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };

        ListView listView = (ListView) findViewById(R.id.listOptions);
        listView.setOnClickListener((View.OnClickListener) itermClickListner);

    }
}

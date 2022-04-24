package com.sarkarinaukri24.practical5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ImageView Images;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        Images = findViewById(R.id.imageView);


        //final String str[] = {"Image1","Image2","Image3","Image4"};


        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.Images, android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Images.setImageResource(R.drawable.home1);
                }
              else if(position == 1){
                    Images.setImageResource(R.drawable.home2);
                }
              else if(position == 2){
                    Images.setImageResource(R.drawable.home3);
                }
              else if(position == 3){
                    Images.setImageResource(R.drawable.home4);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
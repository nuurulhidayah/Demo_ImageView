package com.example.demoimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //Declare the ImageView object called ivDay2
    ImageView ivDay2;
    ImageView ivDay4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the ImageView objective and assign to ivDay2
        ivDay2 = (ImageView) findViewById(R.id.imageView2);
        ivDay4 = (ImageView) findViewById(R.id.imageView4);
        //set the image
        ivDay2.setImageResource(R.drawable.day2);
        ivDay4.setImageResource(R.drawable.day4);
    }
}
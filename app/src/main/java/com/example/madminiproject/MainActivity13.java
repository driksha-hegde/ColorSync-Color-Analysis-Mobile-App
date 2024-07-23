package com.example.madminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }
    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}
package com.example.madminiproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    Button col;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        result=findViewById(R.id.textView3);
        col=findViewById(R.id.button2);


        Intent ehs=getIntent();
        String eyee= ehs.getStringExtra("load");
        String hairr=ehs.getStringExtra("load1");
        String skin=ehs.getStringExtra("load2");;

        String color=eyee+hairr+skin;

        String ress;

        if (color.equals("blueblondebeige") || color.equals("bluebrownhnatural") || color.equals("blueblackhnatural")) {
            result.setText("SUMMER TONE");
            ress="summer";
            col.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent d=new Intent(MainActivity4.this, MainActivity5.class);
                    startActivity(d);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            });
        }
        else if (color.equals("blueblondenatural") || color.equals("bluebrownhbeige") || color.equals("bluebrownhalmond") ||
                color.equals("greenblondebeige") || color.equals("greenblondenatural") || color.equals("greenblondealmond") ||
                color.equals("greenbrownhbeige") || color.equals("greenbrownhalmond") || color.equals("brownblondebeige") ||
                color.equals("blackblondebeige")) {
            result.setText("SPRING TONE");
            ress="spring";
            col.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent d=new Intent(MainActivity4.this,MainActivity8.class);
                    startActivity(d);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            });
        }
        else if (color.equals("bluebrownhespresso") || color.equals("blueburgundynatural") || color.equals("blueburgundyespresso") ||
                color.equals("greenbrownhnatural") || color.equals("greenburgundybeige") || color.equals("greenburgundynatural") ||
                color.equals("brownblondenatural") || color.equals("brownblondealmond") || color.equals("brownblondeespresso") ||
                color.equals("brownbrownhbeige") || color.equals("brownbrownhnatural") || color.equals("brownbrownhalmond") ||
                color.equals("brownbrownhespresso") || color.equals("brownburgundybeige") || color.equals("brownburgundynatural") ||
                color.equals("brownburgundyalmond") || color.equals("blackbrownhbeige") || color.equals("blackbrownhalmond") ||
                color.equals("blackburgundybeige") || color.equals("blackburgundynatural") || color.equals("blackburgundyalmond") ||
                color.equals("blackburgundyespresso")) {
            result.setText("AUTUMN TONE");
            ress="autumn";
            col.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent d=new Intent(MainActivity4.this, MainActivity7.class);
                    startActivity(d);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            });
        }
        else if (color.equals("blueblondealmond") || color.equals("blueblondeespresso") || color.equals("blueburgundybeige") ||
                color.equals("blueburgundyalmond") || color.equals("blueblackhbeige")  || color.equals("blueblackhalmond") ||
                color.equals("blueblackhespresso") || color.equals("greenblondeespresso") || color.equals("greenbrownhespresso") ||
                color.equals("greenburgundyalmond") || color.equals("greenburgundyespresso") || color.equals("greenblackhbeige") ||
                color.equals("greenblackhnatural") || color.equals("greenblackhalmond") ||
                color.equals("greenblackhespresso") || color.equals("brownburgundyespresso") || color.equals("brownblackbeige") ||
                color.equals("brownblackhnatural") || color.equals("brownblackhalmond") || color.equals("brownblackhespresso") ||
                color.equals("blackblondenatural") || color.equals("blackblondealmond")|| color.equals("blackblondeespresso")||
                color.equals("blackbrownhnatural") || color.equals("blackbrownhespresso")|| color.equals("blackblackhbeige") ||
                color.equals("blackblackhnatural")|| color.equals("blackblackhalmond") || color.equals("blackblackhespresso")) {
            result.setText("WINTER TONE");
            ress="winter";
            col.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent d=new Intent(MainActivity4.this, MainActivity6.class);
                    startActivity(d);
                    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                }
            });
        }
        else{
            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
        }


    }
    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}
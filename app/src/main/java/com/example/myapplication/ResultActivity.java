package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {
    final  int Takara1 = 0;
    final  int Takara2 = 1;
    final  int Takara3 = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        int mytakara= 0;
        Intent intent = getIntent();
        int id = intent.getIntExtra("Takara",0);
        ImageView kekkaView=(ImageView)findViewById(R.id.kekka_image);
     switch (id){
         case R.id.tskara1:
             mytakara=Takara1;
             break;
         case R.id.takara2:
             mytakara=Takara2;
             break;
         case R.id.takara3:
             mytakara=Takara3;
             break;
             default:
                 mytakara=Takara1;
                 break;
        }
        int kekka=(int)(Math.random()*3);
     if (mytakara==kekka) {
         kekkaView.setImageResource(R.drawable.atari);
     }
     else {
         kekkaView.setImageResource(R.drawable.hazure);
     }
    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onTakaraButtonTapped(View view){
        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("Takara",view.getId());
        startActivity(intent);

    }
}

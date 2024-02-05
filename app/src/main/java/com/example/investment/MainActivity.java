package com.example.investment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void startMarketAnalysisActivity(View view) {
        Intent intent = new Intent(this, MarketAnalysis.class);
        startActivity(intent);
    }

    public void startTraningActivity(View view){
        Intent intent = new Intent(this, Training.class);
        startActivity(intent);
    }
    public void startSupportActivity(View view){
        Intent intent = new Intent(this, Support.class);
        startActivity(intent);
    }
    public void startMainChatActivity(View view){
        Intent intent = new Intent(this, MainChat.class);
        startActivity(intent);
    }

}
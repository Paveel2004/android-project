package com.example.investment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast = Toast.makeText(getApplicationContext(),"Вопрос отправлен! Ответим за 24ч!",Toast.LENGTH_LONG);
        toast.show();
    }

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
//        Intent intent = new Intent(this, MainChat.class);
//        startActivity(intent);


    }

}
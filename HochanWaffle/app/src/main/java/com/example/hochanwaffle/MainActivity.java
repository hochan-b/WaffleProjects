package com.example.hochanwaffle;

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

    public void openInfo(View view){
        Intent intent= new Intent(this, DisplayInfo.class);
        startActivity(intent);
    }

    public void openSNS(View view){
        Intent intent= new Intent(this, DogImages.class);
        startActivity(intent);
    }
}

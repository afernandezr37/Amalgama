package com.example.amalgama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void activity2(View v) {
        Intent switchActivityIntent = new Intent(this, Activity2.class);
        startActivity(switchActivityIntent);
    }

    public void activity3(View v) {
        Intent switchActivityIntent = new Intent(this, Activity3.class);
        startActivity(switchActivityIntent);
    }

    public void activity4(View v) {
        Intent switchActivityIntent = new Intent(this, Activity4.class);
        startActivity(switchActivityIntent);
    }

    public void activity5(View v) {
        Intent switchActivityIntent = new Intent(this, Activity5.class);
        startActivity(switchActivityIntent);
    }

    public void activity6(View v) {
        Intent switchActivityIntent = new Intent(this, Activity6.class);
        startActivity(switchActivityIntent);
    }

    public void activity7(View v) {
        Intent switchActivityIntent = new Intent(this, Activity7.class);
        startActivity(switchActivityIntent);
    }

    public void activity8(View v) {
        Intent switchActivityIntent = new Intent(this, Activity8.class);
        startActivity(switchActivityIntent);
    }

    public void activity9(View v) {
        Intent switchActivityIntent = new Intent(this, Activity9.class);
        startActivity(switchActivityIntent);
    }

    public void activity10(View v) {
        Intent switchActivityIntent = new Intent(this, Activity10.class);
        startActivity(switchActivityIntent);
    }

    public void activity11(View v) {
        Intent switchActivityIntent = new Intent(this, Activity11.class);
        startActivity(switchActivityIntent);
    }

    public void activity12(View v) {
        Intent switchActivityIntent = new Intent(this, Activity12.class);
        startActivity(switchActivityIntent);
    }
}
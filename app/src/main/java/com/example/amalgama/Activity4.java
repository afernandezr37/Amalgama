package com.example.amalgama;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Activity4 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_4);

        EditText fld=(EditText)findViewById(R.id.field);
        fld.setText("Licensed under the Apache License, Version 2.0 " +
                "(the \"License\"); you may not use this file " +
                "except in compliance with the License. You may " +

                "obtain a copy of the License at " +
                "http://www.apache.org/licenses/LICENSE-2.0");
    }
}

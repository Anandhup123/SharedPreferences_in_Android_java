package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView paste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        paste=(TextView) findViewById(R.id.pastehere);


        SharedPreferences sp=getSharedPreferences("user", Context.MODE_PRIVATE);
        String data=sp.getString("value","");

        paste.setText(data);

    }
}
package com.example.myapplication2;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //Making some show text message
        Toast.makeText(this, "Result of increasing muscle mass",Toast.LENGTH_SHORT).show();

        TextView textViewResult = findViewById(R.id.textViewResult);

        // Retrieve the result passed from InputActivity
        String result = getIntent().getStringExtra("result");

        // Display the result in the TextView
        textViewResult.setText(result);
    }
}

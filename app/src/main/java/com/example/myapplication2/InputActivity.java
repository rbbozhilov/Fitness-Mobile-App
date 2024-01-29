package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        //Making some show text message
        Toast.makeText(this, "Increase muscle mass calculator",Toast.LENGTH_SHORT).show();

        Button btnCalculate = findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateAndOpenResultActivity();
            }
        });
    }

    private void calculateAndOpenResultActivity() {

        EditText editTextWeight = findViewById(R.id.editTextWeight);

        float weight =  Float.parseFloat(editTextWeight.getText().toString());

        String result = this.CalculationLogic(weight);

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

    private String CalculationLogic(float weight)
    {
        float proteinResult = weight * 2.5f;
        float caloriesResult = 37.5f * weight;
        float vug = (caloriesResult * 0.3f) + (proteinResult * 4);
        float carbohydratesResult = (caloriesResult - vug) / 4;
        float fatResult = (caloriesResult * 0.3f) / 9;

        String result = "Protein: " + proteinResult + " g"
                + "\nCalories: " + caloriesResult + " g"
                + "\nCarbohydrate: " + carbohydratesResult +" g"
                + "\nFat: " + fatResult + " g";

        return result;
    }
}

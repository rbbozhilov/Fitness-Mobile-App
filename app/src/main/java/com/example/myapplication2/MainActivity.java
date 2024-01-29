package com.example.myapplication2;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Making some show text message
        Toast.makeText(this, "WELCOME",Toast.LENGTH_SHORT).show();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.action_exercises) {
            startActivity(new Intent(this, ExerciseActivity.class));
            return true;
        } else if (itemId == R.id.action_fitness_card) {
            startActivity(new Intent(this, FitnessCardActivity.class));
            return true;
        } else if (itemId == R.id.action_input) {
            startActivity(new Intent(this, InputActivity.class));
            return true;
        } else if (itemId == R.id.action_recipe) {
            startActivity(new Intent(this, RecipeActivity.class));
            return true;
        }
        return false;
    }
}
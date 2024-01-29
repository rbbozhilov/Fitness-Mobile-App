package com.example.myapplication2;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class RecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        List<ExerciseModel> exercises = new ArrayList<>();
        exercises.add(new ExerciseModel(R.drawable.healthy6, "Fruit And Veggie Salad", "This refreshing Fruit and Vegetable Salad is super simple and so yummy! You only need 20 minutes to make this crunchy, tangy, and delicious summer salad with fruits and veggies."));
        exercises.add(new ExerciseModel(R.drawable.healthy5, "Chicken Caesar Salad", "A classic chicken salad recipe, featuring crunchy croutons and a creamy, garlic dressing. Ideal for lunch with friends."));
        exercises.add(new ExerciseModel(R.drawable.healthy4, "Fruit Salad Sir Fruit", "Fruit and Berry Salad is always best when comprised of fruit and berries that are currently in season, but there are certainly no die-hard rules; after all, rules were made to be broken! Use a sugar-free jelly to give your fruit that glossy, shiny look!"));
        exercises.add(new ExerciseModel(R.drawable.healthy2, "Salad With Chicken", "Full of Mediterranean flavours: olives, tomatoes, cucumber, avocados, and chicken for a complete meal in a salad bowl!"));
        exercises.add(new ExerciseModel(R.drawable.healthy3, "Caesar Salad", "If you love caesar recipes as much as we do, check out our creamy caesar dressing and caesar pasta salad."));
        exercises.add(new ExerciseModel(R.drawable.healthy1, "Salad As A Healthy Food", "Salad greens contain Vitamin A, Vitamin C, beta-carotene, calcium, folate, fiber, and phytonutrients (see Table 1). Leafy vegetables are a good choice for a healthful diet because they do not contain cholesterol and are naturally low in calories and sodium."));

        ExerciseAdapter adapter = new ExerciseAdapter(this, exercises);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        //Making some show text message
        Toast.makeText(this, "HEALTHY RECIPES",Toast.LENGTH_SHORT).show();

    }
}

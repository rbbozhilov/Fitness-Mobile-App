package com.example.myapplication2;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ExerciseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        List<ExerciseModel> exercises = new ArrayList<>();
        exercises.add(new ExerciseModel(R.drawable.biceps1, "Barbell Curl", "This exercise targets the biceps and can increase serious strength and size to the entire muscle when done correctly."));
        exercises.add(new ExerciseModel(R.drawable.biceps2, "Barbell Curl", "This exercise targets the biceps and can increase serious strength and size to the entire muscle when done correctly."));
        exercises.add(new ExerciseModel(R.drawable.biceps3, "Hammer Curl", "The hammer curl targets the biceps brachialis and brachioradialis for more arm thickness."));
        exercises.add(new ExerciseModel(R.drawable.biceps4, "Incline Dumbbell Curl", "Curling with lengthened, extended arms creates a longer range of motion, ultimately making this curl variation more effective."));
        exercises.add(new ExerciseModel(R.drawable.chest1, "Incline Dumbbell Press", "As with the flat bench, remember to keep your back flat and your feet flat throughout the movement. And, again, it’s highly recommended that you do this exercise with someone spotting you."));
        exercises.add(new ExerciseModel(R.drawable.chest2, "Incline Dumbbell Flye", "The incline dumbbell fly is a variation of the dumbbell fly and an exercise used to isolate the muscles of the chest."));
        exercises.add(new ExerciseModel(R.drawable.shoulder1, "Seated military press", "Along with building anterior, medial and rear deltoid strength, this exercise also targets the upper back. Sitting, hold a dumbbell in each hand, and raise both weights to shoulder level with palms facing out and elbows bent."));
        exercises.add(new ExerciseModel(R.drawable.back1, "Barbell Row", "This move mostly targets the latissimus dorsi but also strengthens the trapezius and posterior deltoids"));
        exercises.add(new ExerciseModel(R.drawable.back2, "Pulldown", "Pulldowns mainly target the latissimus dorsi, a large muscle located in the middle and lower back."));
        exercises.add(new ExerciseModel(R.drawable.leg1, "Leg Press", "The leg press doesn’t have you load your torso with weight and your back braces against a pad, which gives you more driving force."));
        exercises.add(new ExerciseModel(R.drawable.leg2, "Leg Extension", "The leg extension is a stellar exercise to hone in on your quads when performed with control and proper form."));
        // Add more exercises...

        ExerciseAdapter adapter = new ExerciseAdapter(this, exercises);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        //Making some show text message
        Toast.makeText(this, "EXERCISES",Toast.LENGTH_SHORT).show();

    }
}

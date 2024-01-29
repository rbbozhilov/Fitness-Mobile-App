package com.example.myapplication2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication2.R;

import java.util.List;

public class ExerciseAdapter extends ArrayAdapter<ExerciseModel> {

    public ExerciseAdapter(Context context, List<ExerciseModel> exercises) {
        super(context, 0, exercises);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.exercise_item, parent, false);
        }

        ImageView exerciseImage = convertView.findViewById(R.id.exerciseImage);
        TextView exerciseName = convertView.findViewById(R.id.exerciseName);
        TextView exerciseDescription = convertView.findViewById(R.id.exerciseDescription);

        ExerciseModel currentExercise = getItem(position);

        if (currentExercise != null) {
            exerciseImage.setImageResource(currentExercise.getImageResourceId());
            exerciseName.setText(currentExercise.getExerciseName());
            exerciseDescription.setText(currentExercise.getExerciseDescription());
        }

        return convertView;
    }
}
package com.example.myapplication2;

public class ExerciseModel {
    private int imageResourceId;
    private String exerciseName;
    private String exerciseDescription;

    public ExerciseModel(int imageResourceId, String exerciseName, String exerciseDescription) {
        this.imageResourceId = imageResourceId;
        this.exerciseName = exerciseName;
        this.exerciseDescription = exerciseDescription;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public String getExerciseDescription() {
        return exerciseDescription;
    }
}

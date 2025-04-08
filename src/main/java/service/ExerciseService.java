//ExerciseService.java - Antoni Maqueda
package service;

import model.Exercici;
import java.util.List;
import conection.DataAccess;
import java.util.ArrayList;
import model.Workout;

public class ExerciseService {

    public List<Exercici> getAllExercises() {
        return DataAccess.getAllExercicis();
    }

    public static ArrayList<Exercici> getExercicisPerWorkout(Workout workout){
        return DataAccess.getExercicisPerWorkout(workout);
    }

    public static void createExercise(Exercici exercise, int workoutId) {
        DataAccess.addExerciciToWorkout(exercise, workoutId);
    }

    public static void updateExercise(Exercici exercise) {
        DataAccess.updateExercici(exercise);
    }

    public static boolean deleteExercise(int exerciseId) {
    return DataAccess.deleteExercici(exerciseId);
    }
    
}
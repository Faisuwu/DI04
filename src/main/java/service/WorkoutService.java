//WorkoutService.java - Antoni Maqueda
package service;

import model.Workout;
import model.Exercici;
import model.Usuari;
import java.util.ArrayList;
import java.util.List;
import conection.DataAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class WorkoutService {

    // Métode per obtenir tots els workouts d'un usuari
    public List<Workout> getWorkoutsByUserId(Usuari user) {
        return DataAccess.getWorkoutsPerUser(user);
    }

    public Workout getWorkoutsById(int id) {
        return DataAccess.getWorkoutPerId(id);
    }
    
    // Métode per crear un nou workout
    public void createWorkout(Workout workout, ArrayList<Exercici> exercicis) {
        DataAccess.insertWorkout(workout, exercicis);
    }

    public void updateWorkout(Workout workout) {
        DataAccess.updateWorkout(workout);
    }

    public void deleteWorkout(int workoutId) {
        DataAccess.deleteWorkout(workoutId);
    }

}
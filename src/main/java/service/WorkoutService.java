//WorkoutService.java - Antoni Maqueda
package service;

import model.Workout;
import model.Exercici;
import model.Usuari;
import java.util.ArrayList;
import java.util.List;
import conection.DataAccess;


/**
 * Classe de servei encarregada de gestionar operacions relacionades amb entrenaments (workouts).
 * @author Antoni Maqueda
 */
public class WorkoutService {

    /**
     * Obté tots els workouts associats a un usuari.
     * 
     * @param user L'usuari del qual obtenir els entrenaments.
     * @return Llista de workouts.
     */
    public List<Workout> getWorkoutsByUserId(Usuari user) {
        return DataAccess.getWorkoutsPerUser(user);
    }

    /**
     * Obté un workout específic pel seu identificador.
     * 
     * @param id L'identificador del workout.
     * @return L'entrenament trobat.
     */
    public Workout getWorkoutsById(int id) {
        return DataAccess.getWorkoutPerId(id);
    }
    
    /**
     * Crea un nou entrenament amb els exercicis associats.
     * 
     * @param workout L'entrenament a crear.
     * @param exercicis La llista d'exercicis per a l'entrenament.
     */
    public void createWorkout(Workout workout, ArrayList<Exercici> exercicis) {
        DataAccess.insertWorkout(workout, exercicis);
    }

    /**
     * Actualitza les dades d'un entrenament existent.
     * 
     * @param workout L'entrenament actualitzat.
     */
    public void updateWorkout(Workout workout) {
        DataAccess.updateWorkout(workout);
    }

    /**
     * Elimina un entrenament pel seu identificador.
     * 
     * @param workoutId L'identificador del workout a eliminar.
     */
    public void deleteWorkout(int workoutId) {
        DataAccess.deleteWorkout(workoutId);
    }
}

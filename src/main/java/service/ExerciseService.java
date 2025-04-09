//ExerciseService.java - Antoni Maqueda
package service;

import model.Exercici;
import java.util.List;
import conection.DataAccess;
import java.util.ArrayList;
import model.Workout;

/**
 * Classe de servei encarregada de gestionar operacions relacionades amb els exercicis.
 * @author Antoni Maqueda
 */
public class ExerciseService {

    /**
     * Obté tots els exercicis disponibles.
     * 
     * @return Llista d'exercicis.
     */
    public List<Exercici> getAllExercises() {
        return DataAccess.getAllExercicis();
    }

    /**
     * Obté els exercicis associats a un workout específic.
     * 
     * @param workout L'entrenament del qual obtenir els exercicis.
     * @return Llista d'exercicis.
     */
    public static ArrayList<Exercici> getExercicisPerWorkout(Workout workout){
        return DataAccess.getExercicisPerWorkout(workout);
    }

    /**
     * Afegeix un exercici a un workout específic.
     * 
     * @param exercise L'exercici a afegir.
     * @param workoutId L'identificador del workout.
     */
    public static void createExercise(Exercici exercise, int workoutId) {
        DataAccess.addExerciciToWorkout(exercise, workoutId);
    }

    /**
     * Actualitza les dades d'un exercici.
     * 
     * @param exercise L'exercici actualitzat.
     */
    public static void updateExercise(Exercici exercise) {
        DataAccess.updateExercici(exercise);
    }

    /**
     * Elimina un exercici donat el seu ID.
     * 
     * @param exerciseId L'identificador de l'exercici.
     * @return true si s'ha eliminat correctament, false altrament.
     */
    public static boolean deleteExercise(int exerciseId) {
        return DataAccess.deleteExercici(exerciseId);
    }
}
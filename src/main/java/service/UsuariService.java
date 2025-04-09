//UsuariService.java - Antoni Maqueda
package service;

import model.Usuari;
import model.Workout;
import java.util.List;
import conection.DataAccess;

/**
 * Classe de servei encarregada de gestionar operacions relacionades amb els usuaris.
 * @author Antoni Maqueda
 */
public class UsuariService {

    /**
     * Obté tots els workouts associats a un usuari.
     * 
     * @param user L'usuari del qual obtenir els workouts.
     * @return Llista de workouts.
     */
    public List<Workout> getWorkoutsByUser(Usuari user) {
        return DataAccess.getWorkoutsPerUser(user);
    }

    /**
     * Obté tots els usuaris del sistema.
     * 
     * @return Llista d'usuaris.
     */
    public List<Usuari> getAllUsers(){
        return DataAccess.getAllUsers();
    }

    /**
     * Obté tots els usuaris associats a un instructor específic.
     * 
     * @param idInstructor L'identificador de l'instructor.
     * @return Llista d'usuaris associats.
     */
    public List<Usuari> getAllUsersByInstructor(int idInstructor){
        return DataAccess.getAllUsersByInstructor(idInstructor);
    }

    /**
     * Valida un usuari amb nom i contrasenya.
     * 
     * @param username Nom d'usuari.
     * @param password Contrasenya en text pla.
     * @return L'usuari validat, o null si no és vàlid.
     */
    public static Usuari validateLogin(String username, String password) {
        return DataAccess.validateLogin(username, password);
    }

    /**
     * Imprimeix tots els usuaris per consola.
     */
    public void imprimirUsuaris() {
        DataAccess.imprimirUsuaris();
    }

    /**
     * Obté un usuari pel seu nom d'usuari.
     * 
     * @param username Nom d'usuari a buscar.
     * @return L'usuari trobat o null si no existeix.
     */
    public Usuari obtenirUsuariPerNom(String username) {
        return DataAccess.obtenirUsuariPerNom(username);
    }   
}

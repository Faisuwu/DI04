//UsuariService.java - Antoni Maqueda
package service;

import model.Usuari;
import model.Workout;
import java.util.List;
import conection.DataAccess;

public class UsuariService {
    
    //Métode per obtenir els Workouts d'un usuari
    public  List<Workout> getWorkoutsByUser(Usuari user) {
        return DataAccess.getWorkoutsPerUser(user);
    }
    //Métode per obtenir tots els usuaris
    public List<Usuari> getAllUsers(){
        return DataAccess.getAllUsers();
    }
    public List<Usuari> getAllUsersByInstructor(int idInstructor){
        return DataAccess.getAllUsersByInstructor(idInstructor);
    }
    public static Usuari validateLogin(String username, String password) {
        return DataAccess.validateLogin(username, password);
    }

    public void imprimirUsuaris() {
        DataAccess.imprimirUsuaris();
    }

    public Usuari obtenirUsuariPerNom(String username) {
        return DataAccess.obtenirUsuariPerNom(username);
    }   
}
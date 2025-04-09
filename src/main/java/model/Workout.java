//Workout.java - Antoni Maqueda
package model;

/**
 * Classe que representa una rutina d'exercicis d'un usuari.
 * @author Antoni Maqueda
 */
public class Workout {

    private int id;
    private String name;
    private String date;
    private int userId;
    private String comments;

    /** @return L'identificador de l'entrenament. */
    public int getId() { return id; }

    /** @param id L'identificador a assignar. */
    public void setId(int id) { this.id = id; }

    /** @return El nom de l'entrenament. */
    public String getName() { return name; }

    /** @param name El nou nom de l'entrenament. */
    public void setName(String name) { this.name = name; }

    /** @return La data programada de l'entrenament. */
    public String getForDate() { return date; }

    /** @param date La nova data de l'entrenament. */
    public void setForDate(String date) { this.date = date; }

    /** @return L'identificador de l'usuari del entrenament. */
    public int getIdUsuari() { return userId; }

    /** @param userId El nou ID de l'usuari. */
    public void setIdUsuari(int userId) { this.userId = userId; }

    /** @return Els comentaris de l'entrenament. */
    public String getComments() { return comments; }

    /** @param comments Els nous comentaris a assignar. */
    public void setComments(String comments) { this.comments = comments; }
}
//Usuari.java - Antoni Maqueda
package model;

/**
 * Classe que representa un usuari de l'aplicació.
 * @author Antoni Maqueda
 */
public class Usuari {

    private int id;
    private String email;
    private String hashedPassword;
    private String name;
    private Boolean instructor;

    /** @return L'identificador de l'usuari. */
    public int getId() { return id; }

    /** @param id L'identificador a assignar. */
    public void setId(int id) { this.id = id; }

    /** @return El correu electrònic de l'usuari. */
    public String getEmail() { return email; }

    /** @param email El nou correu electrònic. */
    public void setEmail(String email) { this.email = email; }

    /** @return La contrasenya xifrada. */
    public String getPasswordHash() { return hashedPassword; }

    /** @param hashedPassword La nova contrasenya xifrada. */
    public void setPasswordHash(String hashedPassword) { this.hashedPassword = hashedPassword; }

    /** @return El nom de l'usuari. */
    public String getNom() { return name; }

    /** @param name El nou nom de l'usuari. */
    public void setNom(String name) { this.name = name; }

    /** @return true si és instructor, false si no. */
    public Boolean isInstructor() { return instructor; }

    /** @param instructor Defineix si l'usuari és un instructor. */
    public void setInstructor(Boolean instructor) { this.instructor = instructor; }
}
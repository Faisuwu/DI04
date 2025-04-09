//Exercici.java - Antoni Maqueda
package model;

/**
 * Classe que representa un exercici físic amb nom, descripció i imatge.
 * @author Antoni Maqueda
 */
public class Exercici {

    private int id;
    private String name;
    private String description;
    private String imagePath;

    /** @return L'identificador de l'exercici. */
    public int getId() { return id; }

    /** @param id L'identificador a assignar. */
    public void setId(int id) { this.id = id; }

    /** @return El nom de l'exercici. */
    public String getNomExercici() { return name; }

    /** @param name El nou nom de l'exercici. */
    public void setNomExercici(String name) { this.name = name; }

    /** @return La descripció de l'exercici. */
    public String getDescripcio() { return description; }

    /** @param description La nova descripció. */
    public void setDescripcio(String description) { this.description = description; }

    /** @return El camí de la imatge de demostració. */
    public String getDemoFoto() { return imagePath; }

    /** @param imagePath El nou camí de la imatge. */
    public void setDemoFoto(String imagePath) { this.imagePath = imagePath; }
}

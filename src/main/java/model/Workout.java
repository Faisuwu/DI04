//Antoni Maqueda Bestard - DI01 - Workout
package model;

public class Workout {
    
    private int id;
    private String name;
    private String date;
    private int userId;
    private String comments;

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getForDate() { return date; }
    public void setForDate(String date) { this.date = date; }

    public int getIdUsuari() { return userId; }
    public void setIdUsuari(int userId) { this.userId = userId; }
    
    public String getComments() { return comments; }
    public void setComments(String comments) { this.comments = comments; }
}

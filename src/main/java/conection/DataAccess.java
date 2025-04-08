//DataAccess.java - Antoni Maqueda / Mike
package conection;

import model.Exercici;
import model.Usuari;
import model.Workout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DataAccess {

    // Cadena de connexió a Azure SQL Server
    private static final String CONNECTION_STRING = 
        "jdbc:sqlserver://simulapsqlserver.database.windows.net:1433;"
        + "database=simulapdb25;"
        + "user=simulapdbadmin@simulapsqlserver;"
        + "password=Pwd1234.;"
        + "encrypt=true;"
        + "trustServerCertificate=false;"
        + "hostNameInCertificate=*.database.windows.net;"
        + "loginTimeout=30;";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static Usuari getUser(String email) {
        Usuari user = null;
        String sql = "SELECT * FROM Usuaris WHERE Email = ?";
        try (Connection connection = getConnection(); PreparedStatement selectStatement = connection.prepareStatement(sql);) {
            selectStatement.setString(1, email);
            ResultSet resultSet = selectStatement.executeQuery();
            user = new Usuari();
            while (resultSet.next()) {
                user.setId(resultSet.getInt("Id"));
                user.setNom(resultSet.getString("Nom"));
                user.setEmail(resultSet.getString("Email"));
                user.setPasswordHash(resultSet.getString("PasswordHash"));
                user.setInstructor(resultSet.getBoolean("Instructor"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public static ArrayList<Usuari> getAllUsers() {
        ArrayList<Usuari> usuaris = new ArrayList<>();
        String sql = "SELECT * FROM Usuaris WHERE Instructor=0";
        try (Connection connection = getConnection(); PreparedStatement selectStatement = connection.prepareStatement(sql);) {

            ResultSet resultSet = selectStatement.executeQuery();

            while (resultSet.next()) {
                Usuari user = new Usuari();
                user.setId(resultSet.getInt("Id"));
                user.setNom(resultSet.getString("Nom"));
                user.setEmail(resultSet.getString("Email"));
                user.setPasswordHash(resultSet.getString("PasswordHash"));
                user.setInstructor(resultSet.getBoolean("Instructor"));
                usuaris.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuaris;
    }
    
    public static Usuari validateLogin(String username, String password) {
        String query = "SELECT * FROM Usuaris WHERE Email = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String hashedPassword = rs.getString("PasswordHash");

                // Verifica la contraseña amb BCrypt
                if (BCryptUtils.verify(password, hashedPassword)) {
                    Usuari usuari = new Usuari();
                    usuari.setId(rs.getInt("Id"));
                    usuari.setNom(rs.getString("Nom"));
                    usuari.setEmail(rs.getString("Email"));
                    usuari.setPasswordHash(hashedPassword);
                    usuari.setInstructor(rs.getBoolean("Instructor"));
                    return usuari;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null; // Usuari no trobat o contrasenya incorrecta
    }

    public static ArrayList<Usuari> getAllUsersByInstructor(int idInstructor) {
        ArrayList<Usuari> usuaris = new ArrayList<>();
        String sql = "SELECT * FROM Usuaris WHERE AssignedInstructor=?";
        try (Connection connection = getConnection(); PreparedStatement selectStatement = connection.prepareStatement(sql);) {
            selectStatement.setInt(1, idInstructor);
            ResultSet resultSet = selectStatement.executeQuery();

            while (resultSet.next()) {
                Usuari user = new Usuari();
                user.setId(resultSet.getInt("Id"));
                user.setNom(resultSet.getString("Nom"));
                user.setEmail(resultSet.getString("Email"));
                user.setPasswordHash(resultSet.getString("PasswordHash"));
                user.setInstructor(resultSet.getBoolean("Instructor"));
                usuaris.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuaris;
    }

    public static ArrayList<Workout> getWorkoutsPerUser(Usuari user) {
        ArrayList<Workout> workouts = new ArrayList<>();
        String sql = "SELECT Workouts.Id, Workouts.ForDate, Workouts.UserId, Workouts.Comments"
                + " FROM Workouts"
                + " WHERE Workouts.UserId=?"
                + " ORDER BY Workouts.ForDate";
        try (Connection connection = getConnection(); PreparedStatement selectStatement = connection.prepareStatement(sql);) {
            selectStatement.setInt(1, user.getId());
            ResultSet resultSet = selectStatement.executeQuery();

            while (resultSet.next()) {
                Workout workout = new Workout();
                workout.setId(resultSet.getInt("Id"));
                workout.setForDate(resultSet.getString("ForDate"));
                workout.setIdUsuari(resultSet.getInt("UserId"));

                workouts.add(workout);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return workouts;

    }
    public static Workout getWorkoutPerId(int id) {
        Workout work = null;
        String sql = "SELECT * FROM Workouts WHERE id = ?";
        try (Connection connection = getConnection(); PreparedStatement selectStatement = connection.prepareStatement(sql);) {
            selectStatement.setInt(1, id);
            ResultSet resultSet = selectStatement.executeQuery();
            work = new Workout();
            while (resultSet.next()) {
                work.setId(resultSet.getInt("Id"));
                work.setForDate(resultSet.getString("ForDate"));
                work.setIdUsuari(resultSet.getInt("UserId"));
                work.setComments(resultSet.getString("Comments"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return work;
    }

    public static ArrayList<Exercici> getExercicisPerWorkout(Workout workout) {
        ArrayList<Exercici> exercicis = new ArrayList<>();
        String sql = "SELECT ExercicisWorkouts.IdExercici,"
                + " Exercicis.NomExercici, Exercicis.Descripcio, Exercicis.DemoFoto"
                + " FROM ExercicisWorkouts INNER JOIN Exercicis ON ExercicisWorkouts.IdExercici=Exercicis.Id"
                + " WHERE ExercicisWorkouts.IdWorkout=?";
        try (Connection connection = getConnection(); PreparedStatement selectStatement = connection.prepareStatement(sql);) {
            selectStatement.setInt(1, workout.getId());
            ResultSet resultSet = selectStatement.executeQuery();

            while (resultSet.next()) {
                Exercici exercici = new Exercici();
                exercici.setId(resultSet.getInt("IdExercici"));
                exercici.setNomExercici(resultSet.getString("NomExercici"));
                exercici.setDescripcio(resultSet.getString("Descripcio"));
                exercici.setDemoFoto(resultSet.getString("DemoFoto"));

                exercicis.add(exercici);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exercicis;
    }

    public static ArrayList<Exercici> getAllExercicis() {
        ArrayList<Exercici> exercicis = new ArrayList<>();
        String sql = "SELECT Id, Exercicis.NomExercici, Exercicis.Descripcio, Exercicis.DemoFoto"
                + " FROM Exercicis";
        try (Connection connection = getConnection(); PreparedStatement selectStatement = connection.prepareStatement(sql);) {

            ResultSet resultSet = selectStatement.executeQuery();

            while (resultSet.next()) {
                Exercici exercici = new Exercici();
                exercici.setId(resultSet.getInt("Id"));
                exercici.setNomExercici(resultSet.getString("NomExercici"));
                exercici.setDescripcio(resultSet.getString("Descripcio"));
                exercici.setDemoFoto(resultSet.getString("DemoFoto"));

                exercicis.add(exercici);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exercicis;
    }

    public static int registerUser(Usuari u) {
        String sql = "INSERT INTO dbo.Usuaris (Nom, Email, PasswordHash, Instructor)"
                + " VALUES (?,?,?,?)"
                + " SELECT CAST(SCOPE_IDENTITY() as int)";
        try (Connection conn = getConnection(); PreparedStatement insertStatement = conn.prepareStatement(sql)) {
            insertStatement.setString(1, u.getNom());
            insertStatement.setString(2, u.getEmail());
            insertStatement.setString(3, u.getPasswordHash());
            insertStatement.setBoolean(4, u.isInstructor());

            int newUserId = insertStatement.executeUpdate();
            return newUserId;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void insertWorkout(Workout w, ArrayList<Exercici> exercicis) {
        
        for (Exercici e : exercicis) {
            if (e.getId() <= 0) {
                int newId = insertExercici(e);
                e.setId(newId);
            }
        }

        int newWorkoutId = insertToWorkoutTable(w);

        insertExercisesPerWorkout(newWorkoutId, exercicis);
    }
    
    public static int insertExercici(Exercici e) {
        String sql = "INSERT INTO dbo.Exercicis (NomExercici, Descripcio, DemoFoto) VALUES (?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, e.getNomExercici());
            ps.setString(2, e.getDescripcio());
            ps.setString(3, e.getDemoFoto());

            int affectedRows = ps.executeUpdate();

            if (affectedRows > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    private static int insertToWorkoutTable(Workout w) {
        String sql = "INSERT INTO dbo.Workouts (ForDate, UserId, Comments)"
                + " VALUES (?,?,?)";
        try (Connection conn = getConnection();
                PreparedStatement insertStatement = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                ) {
            insertStatement.setString(1, w.getForDate());
            insertStatement.setInt(2, w.getIdUsuari());
            insertStatement.setString(3, w.getComments());

            int affectedRows = insertStatement.executeUpdate();
            
            if (affectedRows > 0) {
                ResultSet resultSet = insertStatement.getGeneratedKeys();
                if (resultSet.next()) {
                    int lastInsertedId = resultSet.getInt(1);
                    return lastInsertedId;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static int insertExercisesPerWorkout(int wId, ArrayList<Exercici> exercicis) {
        for(Exercici e: exercicis) {
            int rowsAffected = insertExerciciPerWorkout(wId, e);
            if (rowsAffected != 1) {
                return 0;
            }
        }
        return exercicis.size();
    }

    private static int insertExerciciPerWorkout(int wId, Exercici e) {
        String sql = "INSERT INTO dbo.ExercicisWorkouts (IdWorkout, IdExercici)"
                + " VALUES (?,?)";
        try (Connection conn = getConnection(); PreparedStatement insertStatement = conn.prepareStatement(sql)) {
            insertStatement.setInt(1, wId);
            insertStatement.setInt(2, e.getId());
            int rowsAffected = insertStatement.executeUpdate();
            return rowsAffected;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    public static void updateExercici(Exercici e) {
        String sql = "UPDATE dbo.Exercicis SET NomExercici = ?, Descripcio = ?, DemoFoto = ? WHERE Id = ?";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, e.getNomExercici());
            ps.setString(2, e.getDescripcio());
            ps.setString(3, e.getDemoFoto());
            ps.setInt(4, e.getId());

            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public static boolean deleteExercici(int idExercici) {
        String sql = "DELETE FROM dbo.Exercicis WHERE Id = ?";

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idExercici);
            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            
            if (ex.getSQLState().equals("23000")) {
                System.out.println("L'exercici forma part d’un workout. No es pot eliminar.");
                return false;
            } else {
                ex.printStackTrace();
            }
        }
        return false;
    }

    
    public static void addExerciciToWorkout(Exercici e, int workoutId) {
        int exerciciId = insertExercici(e);
        if (exerciciId > 0) {
            e.setId(exerciciId);
            insertExerciciPerWorkout(workoutId, e);
        }
    }
    // Actualitzar un workout. No l'utilitz
    public static void updateWorkout(Workout workout) {
        String sql = "UPDATE Workouts SET ForDate = ?, UserId = ?, Comments = ? WHERE Id = ?";

        try (Connection conn = getConnection();
             PreparedStatement updateStatement = conn.prepareStatement(sql)) {

            updateStatement.setString(1, workout.getForDate());
            updateStatement.setInt(2, workout.getIdUsuari());
            updateStatement.setString(3, workout.getComments());
            updateStatement.setInt(4, workout.getId());

            updateStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Eliminar un workout. No l'utilitz
    public static void deleteWorkout(int workoutId) {
        String sql = "DELETE FROM Workouts WHERE Id = ?";

        try (Connection conn = getConnection();
             PreparedStatement deleteStatement = conn.prepareStatement(sql)) {

            deleteStatement.setInt(1, workoutId);
            deleteStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Métode que he utilitzat a debug per imprimir usuaris
    public static void imprimirUsuaris() {
        String query = "SELECT * FROM Usuaris";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("Llista d'usuaris:");
            while (rs.next()) {
                int id = rs.getInt("Id");
                String nom = rs.getString("Nom");
                String hash = rs.getString("PasswordHash");

                System.out.println("ID: " + id + ", Nom: " + nom + ", Hash: " + hash);
            }

        } catch (SQLException e) {
            System.err.println("Error al consultar la base de dades:");
            e.printStackTrace();
        }
    }

    // Obtenir un usuari per el seu nom
    public static Usuari obtenirUsuariPerNom(String username) {
        String query = "SELECT * FROM Usuaris WHERE Nom = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Usuari usuari = new Usuari();
                usuari.setId(rs.getInt("Id"));
                usuari.setNom(rs.getString("Nom"));
                usuari.setEmail(rs.getString("Email"));
                usuari.setPasswordHash(rs.getString("PasswordHash"));
                usuari.setInstructor(rs.getBoolean("Instructor"));
                return usuari;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
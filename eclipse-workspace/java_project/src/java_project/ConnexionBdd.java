package java_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBdd {
    private static final String URL = "jdbc:mysql://localhost:3306/maintenance_app";
    private static final String USER = "etudiant";
    private static final String PASSWORD = "etudiant";

    private static Connection connection;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                } catch (ClassNotFoundException e) {
                    System.err.println("Driver MySQL introuvable");
                    e.printStackTrace();
                    return null;
                }

                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Connexion à la BDD réussie");
            }
        } catch (SQLException e) {
            System.err.println("Erreur de connexion à la BDD");
            e.printStackTrace();
        }
        return connection;
    }
}

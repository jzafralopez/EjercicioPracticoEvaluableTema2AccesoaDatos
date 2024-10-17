package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Uso estándar de la clase DriverManager para obtener una conexión a la base de datos.
 * (Creación de una conexión y usar el DriveManager para obtenerla).
 **/
public class JdbcUtil {

    private static Connection connection;

    static {
        String url = "jdbc:mysql://localhost:3306/primerabd";
        String user = "root";
        String password = "NIPUTAIDEA32";
        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() { return connection; }
}

package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgresConnection {
    private static String conUrl = "jdbc:postgresql://localhost:5432/postgres";
    private static String username = "postgres";
    private static String password = "******";

    public static Connection connection() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection db = DriverManager.getConnection(conUrl, username, password);
            return db;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

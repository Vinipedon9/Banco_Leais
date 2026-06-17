package br.com.bancoleais.Database;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException {
        Dotenv dotenv = Dotenv.load();

        try {
            final String url = dotenv.get("DB_URL");
            final String user = dotenv.get("DB_USER");
            final String password = dotenv.get("DB_PASSWORD");

            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

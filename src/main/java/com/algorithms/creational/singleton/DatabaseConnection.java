package com.algorithms.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static Connection connection;

    private DatabaseConnection() {

    }

    public static Connection getInstance(AssembleConnectionPayload content) throws SQLException {
        if (connection == null) {
            ConnectionPayload connectionPayload = content.get();
            final String URI = "jdbc:mysql://localhost/%s?user=%s&password=%s";
            return DriverManager.getConnection(String.format(
                    URI, connectionPayload.getDatabase(), connectionPayload.getUser(), connectionPayload.getPassword()
            ));
        }
        return connection;
    }

}

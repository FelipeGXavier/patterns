package com.algorithms.creational.singleton.app;

import com.algorithms.creational.singleton.*;
import org.json.JSONObject;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        JSONObject credentials = new JSONObject("{\n" +
                "   \"user\":\"root\",\n" +
                "   \"password\":\"root\",\n" +
                "   \"database\":\"testing\"\n" +
                "}");
        AssembleConnectionPayload json = new JsonPayload(credentials);
        Connection connection = DatabaseConnection.getInstance(json);

    }
}

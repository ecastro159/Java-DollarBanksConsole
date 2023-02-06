package com.cognixia.jump.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;;

public class ConnectionManager {
    private static Connection connection = null;

    private static void makeConnection() {
        Properties props = new Properties();

        try {
            props.load(new FileInputStream("src/main/java/com/cognixia/jump/utility/config_properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String url = props.getProperty("url");
        String userpassword = props.getProperty("username");
        String password = props.getProperty("password");

        try {
            connection = DriverManager.getConnection(url, userpassword, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection() {
        if (connection == null) {
            makeConnection();
        }
        return connection;
    }

    // Test Connection
    public static void main(String[] args) {
        Connection conn = ConnectionManager.getConnection();
        System.out.println("Made Connection");

        try {
            conn.close();
            System.out.println("Closed Connection");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

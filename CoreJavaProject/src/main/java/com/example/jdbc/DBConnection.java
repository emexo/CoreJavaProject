package com.example.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    public static Connection getConnection() throws IOException, SQLException {
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\Regu\\workspace\\Jdbc Example\\src\\com\\exampl\\jdbc\\db.properties");
        props.load(fis);

        Connection conn = DriverManager.getConnection(props.getProperty("DB_URL"),
                props.getProperty("DB_USERNAME"), props.getProperty("DB_PASSWORD"));
            return conn;
        }
}

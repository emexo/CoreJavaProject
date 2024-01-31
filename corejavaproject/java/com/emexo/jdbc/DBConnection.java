package com.emexo.jdbc;

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
        FileInputStream fis = new FileInputStream("/Applications/Projects/CoreJavaRepo/corejavaproject/src/main/resources/db.properties");
        props.load(fis);

        Connection conn = DriverManager.getConnection(props.getProperty("db.url"),
                props.getProperty("db.username"), props.getProperty("db.password"));
            return conn;
        }
}
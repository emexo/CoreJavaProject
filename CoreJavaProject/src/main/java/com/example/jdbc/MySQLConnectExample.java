package com.example.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLConnectExample {
	public static void main(String[] args) throws IOException {

		// creates three different Connection objects
		Connection conn1 = null;
		Connection conn2 = null;
		Connection conn3 = null;

		try {
			// connect way #1
			String url1 = "jdbc:mysql://localhost:3306/regu";
			String user = "root"; 
			String password = "Chennai@12345";			
			conn1 = DriverManager.getConnection(url1, user, password);
			if (conn1 != null) {
				System.out.println("Connected to the database regu");
			}

			// connect way #2
			String url2 = "jdbc:mysql://localhost:3306/regu?user=root&password=Chennai@12345";
			conn2 = DriverManager.getConnection(url2);
			if (conn2 != null) {
				System.out.println("Connected to the database regu");
			}

			// connect way #3
			Properties props = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\Regu\\workspace\\Jdbc Example\\src\\com\\exampl\\jdbc\\db.properties");
			props.load(fis);

			conn3 = DriverManager.getConnection(props.getProperty("DB_URL"),
					props.getProperty("DB_USERNAME"),
					props.getProperty("DB_PASSWORD"));
			if (conn3 != null) {
				System.out.println("Connected to the database regu");
			}
		} catch (SQLException ex) {
			System.out.println("An error occurred. Maybe user/password is invalid");
			ex.printStackTrace();
		}
	}
}

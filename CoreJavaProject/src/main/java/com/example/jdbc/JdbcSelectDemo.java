package com.example.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * A sample program that demonstrates how to execute SQL SELECT statement
 * using JDBC. 

 *
 */
public class JdbcSelectDemo {

	public static void main(String[] args) throws IOException {
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Regu\\workspace\\Jdbc Example\\src\\com\\exampl\\jdbc\\db.properties");
		props.load(fis);

		try (Connection conn = DriverManager.getConnection(props.getProperty("DB_URL"),
				props.getProperty("DB_USERNAME"), props.getProperty("DB_PASSWORD"))) {
			
			String sql = "SELECT * FROM Users";
			
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			
			
			int count = 0;
			
			while (result.next()){
				String name = result.getString(2);
				String pass = result.getString(3);
				String fullname = result.getString("fullname");
				String email = result.getString("email");
				
				String output = "User #%d: %s - %s - %s - %s";
				System.out.println(String.format(output, ++count, name, pass, fullname, email));
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}		
	}
}
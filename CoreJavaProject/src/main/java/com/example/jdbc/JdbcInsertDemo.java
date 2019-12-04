package com.example.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Statement;

/**
 * A sample program that demonstrates how to execute SQL INSERT statement using
 * JDBC.
 *
 * 
 */
public class JdbcInsertDemo {

	public static void main(String[] args) throws IOException {
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Regu\\workspace\\Jdbc Example\\src\\com\\exampl\\jdbc\\db.properties");
		props.load(fis);

		try (Connection conn = DriverManager.getConnection(props.getProperty("DB_URL"),
				props.getProperty("DB_USERNAME"), props.getProperty("DB_PASSWORD"))) {

			String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";

			PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, "bill");
			statement.setString(2, "secretpass");
			statement.setString(3, "Bill Gates");
			statement.setString(4, "bill.gates@microsoft.com");

			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new user was inserted successfully!");
			}
			
			ResultSet rs = statement.getGeneratedKeys();
			int generatedKey = 0;
			if (rs.next()) {
			    generatedKey = rs.getInt(1);
			}
			 
			System.out.println("Inserted record's ID: " + generatedKey);

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
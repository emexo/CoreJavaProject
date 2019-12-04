package com.example.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * A sample program that demonstrates how to execute SQL UPDATE statement
 * using JDBC.
 *
 */
public class JdbcUpdateDemo {

	public static void main(String[] args) throws IOException {
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Regu\\workspace\\Jdbc Example\\src\\com\\exampl\\jdbc\\db.properties");
		props.load(fis);

		try (Connection conn = DriverManager.getConnection(props.getProperty("DB_URL"),
				props.getProperty("DB_USERNAME"), props.getProperty("DB_PASSWORD"))) {

			String sql = "UPDATE Users SET password=?, fullname=?, email=? WHERE user_id=?";

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "3423");
			statement.setString(2, "test name");
			statement.setString(3, "full name");
			statement.setInt(4, 5);

			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("An existing user was updated successfully!");
				System.out.println(rowsUpdated);
			}


		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
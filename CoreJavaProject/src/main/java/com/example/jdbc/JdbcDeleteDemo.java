package com.example.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * A sample program that demonstrates how to execute SQL DELETE statement using
 * JDBC.
 *
 * 
 */
public class JdbcDeleteDemo {

	public static void main(String[] args) throws IOException {
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Regu\\workspace\\Jdbc Example\\src\\com\\exampl\\jdbc\\db.properties");
		props.load(fis);

		try (Connection conn = DriverManager.getConnection(props.getProperty("DB_URL"),
				props.getProperty("DB_USERNAME"), props.getProperty("DB_PASSWORD"))) {

			String sql = "DELETE FROM Users WHERE username=?";

			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "bill");

			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("A user was deleted successfully!");
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
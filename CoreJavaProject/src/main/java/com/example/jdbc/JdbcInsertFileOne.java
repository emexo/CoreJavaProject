package com.example.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
 
public class JdbcInsertFileOne {
 
    public static void main(String[] args) throws IOException {
    	Properties props = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Regu\\G\\Java Workspace\\Jdbc\\src\\com\\exampl\\jdbc\\db.properties");
		props.load(fis);
		String filePath = "C:\\Users\\Regu\\Pictures\\download.jpg";

		try (Connection conn = DriverManager.getConnection(props.getProperty("DB_URL"),
				props.getProperty("DB_USERNAME"), props.getProperty("DB_PASSWORD"))) {
 
            String sql = "INSERT INTO person (first_name, last_name, photo) values (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "Tom");
            statement.setString(2, "Eagar");
            InputStream inputStream = new FileInputStream(new File(filePath));
 
            statement.setBlob(3, inputStream);
 
            int row = statement.executeUpdate();
            if (row > 0) {
                System.out.println("A contact was inserted with photo image.");
            }
            conn.close();
        } catch (SQLException | IOException ex) {
            ex.printStackTrace();
        } 
    }
}

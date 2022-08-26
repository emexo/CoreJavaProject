package com.example.jdbc;

import java.sql.SQLException;

public class JDBCMain {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        User user = new User();
        user.setUserName("Karthik");
        user.setPassword("Chennai@12345");
        user.setFullName("Karthik C");
        user.setEmail("karthik@gmail.com");

        try {
            String response = userDAO.saveUser(user);
            System.out.println(response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

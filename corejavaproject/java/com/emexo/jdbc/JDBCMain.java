package com.emexo.jdbc;

import java.sql.SQLException;
import java.util.List;

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

            List<User> userList = userDAO.getAllUsers();
            for(User val: userList){
                System.out.println(val.getFullName()+ " " + val.getUserName() + " "+ val.getEmail());
            }

            User user1 = userDAO.getUserById(1);
            System.out.println(user1.getFullName()+ " " + user1.getUserName() + " "+ user1.getEmail());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
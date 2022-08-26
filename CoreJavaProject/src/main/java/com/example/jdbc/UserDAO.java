package com.example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * User DAO
 */
public class UserDAO {

    /**
     * Insert a new user
     * @param user
     * @return
     * @throws SQLException
     */
    public String saveUser(User user) throws SQLException {
        Connection conn = null;
        String response = null;
        try {
            conn = DBConnection.getConnection();
            String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, user.getUserName());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getFullName());
            statement.setString(4, user.getEmail());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                response = "A new user was inserted successfully!";
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            conn.close();
        }

        return response;
    }

    /**
     * Update a new user
     * @param user
     * @return
     * @throws SQLException
     */
    public String updateUser(User user) throws SQLException {
        Connection conn = null;
        String response = null;
        try {
            conn = DBConnection.getConnection();
            String sql = "UPDATE Users SET password=?, fullname=?, email=? WHERE user_id=?";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, user.getPassword());
            statement.setString(2, user.getFullName());
            statement.setString(3, user.getEmail());
            statement.setInt(4, user.getId());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                response = "A new user was updated successfully!";
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            conn.close();
        }

        return response;
    }

    /**
     * Delete a new user
     * @param id
     * @return
     * @throws SQLException
     */
    public String deleteUser(int id) throws SQLException{
        Connection conn = null;
        String response = null;
        try {
            conn = DBConnection.getConnection();
            String sql = "DELETE FROM Users WHERE user_id=?";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                response = "A new user was deleted successfully!";
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            conn.close();
        }

        return response;
    }
}

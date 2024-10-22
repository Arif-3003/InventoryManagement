/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import java.sql.SQLException;

/**
 *
 * @author MTBD
 */
public class DatabaseHandle {
    
   public void addNewUser(String name, String username1, String password1) {
    String query = "INSERT INTO login (name, username, password) VALUES (?, ?, ?)";
    try {
      Connection conn = (Connection) Conn.getCon();
      PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(query);
      stmt.setString(1, name);
      stmt.setString(2, username1);
      stmt.setString(3, password1);
      stmt.executeUpdate();
    } catch (SQLException e) {
    }
  }
   
    
}

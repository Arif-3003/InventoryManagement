/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author MTBD
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    private static final String URL = "jdbc:mysql://localhost:3306/inventory_management_system";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getCon() throws SQLException{
       /* try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_management_system?useSSL=false","root","");
            return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }*/
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}



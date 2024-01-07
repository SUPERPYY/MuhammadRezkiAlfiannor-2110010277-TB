/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class mengoneksikan {
    private static Connection con;
    public static Connection Koneksi() throws SQLException{
        if (con==null){
            try{
            String DB="jdbc:mysql://localhost:3306/rentalmobil_db";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection(DB, user,pass );
        }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
    }return con;
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class tambah_mobil {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    private String sql;
    
    public String id_mobil;
    public String nama_mobil;
    public String merek_mobil;
    public String harga_sewa;
    
    public void simpan()throws SQLException{
        conn = mengoneksikan.Koneksi();
        sql = "INSERT INTO db_mobil(id_mobil,nama_mobil,merek_mobil,harga_sewa)VALUES(?,?,?,?)";
        ps = conn.prepareStatement(sql);
        ps.setString(1, id_mobil);
        ps.setString(2, nama_mobil);
        ps.setString(3, merek_mobil);  
        ps.setString(4, harga_sewa);
        ps.execute();
        ps.close();  
    }
    
     public void edit()throws SQLException{
        conn = mengoneksikan.Koneksi();
        sql = "UPDATE db_mobil set nama_mobil=?,merek_mobil=?,harga_sewa=? where id_mobil=?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, nama_mobil);
        ps.setString(2, merek_mobil); 
        ps.setString(3, harga_sewa);
        ps.setString(4, id_mobil);
        ps.executeUpdate();
        ps.close();  
    }
     
     public void hapus()throws SQLException{
       conn = mengoneksikan.Koneksi();
       String sql = "DELETE from db_mobil where id_mobil=?";
       try{
        ps = conn.prepareStatement(sql);  
        ps.setString(1, id_mobil);
        ps.execute();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }
     
     public ResultSet TampilTabel()throws SQLException {
       conn = mengoneksikan.Koneksi();
       sql = "select id_mobil,nama_mobil,merek_mobil,harga_sewa from db_mobil";
       ps = conn.prepareStatement(sql); 
       rs = ps.executeQuery();  
       
        return rs;
     }
}

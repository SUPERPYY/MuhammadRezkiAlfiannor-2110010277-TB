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
public class penyewa_cl {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    private String sql;
    
    public String id_penyewa;
    public String nama;
    public String no_hp;
    public String alamat;
    
    public void simpan()throws SQLException{
        conn = mengoneksikan.Koneksi();
        sql = "INSERT INTO db_penyewa(id_penyewa,nama,no_hp,alamat)VALUES(?,?,?,?)";
        ps = conn.prepareStatement(sql);
        ps.setString(1, id_penyewa);
        ps.setString(2, nama);
        ps.setString(3, no_hp);  
        ps.setString(4, alamat);
        ps.execute();
        ps.close();  
    }
    
    public void edit()throws SQLException{
        conn = mengoneksikan.Koneksi();
        sql = "UPDATE db_penyewa set nama=?,no_hp=?,alamat=? where id_penyewa=?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, nama);
        ps.setString(2, no_hp);  
        ps.setString(3, alamat);
        ps.setString(4, id_penyewa);
        ps.executeUpdate();
        ps.close();  
    }
    
    public void hapus()throws SQLException{
       conn = mengoneksikan.Koneksi();
       String sql = "DELETE from db_penyewa where id_penyewa=?";
       try{
        ps = conn.prepareStatement(sql);  
        ps.setString(1, id_penyewa);
        ps.execute();
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }
    
    public ResultSet TampilTabel()throws SQLException {
       conn = mengoneksikan.Koneksi();
       sql = "select id_penyewa,nama,no_hp,alamat from db_penyewa";
       ps = conn.prepareStatement(sql); 
       rs = ps.executeQuery();  
       
        return rs;
     }
}

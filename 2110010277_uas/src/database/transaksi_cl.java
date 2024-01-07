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
public class transaksi_cl {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    private String sql;
    
    public String id_penyewa;
    public String nama_penyewa;
    public String id_mobil;
    public String tanggal_pinjam;
    public String tanggal_kembali;
    public String harga;
    public String lama;
    public String total;
    
    public void simpan()throws SQLException{
        conn = mengoneksikan.Koneksi();
        sql = "INSERT INTO db_transaksi(id_penyewa,nama_penyewa,id_mobil,tanggal_pinjam,tanggal_kembali,harga,lama,total)VALUES(?,?,?,?,?,?,?,?)";
        ps = conn.prepareStatement(sql);
        ps.setString(1, id_penyewa);
        ps.setString(2, nama_penyewa);
        ps.setString(3, id_mobil);  
        ps.setString(4, tanggal_pinjam);
        ps.setString(5, tanggal_kembali);
        ps.setString(6, harga);
        ps.setString(7, lama);
        ps.setString(8, total);
        ps.execute();
        ps.close();  
    }
    
    public void edit()throws SQLException{
        conn = mengoneksikan.Koneksi();
        sql = "UPDATE db_transaksi set nama_penyewa=?,id_mobil=?,tanggal_pinjam=?,tanggal_kembali=?,harga=?,lama=?,total=? where id_penyewa=?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, nama_penyewa);
        ps.setString(2, id_mobil);  
        ps.setString(3, tanggal_pinjam);
        ps.setString(4, tanggal_kembali);
        ps.setString(5, harga);
        ps.setString(6, lama);
        ps.setString(7, total);
        ps.setString(8, id_penyewa);
        ps.executeUpdate();
        ps.close();  
    }
    
    public void hapus()throws SQLException{
       conn = mengoneksikan.Koneksi();
       String sql = "DELETE from db_transaksi where id_penyewa=?";
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
       sql = "select id_penyewa,nama_penyewa,id_mobil,tanggal_pinjam,tanggal_kembali,harga,lama,total from db_transaksi";
       ps = conn.prepareStatement(sql); 
       rs = ps.executeQuery();  
       
        return rs;
     }
}

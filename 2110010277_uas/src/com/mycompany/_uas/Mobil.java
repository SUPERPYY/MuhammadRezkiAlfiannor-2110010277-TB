/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany._uas;

import database.tambah_mobil;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author ASUS
 */
public class Mobil extends javax.swing.JFrame {

    private void ViewData(){
       tambah_mobil hd = new tambah_mobil();
       try{
       jTable1.setModel(DbUtils.resultSetToTableModel(hd.TampilTabel()));
       
       
       }catch(Exception e){
       JOptionPane.showMessageDialog(null, e);
       }
    }
    /**
     * Creates new form Mobil
     */
    public Mobil() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        namaTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        merkTF = new javax.swing.JTextField();
        hargaTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        editBTN = new javax.swing.JButton();
        hapusBTN = new javax.swing.JButton();
        batalBTN = new javax.swing.JButton();
        simpanBTN = new javax.swing.JButton();
        kembaliBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORM DATA MOBIL");

        jLabel2.setText("Id Mobil");

        idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTFActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama Mobil");

        namaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTFActionPerformed(evt);
            }
        });

        jLabel4.setText("Merk Mobil");

        merkTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merkTFActionPerformed(evt);
            }
        });

        hargaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaTFActionPerformed(evt);
            }
        });

        jLabel5.setText("Harga Sewa");

        editBTN.setText("Edit");
        editBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBTNActionPerformed(evt);
            }
        });

        hapusBTN.setText("Hapus");
        hapusBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBTNActionPerformed(evt);
            }
        });

        batalBTN.setText("Batal");
        batalBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalBTNActionPerformed(evt);
            }
        });

        simpanBTN.setText("Simpan");
        simpanBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBTNActionPerformed(evt);
            }
        });

        kembaliBTN.setText("Kembali");
        kembaliBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliBTNActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(editBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapusBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(batalBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(simpanBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kembaliBTN))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(merkTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hargaTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(merkTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hargaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBTN)
                    .addComponent(hapusBTN)
                    .addComponent(batalBTN)
                    .addComponent(simpanBTN)
                    .addComponent(kembaliBTN))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBTNActionPerformed
        tambah_mobil hd = new tambah_mobil();
         hd.id_mobil = idTF.getText();
         hd.nama_mobil = namaTF.getText();
         hd.merek_mobil = merkTF.getText();
         hd.harga_sewa = hargaTF.getText();
         try{
           hd.edit();
           JOptionPane.showMessageDialog(null,"Berhasil Edit Data");
         
         }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         
         }ViewData();
    }//GEN-LAST:event_editBTNActionPerformed

    private void hapusBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBTNActionPerformed
        tambah_mobil hd = new tambah_mobil();
         hd.id_mobil = idTF.getText();
         hd.nama_mobil = namaTF.getText();
         hd.merek_mobil = merkTF.getText();
         hd.harga_sewa = hargaTF.getText();
         try{
           hd.hapus();
           JOptionPane.showMessageDialog(null,"Berhasil Hapus Data");
         
         }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         
         }ViewData();
    }//GEN-LAST:event_hapusBTNActionPerformed

    private void batalBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalBTNActionPerformed
        idTF.setText("");
        namaTF.setText("");
        merkTF.setText("");
        hargaTF.setText("");
    }//GEN-LAST:event_batalBTNActionPerformed

    private void simpanBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBTNActionPerformed
        tambah_mobil hd = new tambah_mobil();
         hd.id_mobil = idTF.getText();
         hd.nama_mobil = namaTF.getText();
         hd.merek_mobil = merkTF.getText();
         hd.harga_sewa = hargaTF.getText();
         try{
           hd.simpan();
           JOptionPane.showMessageDialog(null,"Berhasil Simpan Data");
         
         }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         
         }ViewData();
    }//GEN-LAST:event_simpanBTNActionPerformed

    private void kembaliBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliBTNActionPerformed
        new Home().show();
        this.dispose();
    }//GEN-LAST:event_kembaliBTNActionPerformed

    private void idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTFActionPerformed

    private void namaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTFActionPerformed

    private void merkTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_merkTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_merkTFActionPerformed

    private void hargaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaTFActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel md = (DefaultTableModel)jTable1.getModel();
        idTF.setText(md.getValueAt(jTable1.getSelectedRow(), 0).toString());
        namaTF.setText(md.getValueAt(jTable1.getSelectedRow(), 1).toString());
        merkTF.setText(md.getValueAt(jTable1.getSelectedRow(), 2).toString());
        hargaTF.setText(md.getValueAt(jTable1.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mobil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalBTN;
    private javax.swing.JButton editBTN;
    private javax.swing.JButton hapusBTN;
    private javax.swing.JTextField hargaTF;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton kembaliBTN;
    private javax.swing.JTextField merkTF;
    private javax.swing.JTextField namaTF;
    private javax.swing.JButton simpanBTN;
    // End of variables declaration//GEN-END:variables
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany._uas;

import database.transaksi_cl;
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
public class Transaksi extends javax.swing.JFrame {

    private void ViewData(){
       transaksi_cl hd = new transaksi_cl();
       try{
       jTable1.setModel(DbUtils.resultSetToTableModel(hd.TampilTabel()));
       
       
       }catch(Exception e){
       JOptionPane.showMessageDialog(null, e);
       }
       
    }
    /**
     * Creates new form Transaksi
     */
    
    public Transaksi(){
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
        idpenyewaTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        namaTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idmobilTF = new javax.swing.JTextField();
        tglpinjamTF = new javax.swing.JTextField();
        tglkembaliTF = new javax.swing.JTextField();
        hargaTF = new javax.swing.JTextField();
        lamaTF = new javax.swing.JTextField();
        totalTF = new javax.swing.JTextField();
        hitungBTN = new javax.swing.JButton();
        editBTN = new javax.swing.JButton();
        simpanBTN = new javax.swing.JButton();
        batalBTN = new javax.swing.JButton();
        hapusBTN = new javax.swing.JButton();
        refreshBTN = new javax.swing.JButton();
        kembaliBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORM TRANSAKSI");

        jLabel2.setText("Id Penyewa");

        idpenyewaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpenyewaTFActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama Penyewa");

        namaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTFActionPerformed(evt);
            }
        });

        jLabel4.setText("Id Mobil");

        jLabel5.setText("Tgl Pinjam");

        jLabel6.setText("Tgl Kembali");

        jLabel7.setText("Harga");

        jLabel8.setText("Lama");

        jLabel9.setText("Total");

        idmobilTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idmobilTFActionPerformed(evt);
            }
        });

        tglpinjamTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglpinjamTFActionPerformed(evt);
            }
        });

        tglkembaliTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglkembaliTFActionPerformed(evt);
            }
        });

        hargaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaTFActionPerformed(evt);
            }
        });

        lamaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamaTFActionPerformed(evt);
            }
        });

        totalTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTFActionPerformed(evt);
            }
        });

        hitungBTN.setText("Hitung");
        hitungBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungBTNActionPerformed(evt);
            }
        });

        editBTN.setText("Edit");
        editBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBTNActionPerformed(evt);
            }
        });

        simpanBTN.setText("Simpan");
        simpanBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBTNActionPerformed(evt);
            }
        });

        batalBTN.setText("Batal");
        batalBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalBTNActionPerformed(evt);
            }
        });

        hapusBTN.setText("Hapus");
        hapusBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBTNActionPerformed(evt);
            }
        });

        refreshBTN.setText("Refresh");
        refreshBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBTNActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kembaliBTN)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGap(28, 28, 28)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(totalTF)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(hitungBTN))
                                .addComponent(lamaTF)
                                .addComponent(hargaTF)
                                .addComponent(tglkembaliTF)
                                .addComponent(tglpinjamTF)
                                .addComponent(idmobilTF)
                                .addComponent(namaTF)
                                .addComponent(idpenyewaTF)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(editBTN)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(simpanBTN)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(batalBTN)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(hapusBTN)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(refreshBTN))))
                .addGap(120, 120, 120))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idpenyewaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idmobilTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tglpinjamTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tglkembaliTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lamaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(hitungBTN))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBTN)
                    .addComponent(simpanBTN)
                    .addComponent(batalBTN)
                    .addComponent(hapusBTN)
                    .addComponent(refreshBTN))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kembaliBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliBTNActionPerformed
        new Home().show();
        this.dispose();
    }//GEN-LAST:event_kembaliBTNActionPerformed

    private void refreshBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBTNActionPerformed
        idpenyewaTF.setText(""); 
        namaTF.setText("");
        idmobilTF.setText("");
        tglpinjamTF.setText("");
        tglkembaliTF.setText("");
        hargaTF.setText("");
        lamaTF.setText("");
        totalTF.setText("");
    }//GEN-LAST:event_refreshBTNActionPerformed

    private void hapusBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBTNActionPerformed
        transaksi_cl hd = new transaksi_cl();
         hd.id_penyewa = idpenyewaTF.getText();
         hd.nama_penyewa = namaTF.getText();
         hd.id_mobil = idmobilTF.getText();
         hd.tanggal_pinjam = tglpinjamTF.getText();
         hd.tanggal_kembali = tglkembaliTF.getText();
         hd.harga = hargaTF.getText();
         hd.lama = lamaTF.getText();
         hd.total = totalTF.getText();
         try{
           hd.hapus();
           JOptionPane.showMessageDialog(null,"Berhasil Hapus Data");
         
         }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         
         }ViewData();
    }//GEN-LAST:event_hapusBTNActionPerformed

    private void batalBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalBTNActionPerformed
         idpenyewaTF.setText("");
         namaTF.setText("");
         idmobilTF.setText("");
         tglpinjamTF.setText("");
         tglkembaliTF.setText("");
         hargaTF.setText("");
         lamaTF.setText("");
         totalTF.setText("");
    }//GEN-LAST:event_batalBTNActionPerformed

    private void simpanBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBTNActionPerformed
        transaksi_cl hd = new transaksi_cl();
         hd.id_penyewa = idpenyewaTF.getText();
         hd.nama_penyewa = namaTF.getText();
         hd.id_mobil = idmobilTF.getText();
         hd.tanggal_pinjam = tglpinjamTF.getText();
         hd.tanggal_kembali = tglkembaliTF.getText();
         hd.harga = hargaTF.getText();
         hd.lama = lamaTF.getText();
         hd.total = totalTF.getText();
         try{
           hd.simpan();
           JOptionPane.showMessageDialog(null,"Berhasil Simpan Data");
         
         }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         
         }ViewData();
    }//GEN-LAST:event_simpanBTNActionPerformed

    private void editBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBTNActionPerformed
        transaksi_cl hd = new transaksi_cl();
         hd.id_penyewa = idpenyewaTF.getText();
         hd.nama_penyewa = namaTF.getText();
         hd.id_mobil = idmobilTF.getText();
         hd.tanggal_pinjam = tglpinjamTF.getText();
         hd.tanggal_kembali = tglkembaliTF.getText();
         hd.harga = hargaTF.getText();
         hd.lama = lamaTF.getText();
         hd.total = totalTF.getText();
         try{
           hd.edit();
           JOptionPane.showMessageDialog(null,"Berhasil Edit Data");
         
         }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         
         }ViewData();
    }//GEN-LAST:event_editBTNActionPerformed

    private void totalTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalTFActionPerformed

    private void lamaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lamaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lamaTFActionPerformed

    private void hargaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaTFActionPerformed

    private void tglkembaliTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglkembaliTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglkembaliTFActionPerformed

    private void tglpinjamTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglpinjamTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tglpinjamTFActionPerformed

    private void idmobilTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idmobilTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idmobilTFActionPerformed

    private void namaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTFActionPerformed

    private void idpenyewaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpenyewaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpenyewaTFActionPerformed

    private void hitungBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungBTNActionPerformed
       double angka1 = Integer.parseInt(hargaTF.getText());
       double angka2 = Integer.parseInt(lamaTF.getText());
       
       double hasil = angka1 * angka2;
       String total = "" + hasil;
       
       totalTF.setText(total);
       
      
      
// TODO add your handling code here:
    }//GEN-LAST:event_hitungBTNActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      DefaultTableModel md = (DefaultTableModel)jTable1.getModel();
        idpenyewaTF.setText(md.getValueAt(jTable1.getSelectedRow(), 0).toString());
        namaTF.setText(md.getValueAt(jTable1.getSelectedRow(), 1).toString());
        idmobilTF.setText(md.getValueAt(jTable1.getSelectedRow(), 2).toString());
        tglpinjamTF.setText(md.getValueAt(jTable1.getSelectedRow(), 3).toString());
        tglkembaliTF.setText(md.getValueAt(jTable1.getSelectedRow(), 4).toString());  
        hargaTF.setText(md.getValueAt(jTable1.getSelectedRow(), 5).toString());
        lamaTF.setText(md.getValueAt(jTable1.getSelectedRow(), 6).toString());
        totalTF.setText(md.getValueAt(jTable1.getSelectedRow(), 7).toString());
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
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalBTN;
    private javax.swing.JButton editBTN;
    private javax.swing.JButton hapusBTN;
    private javax.swing.JTextField hargaTF;
    private javax.swing.JButton hitungBTN;
    private javax.swing.JTextField idmobilTF;
    private javax.swing.JTextField idpenyewaTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton kembaliBTN;
    private javax.swing.JTextField lamaTF;
    private javax.swing.JTextField namaTF;
    private javax.swing.JButton refreshBTN;
    private javax.swing.JButton simpanBTN;
    private javax.swing.JTextField tglkembaliTF;
    private javax.swing.JTextField tglpinjamTF;
    private javax.swing.JTextField totalTF;
    // End of variables declaration//GEN-END:variables
}
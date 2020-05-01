/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Halaman;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BintangDiLangit
 */
public class cariedit_admin extends javax.swing.JFrame {

    public DefaultTableModel model;
    private ResultSet hasil;
    private int size;
    private int idTrav;
    private String namaOrder;
    //Struktur Data yang digunakan
    DataArray arr;
    Tree theTree;
    HashTable hash;

    CRUD cr = new CRUD();

    /**
     * Creates new form cariedit_admin
     */
    public cariedit_admin() {
        initComponents();
        this.setLocationRelativeTo(null);
//        this.setBackground(new Color(0, 0, 0, 0));

        size = 5 ^ 40;
        arr = new DataArray(size);
        theTree = new Tree();
        hash = new HashTable(size);

        txt_nama.setEnabled(false);
        txt_alamat.setEnabled(false);
        txt_no.setEnabled(false);
        txt_paket.setEnabled(false);
        txt_jmlorang.setEnabled(false);
        txt_tgl.setEnabled(false);
        txt_lunas.setEnabled(false);

        try {
            hasil = cr.getAllData();
            int inc = 0;
            while (hasil != null) {
                hasil.next();
                String nama = hasil.getString("nama");
                String alamat = hasil.getString("alamat");
                String nohp = hasil.getString("nohp");
                String paket = hasil.getString("paket");
                String jmlorang = hasil.getString("jmlorang");
                String tgl = hasil.getString("tgl");
                String total = hasil.getString("total");
                String lunas = hasil.getString("lunas");

                arr.insert(hasil.getInt("id"), nama, alamat, nohp, paket, jmlorang, tgl,total);
                theTree.insert(hasil.getInt("id"), nama, alamat, nohp, paket, jmlorang, tgl,total);
                hash.put(hasil.getInt("id"), nama, alamat, nohp, paket, jmlorang, tgl,total);
            }
        } catch (SQLException e) {
//            e.printStackTrace();
        }
        listAll();
    }

    public void listAll() {
        model = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabel_travel.setModel(model);
        model.addColumn("Nama");
        model.addColumn("Alamat");
        model.addColumn("Nomor Hp");
        model.addColumn("Paket");
        model.addColumn("Jumlah Orang");
        model.addColumn("Tanggal");
        model.addColumn("Total");
        model.addColumn("Pelunasan");
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        arr.SelectionSort();

        String result[][] = arr.Array();

        for (int i = 0; i < arr.Array().length; i++) {
            model.addRow(result[i]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lns = new javax.swing.JLabel();
        txt_lunas = new javax.swing.JTextField();
        txt_cari = new javax.swing.JTextField();
        txt_paket = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        txt_no = new javax.swing.JTextField();
        txt_jmlorang = new javax.swing.JTextField();
        txt_tgl = new javax.swing.JTextField();
        nama = new javax.swing.JLabel();
        alamat = new javax.swing.JLabel();
        nohp = new javax.swing.JLabel();
        paket = new javax.swing.JLabel();
        jmlorang = new javax.swing.JLabel();
        tgl = new javax.swing.JLabel();
        arta = new javax.swing.JLabel();
        cari = new javax.swing.JLabel();
        hapus = new javax.swing.JLabel();
        edit = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        menuawl = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        tabel = new javax.swing.JScrollPane();
        tabel_travel = new javax.swing.JTable();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lns.setForeground(new java.awt.Color(255, 255, 255));
        lns.setText("Pelunasan");
        getContentPane().add(lns, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));
        getContentPane().add(txt_lunas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 160, -1));
        getContentPane().add(txt_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 240, -1));
        getContentPane().add(txt_paket, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 160, -1));
        getContentPane().add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 160, -1));
        getContentPane().add(txt_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 160, -1));
        getContentPane().add(txt_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 160, -1));
        getContentPane().add(txt_jmlorang, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 160, -1));
        getContentPane().add(txt_tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 160, -1));

        nama.setForeground(new java.awt.Color(255, 255, 255));
        nama.setText("Nama");
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        alamat.setForeground(new java.awt.Color(255, 255, 255));
        alamat.setText("Alamat");
        getContentPane().add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        nohp.setForeground(new java.awt.Color(255, 255, 255));
        nohp.setText("No Hp");
        getContentPane().add(nohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        paket.setForeground(new java.awt.Color(255, 255, 255));
        paket.setText("Paket");
        getContentPane().add(paket, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        jmlorang.setForeground(new java.awt.Color(255, 255, 255));
        jmlorang.setText("Jumlah Orang");
        getContentPane().add(jmlorang, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        tgl.setForeground(new java.awt.Color(255, 255, 255));
        tgl.setText("Tanggal Keberangkatan");
        getContentPane().add(tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));

        arta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                artaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                artaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                artaMouseEntered(evt);
            }
        });
        getContentPane().add(arta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 340, 40));

        cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cariMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cariMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cariMouseEntered(evt);
            }
        });
        getContentPane().add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, 90, 30));

        hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hapusMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hapusMouseEntered(evt);
            }
        });
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 90, 30));

        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
        });
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 90, 30));

        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 60, 40));

        menuawl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuawlMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuawlMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuawlMouseEntered(evt);
            }
        });
        getContentPane().add(menuawl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 40));

        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minMouseEntered(evt);
            }
        });
        getContentPane().add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 60, 40));

        tabel_travel.setBackground(new java.awt.Color(64, 21, 109));
        tabel_travel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tabel_travel.setForeground(new java.awt.Color(255, 255, 255));
        tabel_travel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_travel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_travelMouseClicked(evt);
            }
        });
        tabel.setViewportView(tabel_travel);
        tabel_travel.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(tabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 520, 120));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Halaman/gambar/ehc.jpg"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        ImageIcon L = new ImageIcon(getClass().getResource("gambar/ehc.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        ImageIcon L = new ImageIcon(getClass().getResource("gambar/ehcclose.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_closeMouseEntered

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseExited
        ImageIcon L = new ImageIcon(getClass().getResource("gambar/ehc.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_minMouseExited

    private void minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseEntered
        ImageIcon L = new ImageIcon(getClass().getResource("gambar/ehcmin.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_minMouseEntered

    private void menuawlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuawlMouseClicked
        menu_admin M = new menu_admin();
        M.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuawlMouseClicked

    private void menuawlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuawlMouseExited
        ImageIcon L = new ImageIcon(getClass().getResource("gambar/ehc.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_menuawlMouseExited

    private void menuawlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuawlMouseEntered
        ImageIcon L = new ImageIcon(getClass().getResource("gambar/ehcmenu.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_menuawlMouseEntered

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        editTrav();
    }//GEN-LAST:event_editMouseClicked

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        ImageIcon L = new ImageIcon(getClass().getResource("gambar/ehcedit.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        ImageIcon L = new ImageIcon(getClass().getResource("gambar/ehc.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_editMouseExited

    private void cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cariMouseClicked
        if (!txt_cari.getText().equals("")) {
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();

            String kata = txt_cari.getText();
            cariTrav(kata);

            txt_nama.setEnabled(true);
            txt_alamat.setEnabled(true);
            txt_no.setEnabled(true);
            txt_paket.setEnabled(true);
            txt_jmlorang.setEnabled(true);
            txt_tgl.setEnabled(true);
            txt_lunas.setEnabled(true);

        } else {
            listAll();
        }
    }//GEN-LAST:event_cariMouseClicked

    private void cariMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cariMouseExited
        ImageIcon L = new ImageIcon(getClass().getResource("gambar/ehc.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_cariMouseExited

    private void cariMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cariMouseEntered
        ImageIcon L = new ImageIcon(getClass().getResource("gambar/ehccari.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_cariMouseEntered

    private void hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusMouseClicked
        hapusTrav();
    }//GEN-LAST:event_hapusMouseClicked

    private void hapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusMouseExited
        ImageIcon L = new ImageIcon(getClass().getResource("gambar/ehc.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_hapusMouseExited

    private void hapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusMouseEntered
        ImageIcon L = new ImageIcon(getClass().getResource("gambar/ehchapus.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_hapusMouseEntered

    private void artaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_artaMouseClicked

    private void artaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artaMouseExited
        ImageIcon L = new ImageIcon(getClass().getResource("gambar/ehc.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_artaMouseExited

    private void artaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artaMouseEntered
        ImageIcon L = new ImageIcon(getClass().getResource("gambar/ehc2.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_artaMouseEntered

    private void tabel_travelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_travelMouseClicked
        klikTabel();
    }//GEN-LAST:event_tabel_travelMouseClicked

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
            java.util.logging.Logger.getLogger(cariedit_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cariedit_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cariedit_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cariedit_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cariedit_admin().setVisible(true);
            }
        });
    }

    public void cariTrav(String kata) {
//        String word = kata.toLowerCase();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        String[][] result = theTree.search(kata);
        int i = 0;
        while (i < theTree.size) {
            if (result[i][0] != null) {
                model.addRow(result[i]);
            }
            i++;
        }
    }

    public void editTrav() {
        String nama = txt_nama.getText();
        String alamat = txt_alamat.getText();
        String nohp = txt_no.getText();
        String paket = txt_paket.getText();
        String jmlorang = txt_jmlorang.getText();
        String tgl = txt_tgl.getText();
        String lunas = txt_lunas.getText();
        try {
            cr.editData(nama, alamat, nohp, paket, jmlorang, tgl, lunas, idTrav);
            cari.setText("");
            arr.edit(idTrav, nama, alamat, nohp, paket, jmlorang, tgl,lunas);
            hash.edit(idTrav, nama, alamat, nohp, paket, jmlorang, tgl,lunas);
            theTree.edit(idTrav, nama, alamat, nohp, paket, jmlorang, tgl,lunas);
        } catch (Exception e) {
            System.out.println("Data gagal diedit!");
        }
        listAll();
    }

    public void hapusTrav() {
        try {
            cr.hapusData(idTrav);
            hash.delete(idTrav, namaOrder);
            theTree.delete(idTrav);
            arr.delete(idTrav);

        } catch (Exception e) {
            System.out.println("Gagal Dihapus");
        }
        listAll();
    }

    public void klikTabel() {
        int baris = tabel_travel.getSelectedRow();
        String n = "";
        if (baris != -1) {
            n = tabel_travel.getValueAt(baris, 0).toString();
        }

//        int orang =hash.getJmlorang();
        txt_nama.setText(hash.get(n).getNama());
        txt_alamat.setText(hash.get(n).getAlamat());
        txt_no.setText(hash.get(n).getNohp());
        txt_paket.setText(hash.get(n).getPaket());
        txt_jmlorang.setText(hash.get(n).getJmlorang());
        txt_tgl.setText(hash.get(n).getTgl());
        txt_lunas.setText(hash.get(n).getLunas());

        idTrav = hash.get(n).getId();
        namaOrder = hash.get(n).getNama();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamat;
    private javax.swing.JLabel arta;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel cari;
    private javax.swing.JLabel close;
    private javax.swing.JLabel edit;
    private javax.swing.JLabel hapus;
    private javax.swing.JLabel jmlorang;
    private javax.swing.JLabel lns;
    private javax.swing.JLabel menuawl;
    private javax.swing.JLabel min;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel nohp;
    private javax.swing.JLabel paket;
    private javax.swing.JScrollPane tabel;
    private javax.swing.JTable tabel_travel;
    private javax.swing.JLabel tgl;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_jmlorang;
    private javax.swing.JTextField txt_lunas;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_no;
    private javax.swing.JTextField txt_paket;
    private javax.swing.JTextField txt_tgl;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Halaman;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author AFRIZAL'R
 */
public class paketC extends javax.swing.JFrame {

    /**
     * Creates new form paketc
     */
    public paketC() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        min = new javax.swing.JLabel();
        lan = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        kem = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        min.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
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
        getContentPane().add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 50, 30));

        lan.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        lan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lanMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lanMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lanMouseEntered(evt);
            }
        });
        getContentPane().add(lan, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 70, 40));

        close.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
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
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 50, 30));

        kem.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        kem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kemMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kemMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kemMouseEntered(evt);
            }
        });
        getContentPane().add(kem, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 70, 40));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Halaman/gambar2/paketc.jpg"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseExited
        ImageIcon L = new ImageIcon(getClass().getResource("gambar2/paketc.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_minMouseExited

    private void minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseEntered
        ImageIcon L = new ImageIcon(getClass().getResource("gambar2/paketcmin.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_minMouseEntered

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        ImageIcon L = new ImageIcon(getClass().getResource("gambar2/paketc.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        ImageIcon L = new ImageIcon(getClass().getResource("gambar2/paketcclose.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_closeMouseEntered

    private void lanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lanMouseClicked
        menu_user M = new menu_user();
        M.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lanMouseClicked

    private void lanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lanMouseExited
        ImageIcon L = new ImageIcon(getClass().getResource("gambar2/paketc.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_lanMouseExited

    private void lanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lanMouseEntered
        ImageIcon L = new ImageIcon(getClass().getResource("gambar2/paketclan.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_lanMouseEntered

    private void kemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kemMouseClicked
        paketB B = new paketB();
        B.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kemMouseClicked

    private void kemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kemMouseExited
        ImageIcon L = new ImageIcon(getClass().getResource("gambar2/paketc.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_kemMouseExited

    private void kemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kemMouseEntered
        ImageIcon L = new ImageIcon(getClass().getResource("gambar2/paketckem.jpg"));
        bg.setIcon(L);
    }//GEN-LAST:event_kemMouseEntered

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
            java.util.logging.Logger.getLogger(paketC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paketC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paketC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paketC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paketC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel close;
    private javax.swing.JLabel kem;
    private javax.swing.JLabel lan;
    private javax.swing.JLabel min;
    // End of variables declaration//GEN-END:variables
}

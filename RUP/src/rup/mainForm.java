/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rup;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author mahe
 */

public class mainForm extends javax.swing.JFrame {

    /**
     * Creates new form mainForm
     */
    public mainForm() {
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

        tf1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        lb10 = new javax.swing.JLabel();
        lb11 = new javax.swing.JLabel();
        lb12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Search");

        lb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb1MouseClicked(evt);
            }
        });

        lb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb2MouseClicked(evt);
            }
        });

        lb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb3MouseClicked(evt);
            }
        });

        lb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb4MouseClicked(evt);
            }
        });

        lb5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb5MouseClicked(evt);
            }
        });

        lb6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb6MouseClicked(evt);
            }
        });

        lb7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb7MouseClicked(evt);
            }
        });

        lb8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb8MouseClicked(evt);
            }
        });

        lb9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb9MouseClicked(evt);
            }
        });

        lb10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb10MouseClicked(evt);
            }
        });

        lb11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb11MouseClicked(evt);
            }
        });

        lb12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb12, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb7, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb8, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb9, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb10, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb11, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb12, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      lb1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\mahe\\Desktop\\posters\\lb1.jpg").getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_SMOOTH)));
       lb2.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\mahe\\Desktop\\posters\\lb2.jpg").getImage().getScaledInstance(lb2.getWidth(), lb2.getHeight(), Image.SCALE_SMOOTH)));
       lb3.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\mahe\\Desktop\\posters\\lb3.jpg").getImage().getScaledInstance(lb3.getWidth(), lb3.getHeight(), Image.SCALE_SMOOTH)));
       lb4.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\mahe\\Desktop\\posters\\lb4.jpg").getImage().getScaledInstance(lb4.getWidth(), lb4.getHeight(), Image.SCALE_SMOOTH)));
       lb5.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\mahe\\Desktop\\posters\\lb5.jpg").getImage().getScaledInstance(lb5.getWidth(), lb5.getHeight(), Image.SCALE_SMOOTH)));
       lb6.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\mahe\\Desktop\\posters\\lb6.jpg").getImage().getScaledInstance(lb6.getWidth(), lb6.getHeight(), Image.SCALE_SMOOTH)));
       lb7.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\mahe\\Desktop\\posters\\lb7.jpg").getImage().getScaledInstance(lb7.getWidth(), lb7.getHeight(), Image.SCALE_SMOOTH)));
       lb8.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\mahe\\Desktop\\posters\\lb8.jpg").getImage().getScaledInstance(lb8.getWidth(), lb8.getHeight(), Image.SCALE_SMOOTH)));
       lb9.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\mahe\\Desktop\\posters\\lb9.jpg").getImage().getScaledInstance(lb9.getWidth(), lb9.getHeight(), Image.SCALE_SMOOTH)));
       lb10.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\mahe\\Desktop\\posters\\lb10.jpg").getImage().getScaledInstance(lb10.getWidth(), lb10.getHeight(), Image.SCALE_SMOOTH)));
       lb11.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\mahe\\Desktop\\posters\\lb11.jpg").getImage().getScaledInstance(lb11.getWidth(), lb11.getHeight(), Image.SCALE_SMOOTH)));
       lb12.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\mahe\\Desktop\\posters\\lb12.jpg").getImage().getScaledInstance(lb12.getWidth(), lb12.getHeight(), Image.SCALE_SMOOTH)));
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
//        lb1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("C:\\Users\\mahe\\Desktop\\posters\\lb1.jpg")).getImage().getScaledInstance(lb1.getWidth(), lb1.getHeight(), Image.SCALE_SMOOTH)));

    }//GEN-LAST:event_formWindowActivated

    private void lb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb1MouseClicked
        Icon src = lb1.getIcon();
        LabelImage.src=src;
        LabelImage.id=101;
        new personalpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lb1MouseClicked

    private void lb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb2MouseClicked
        Icon src = lb2.getIcon();
        LabelImage.src=src;
        LabelImage.id=102;
        new personalpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lb2MouseClicked

    private void lb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb3MouseClicked
        Icon src = lb3.getIcon();
        LabelImage.src=src;
        LabelImage.id=103;
        new personalpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lb3MouseClicked

    private void lb4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb4MouseClicked
        Icon src = lb4.getIcon();
        LabelImage.src=src;
        LabelImage.id=104;
        new personalpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lb4MouseClicked

    private void lb5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb5MouseClicked
        Icon src = lb5.getIcon();
        LabelImage.src=src;
        LabelImage.id=105;
        new personalpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lb5MouseClicked

    private void lb6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb6MouseClicked
        Icon src = lb6.getIcon();
        LabelImage.src=src;
        LabelImage.id=106;
        new personalpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lb6MouseClicked

    private void lb7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb7MouseClicked
        Icon src = lb7.getIcon();
        LabelImage.src=src;
        LabelImage.id=107;
        new personalpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lb7MouseClicked

    private void lb8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb8MouseClicked
        Icon src = lb8.getIcon();
        LabelImage.src=src;
        LabelImage.id=108;
        new personalpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lb8MouseClicked

    private void lb9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb9MouseClicked
        Icon src = lb9.getIcon();
        LabelImage.src=src;
        LabelImage.id=109;
        new personalpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lb9MouseClicked

    private void lb10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb10MouseClicked
        Icon src = lb10.getIcon();
        LabelImage.src=src;
        LabelImage.id=110;
        new personalpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lb10MouseClicked

    private void lb11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb11MouseClicked
        Icon src = lb11.getIcon();
        LabelImage.src=src;
        LabelImage.id=111;
        new personalpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lb11MouseClicked

    private void lb12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb12MouseClicked
        Icon src = lb12.getIcon();
        LabelImage.src=src;
        LabelImage.id=112;
        new personalpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lb12MouseClicked

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
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb12;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}


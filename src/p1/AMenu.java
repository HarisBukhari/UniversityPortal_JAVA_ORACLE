/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author Zotac
 */
public class AMenu extends javax.swing.JFrame {
    Connection conn = JavaConnectDB.ConnectDB();
    OraclePreparedStatement pst = null;
    OracleResultSet rs = null;
    /**
     * Creates new form AMenu
     */
    public AMenu() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\FS\\SP18-BSE-028\\SS\\Photos\\Uni.jpg")); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon("D:\\FS\\SP18-BSE-028\\3A\\OOP\\Projects\\GUI\\Tiny\\Pics\\folder.png")); // NOI18N
        jMenu1.setText("Options");

        jMenuItem1.setIcon(new javax.swing.ImageIcon("D:\\FS\\SP18-BSE-028\\3A\\OOP\\Projects\\GUI\\Tiny\\Pics\\edit.png")); // NOI18N
        jMenuItem1.setText("Login");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon("D:\\FS\\SP18-BSE-028\\3A\\OOP\\Projects\\GUI\\Tiny\\Pics\\exit.png")); // NOI18N
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("D:\\FS\\SP18-BSE-028\\3A\\OOP\\Projects\\GUI\\Tiny\\Pics\\addemployee.png")); // NOI18N
        jMenu2.setText("Students");

        jMenuItem3.setIcon(new javax.swing.ImageIcon("D:\\FS\\SP18-BSE-028\\3A\\OOP\\Projects\\GUI\\Tiny\\Pics\\add.png")); // NOI18N
        jMenuItem3.setText("Add Students");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon("D:\\FS\\SP18-BSE-028\\3A\\OOP\\Projects\\GUI\\Tiny\\Pics\\edit.png")); // NOI18N
        jMenuItem4.setText("Edit Students");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon("D:\\FS\\SP18-BSE-028\\3A\\OOP\\Projects\\GUI\\Tiny\\Pics\\addemployee.png")); // NOI18N
        jMenuItem5.setText("View Students");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon("D:\\FS\\SP18-BSE-028\\3A\\OOP\\Projects\\GUI\\Tiny\\Pics\\job.png")); // NOI18N
        jMenu3.setText("Instructor");

        jMenuItem6.setIcon(new javax.swing.ImageIcon("D:\\FS\\SP18-BSE-028\\3A\\OOP\\Projects\\GUI\\Tiny\\Pics\\add.png")); // NOI18N
        jMenuItem6.setText("Select Instructor");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon("D:\\FS\\SP18-BSE-028\\3A\\OOP\\Projects\\GUI\\Tiny\\Pics\\edit.png")); // NOI18N
        jMenuItem7.setText("Edit Instructor");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon("D:\\FS\\SP18-BSE-028\\3A\\OOP\\Projects\\GUI\\Tiny\\Pics\\addemployee.png")); // NOI18N
        jMenuItem8.setText("View Instructor");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon("D:\\FS\\SP18-BSE-028\\3A\\OOP\\Projects\\GUI\\Tiny\\Pics\\edit.png")); // NOI18N
        jMenu4.setText("Timetable");

        jMenuItem9.setIcon(new javax.swing.ImageIcon("D:\\FS\\SP18-BSE-028\\3A\\OOP\\Projects\\GUI\\Tiny\\Pics\\add.png")); // NOI18N
        jMenuItem9.setText("Voting");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setIcon(new javax.swing.ImageIcon("D:\\FS\\SP18-BSE-028\\3A\\OOP\\Projects\\GUI\\Tiny\\Pics\\edit.png")); // NOI18N
        jMenuItem10.setText("Results");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel4)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        try{
       String sql1= "select * from admin where a > 0";
        pst = (OraclePreparedStatement) conn.prepareStatement(sql1);
        rs = (OracleResultSet) pst.executeQuery();
        if(rs.next()){
        new Add_student().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "!!!-Admin Only-!!!");
        }
        }catch(SQLException | HeadlessException | NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
       
        
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
       
       try{
        int z=0;
        String sql1= "select * from admin where a > 0";
        pst = (OraclePreparedStatement) conn.prepareStatement(sql1);
        rs = (OracleResultSet) pst.executeQuery();
        if(rs.next()){
        new Edit_student().setVisible(true);
        z++;
        }
        sql1= "select * from instructor where a > 0";
        pst = (OraclePreparedStatement) conn.prepareStatement(sql1);
        rs = (OracleResultSet) pst.executeQuery();
        if(rs.next()){
        new Edit_student().setVisible(true);
        z++;
        }
        if(z==0){
        JOptionPane.showMessageDialog(null, "!!!-Admin Only-!!!\n!!!-Instructor Only-!!!");
        }
        }catch(SQLException | HeadlessException | NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        new Viewstudent().setVisible(true);
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
         try{
       String sql1= "select * from admin where a > 0";
        pst = (OraclePreparedStatement) conn.prepareStatement(sql1);
        rs = (OracleResultSet) pst.executeQuery();
        if(rs.next()){
        new Add_Instructor().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "!!!-Admin Only-!!!");
        }
        }catch(SQLException | HeadlessException | NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        try{
        int z=0;
        String sql1= "select * from admin where a > 0";
        pst = (OraclePreparedStatement) conn.prepareStatement(sql1);
        rs = (OracleResultSet) pst.executeQuery();
        if(rs.next()){
        new Viewinstrcutor().setVisible(true);
        z++;
        }
        sql1= "select * from instructor where a > 0";
        pst = (OraclePreparedStatement) conn.prepareStatement(sql1);
        rs = (OracleResultSet) pst.executeQuery();
        if(rs.next()){
        new Viewinstrcutor().setVisible(true);
        z++;
        }
        if(z==0){
            JOptionPane.showMessageDialog(null, "!!!-Admin Only-!!!\n!!!-Instructor Only-!!!");
        }
        }catch(SQLException | HeadlessException | NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        try{
       String sql1= "select * from admin where a > 0";
        pst = (OraclePreparedStatement) conn.prepareStatement(sql1);
        rs = (OracleResultSet) pst.executeQuery();
        if(rs.next()){
        new Edit_instructor().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "!!!-Admin Only-!!!");
        }
        }catch(SQLException | HeadlessException | NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
       

    }//GEN-LAST:event_jMenuItem10ActionPerformed

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
            java.util.logging.Logger.getLogger(AMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}

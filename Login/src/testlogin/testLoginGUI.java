package testlogin;

import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;
import java.sql.ResultSet;

public class testLoginGUI extends javax.swing.JFrame {

    public testLoginGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        ps11 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        jButton1.setText("Login");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        txt1.setText("jTextField1");

        ps11.setText("jPasswordField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(117, 117, 117)
                                .addComponent(ps11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(127, 127, 127)
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jButton1)))
                .addContainerGap(705, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(ps11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addComponent(jButton1)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        try {
    String user2 = new String(txt1.getText());
    String ps2 = new String(ps11.getPassword());

    Class.forName("com.mysql.cj.jdbc.Driver");

    // Create a connection String
    Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "root");
    
    // Create SQL Query
    String query2 = ("SELECT usrnm, pswrd FROM mylogin WHERE usrnm = '"+ user2 +"' AND pswrd = '"+ ps2 +"' ");

    //String xx = ("SELECT username FROM mylogin WHERE username = '" + user2 +"' ");
    // Create Prepared Statement
    PreparedStatement pst2 = con2.prepareStatement(query2);

    // Generate result
    ResultSet rs2 = pst2.executeQuery();

    if(rs2.next())  {
    JOptionPane.showMessageDialog(null, "login Successful");
                    }
    else{
    JOptionPane.showMessageDialog(null, "login not Successful");
        }

    con2.close();
    pst2.close();
    rs2.close();
    }

        catch(SQLException se)  {
        se.printStackTrace();
                                }
        
        catch(Exception e)      {
        e.printStackTrace();
                                }
    }//GEN-LAST:event_jButton1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField ps11;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}

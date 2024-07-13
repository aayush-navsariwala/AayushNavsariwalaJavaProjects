package quiz;

import quiz.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class OnlineQuizzes extends javax.swing.JFrame {
    private Quiz quiz;
    
    public OnlineQuizzes() {
        initComponents();
        quiz = new Quiz();
    }
    
    public class ScoreManager {
        private int score;
        
        public int getScore() {
        return score;
    }

    public void incrementScore() {
        score++;
    }

    public void resetScore() {
        score = 0;
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanelQuestion1 = new javax.swing.JPanel();
        jLabelQ1 = new javax.swing.JLabel();
        jRadioButtonQ1A = new javax.swing.JRadioButton();
        jRadioButtonQ1B = new javax.swing.JRadioButton();
        jRadioButtonQ1C = new javax.swing.JRadioButton();
        jRadioButtonQ1D = new javax.swing.JRadioButton();
        jButtonQ1Submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelQuestion1.setFocusCycleRoot(true);
        jPanelQuestion1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanelQuestion1.setMinimumSize(new java.awt.Dimension(500, 350));
        jPanelQuestion1.setPreferredSize(new java.awt.Dimension(800, 650));

        jLabelQ1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelQ1.setText("What is the capital of France?");
        jLabelQ1.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabelQ1.setMinimumSize(new java.awt.Dimension(200, 25));
        jLabelQ1.setPreferredSize(new java.awt.Dimension(200, 25));

        jRadioButtonQ1A.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jRadioButtonQ1A.setText("London");
        jRadioButtonQ1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ1AActionPerformed(evt);
            }
        });

        jRadioButtonQ1B.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jRadioButtonQ1B.setText("Berlin");
        jRadioButtonQ1B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ1BActionPerformed(evt);
            }
        });

        jRadioButtonQ1C.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jRadioButtonQ1C.setText("Paris");
        jRadioButtonQ1C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ1CActionPerformed(evt);
            }
        });

        jRadioButtonQ1D.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jRadioButtonQ1D.setText("Madrid");
        jRadioButtonQ1D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ1DActionPerformed(evt);
            }
        });

        jButtonQ1Submit.setText("Submit");
        jButtonQ1Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQ1SubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelQuestion1Layout = new javax.swing.GroupLayout(jPanelQuestion1);
        jPanelQuestion1.setLayout(jPanelQuestion1Layout);
        jPanelQuestion1Layout.setHorizontalGroup(
            jPanelQuestion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuestion1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelQuestion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelQuestion1Layout.createSequentialGroup()
                        .addGroup(jPanelQuestion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonQ1B)
                            .addComponent(jRadioButtonQ1A)
                            .addComponent(jRadioButtonQ1C))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelQuestion1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonQ1D)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonQ1Submit)
                        .addGap(63, 63, 63))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelQuestion1Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jLabelQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanelQuestion1Layout.setVerticalGroup(
            jPanelQuestion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuestion1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabelQ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jRadioButtonQ1A)
                .addGap(41, 41, 41)
                .addComponent(jRadioButtonQ1B)
                .addGap(33, 33, 33)
                .addComponent(jRadioButtonQ1C)
                .addGap(45, 45, 45)
                .addGroup(jPanelQuestion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonQ1D)
                    .addComponent(jButtonQ1Submit))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelQuestion1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelQuestion1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonQ1BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ1BActionPerformed
        //Question 1B selected:
        if (jRadioButtonQ1B.isSelected()) {
        jRadioButtonQ1A.setSelected(false);
        jRadioButtonQ1C.setSelected(false);
        jRadioButtonQ1D.setSelected(false);
        } 
    }//GEN-LAST:event_jRadioButtonQ1BActionPerformed

    private void jButtonQ1SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQ1SubmitActionPerformed
        // Question 1 submit button click:
    double score = 0;

    if (jRadioButtonQ1C.isSelected()) {
        score++; // Increment the score if the correct answer (jRadioButtonQ1C) is selected
        JFrameQuestion2 jframequestion2 = new JFrameQuestion2();
        jframequestion2.setVisible(true);
        dispose();
    } else if (jRadioButtonQ1A.isSelected() || jRadioButtonQ1B.isSelected() || jRadioButtonQ1D.isSelected()) {
        // User has selected an option other than the correct one
        JFrameQuestion2 jframequestion2 = new JFrameQuestion2();
        jframequestion2.setVisible(true);
        dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Please select an option!");
    }
    }//GEN-LAST:event_jButtonQ1SubmitActionPerformed

    private void jRadioButtonQ1AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ1AActionPerformed
        //Question 1A selected:
        if (jRadioButtonQ1A.isSelected()) {
        jRadioButtonQ1B.setSelected(false);
        jRadioButtonQ1C.setSelected(false);
        jRadioButtonQ1D.setSelected(false);
        } 
    }//GEN-LAST:event_jRadioButtonQ1AActionPerformed

    private void jRadioButtonQ1CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ1CActionPerformed
        //Question 1C selected:
        if (jRadioButtonQ1C.isSelected()) {
        jRadioButtonQ1A.setSelected(false);
        jRadioButtonQ1B.setSelected(false);
        jRadioButtonQ1D.setSelected(false);
        } 
    }//GEN-LAST:event_jRadioButtonQ1CActionPerformed

    private void jRadioButtonQ1DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ1DActionPerformed
        //Question 1D selected:
        if (jRadioButtonQ1D.isSelected()) {
        jRadioButtonQ1A.setSelected(false);
        jRadioButtonQ1B.setSelected(false);
        jRadioButtonQ1C.setSelected(false);
        } 
    }//GEN-LAST:event_jRadioButtonQ1DActionPerformed

    public static void main(String args[]) {
        double score = 0;
        double Percentage;
        
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OnlineQuizzes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OnlineQuizzes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OnlineQuizzes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OnlineQuizzes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OnlineQuizzes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonQ1Submit;
    private javax.swing.JLabel jLabelQ1;
    private javax.swing.JPanel jPanelQuestion1;
    private javax.swing.JRadioButton jRadioButtonQ1A;
    private javax.swing.JRadioButton jRadioButtonQ1B;
    private javax.swing.JRadioButton jRadioButtonQ1C;
    private javax.swing.JRadioButton jRadioButtonQ1D;
    // End of variables declaration//GEN-END:variables
}

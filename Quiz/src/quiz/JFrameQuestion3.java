package quiz;
import javax.swing.JOptionPane;
import quiz.*;
import quiz.OnlineQuizzes.ScoreManager;

public class JFrameQuestion3 extends javax.swing.JFrame {
    private ScoreManager scoreManager;
    private final Quiz quiz;
    
    public JFrameQuestion3() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabelQuestion3 = new javax.swing.JLabel();
        jRadioButtonQ3A = new javax.swing.JRadioButton();
        jRadioButtonQ3B = new javax.swing.JRadioButton();
        jRadioButtonQ3C = new javax.swing.JRadioButton();
        jRadioButtonQ3D = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelQuestion3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelQuestion3.setText("What is the largest mammal in the world?");

        jRadioButtonQ3A.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jRadioButtonQ3A.setText("Elephant");
        jRadioButtonQ3A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ3AActionPerformed(evt);
            }
        });

        jRadioButtonQ3B.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jRadioButtonQ3B.setText("Giraffe");
        jRadioButtonQ3B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ3BActionPerformed(evt);
            }
        });

        jRadioButtonQ3C.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jRadioButtonQ3C.setText("Blue Whale");
        jRadioButtonQ3C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ3CActionPerformed(evt);
            }
        });

        jRadioButtonQ3D.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jRadioButtonQ3D.setText("Lion");
        jRadioButtonQ3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ3DActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButtonQ3C)
                    .addComponent(jRadioButtonQ3B, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonQ3A, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonQ3D, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabelQuestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabelQuestion3)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jRadioButtonQ3D, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonQ3A)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonQ3B)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonQ3C)
                        .addGap(49, 49, 49)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Question 3 submit button click:
         if (jRadioButtonQ3C.isSelected()) {
        // Increment the score if the correct answer (jRadioButtonQ3C) is selected
        scoreManager.incrementScore();
        JFrameResultsPage jframeresultspage = new JFrameResultsPage();
        jframeresultspage.setVisible(true);
        dispose();
    }
    if (jRadioButtonQ3A.isSelected() || jRadioButtonQ3B.isSelected() || jRadioButtonQ3D.isSelected()) {
        JFrameResultsPage jframeresultspage = new JFrameResultsPage();
        jframeresultspage.setVisible(true);
        dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Please select an option!");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButtonQ3AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ3AActionPerformed
        ///Question 3A selected:
        if (jRadioButtonQ3A.isSelected()) {
        jRadioButtonQ3B.setSelected(false);
        jRadioButtonQ3C.setSelected(false);
        jRadioButtonQ3D.setSelected(false);
        } 
    }//GEN-LAST:event_jRadioButtonQ3AActionPerformed

    private void jRadioButtonQ3BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ3BActionPerformed
        ///Question 3B selected:
        if (jRadioButtonQ3B.isSelected()) {
        jRadioButtonQ3A.setSelected(false);
        jRadioButtonQ3C.setSelected(false);
        jRadioButtonQ3D.setSelected(false);
        } 
    }//GEN-LAST:event_jRadioButtonQ3BActionPerformed

    private void jRadioButtonQ3CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ3CActionPerformed
        ///Question 3C selected:
        if (jRadioButtonQ3C.isSelected()) {
        jRadioButtonQ3A.setSelected(false);
        jRadioButtonQ3B.setSelected(false);
        jRadioButtonQ3D.setSelected(false);
        } 
    }//GEN-LAST:event_jRadioButtonQ3CActionPerformed

    private void jRadioButtonQ3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ3DActionPerformed
        ///Question 3D selected:
        if (jRadioButtonQ3D.isSelected()) {
        jRadioButtonQ3A.setSelected(false);
        jRadioButtonQ3B.setSelected(false);
        jRadioButtonQ3C.setSelected(false);
        } 
    }//GEN-LAST:event_jRadioButtonQ3DActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameQuestion3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameQuestion3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameQuestion3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameQuestion3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameQuestion3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelQuestion3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonQ3A;
    private javax.swing.JRadioButton jRadioButtonQ3B;
    private javax.swing.JRadioButton jRadioButtonQ3C;
    private javax.swing.JRadioButton jRadioButtonQ3D;
    // End of variables declaration//GEN-END:variables
}

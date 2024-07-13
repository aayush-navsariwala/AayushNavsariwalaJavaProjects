package quiz;
import javax.swing.JOptionPane;
import quiz.*;
import quiz.OnlineQuizzes.ScoreManager;

public class JFrameQuestion2 extends javax.swing.JFrame {
    
     private ScoreManager scoreManager;
     private Quiz quiz;

    public JFrameQuestion2() {
        initComponents();
        quiz = new Quiz();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelQuestion2 = new javax.swing.JPanel();
        jButtonQ2Submit = new javax.swing.JButton();
        jLabelQuestion2 = new javax.swing.JLabel();
        jRadioButtonQ2A = new javax.swing.JRadioButton();
        jRadioButtonQ2B = new javax.swing.JRadioButton();
        jRadioButtonQ2C = new javax.swing.JRadioButton();
        jRadioButtonQ2D = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelQuestion2.setPreferredSize(new java.awt.Dimension(800, 650));

        jButtonQ2Submit.setText("Submit");
        jButtonQ2Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQ2SubmitActionPerformed(evt);
            }
        });

        jLabelQuestion2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelQuestion2.setText("Which planet is known as the Red Planet?");

        jRadioButtonQ2A.setText("Earth");
        jRadioButtonQ2A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ2AActionPerformed(evt);
            }
        });

        jRadioButtonQ2B.setText("Mars");
        jRadioButtonQ2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ2BActionPerformed(evt);
            }
        });

        jRadioButtonQ2C.setText("Jupiter");
        jRadioButtonQ2C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ2CActionPerformed(evt);
            }
        });

        jRadioButtonQ2D.setText("Venus");
        jRadioButtonQ2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQ2DActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelQuestion2Layout = new javax.swing.GroupLayout(jPanelQuestion2);
        jPanelQuestion2.setLayout(jPanelQuestion2Layout);
        jPanelQuestion2Layout.setHorizontalGroup(
            jPanelQuestion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuestion2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelQuestion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonQ2D)
                    .addComponent(jRadioButtonQ2A)
                    .addComponent(jRadioButtonQ2C)
                    .addComponent(jRadioButtonQ2B))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelQuestion2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelQuestion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelQuestion2, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addGroup(jPanelQuestion2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonQ2Submit)))
                .addGap(31, 31, 31))
        );
        jPanelQuestion2Layout.setVerticalGroup(
            jPanelQuestion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelQuestion2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabelQuestion2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jRadioButtonQ2A)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonQ2B)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonQ2C)
                .addGap(18, 18, 18)
                .addGroup(jPanelQuestion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonQ2Submit)
                    .addComponent(jRadioButtonQ2D))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelQuestion2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelQuestion2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonQ2SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQ2SubmitActionPerformed
        // Question 2 submit button click:
    if (jRadioButtonQ2B.isSelected()) {
        // Increment the score if the correct answer (jRadioButtonQ2B) is selected
        scoreManager.incrementScore();
        JFrameQuestion3 jframequestion3 = new JFrameQuestion3();
        jframequestion3.setVisible(true);
        dispose();
    }
    if (jRadioButtonQ2A.isSelected() || jRadioButtonQ2C.isSelected() || jRadioButtonQ2D.isSelected()) {
        JFrameQuestion3 jframequestion3 = new JFrameQuestion3();
        jframequestion3.setVisible(true);
        dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Please select an option!");
    }
    }//GEN-LAST:event_jButtonQ2SubmitActionPerformed

    private void jRadioButtonQ2AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ2AActionPerformed
        ///Question 2A selected:
        if (jRadioButtonQ2A.isSelected()) {
        jRadioButtonQ2B.setSelected(false);
        jRadioButtonQ2C.setSelected(false);
        jRadioButtonQ2D.setSelected(false);
        } 
    }//GEN-LAST:event_jRadioButtonQ2AActionPerformed

    private void jRadioButtonQ2BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ2BActionPerformed
        //Question 2B selected:
        if (jRadioButtonQ2B.isSelected()) {
        jRadioButtonQ2A.setSelected(false);
        jRadioButtonQ2C.setSelected(false);
        jRadioButtonQ2D.setSelected(false);
        } 
    }//GEN-LAST:event_jRadioButtonQ2BActionPerformed

    private void jRadioButtonQ2CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ2CActionPerformed
        //Question 2C selected:
        if (jRadioButtonQ2C.isSelected()) {
        jRadioButtonQ2A.setSelected(false);
        jRadioButtonQ2B.setSelected(false);
        jRadioButtonQ2D.setSelected(false);
        } 
    }//GEN-LAST:event_jRadioButtonQ2CActionPerformed

    private void jRadioButtonQ2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQ2DActionPerformed
        ///Question 2D selected:
        if (jRadioButtonQ2D.isSelected()) {
        jRadioButtonQ2A.setSelected(false);
        jRadioButtonQ2B.setSelected(false);
        jRadioButtonQ2C.setSelected(false);
        } 
    }//GEN-LAST:event_jRadioButtonQ2DActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameQuestion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameQuestion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameQuestion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameQuestion2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameQuestion2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonQ2Submit;
    private javax.swing.JLabel jLabelQuestion2;
    private javax.swing.JPanel jPanelQuestion2;
    private javax.swing.JRadioButton jRadioButtonQ2A;
    private javax.swing.JRadioButton jRadioButtonQ2B;
    private javax.swing.JRadioButton jRadioButtonQ2C;
    private javax.swing.JRadioButton jRadioButtonQ2D;
    // End of variables declaration//GEN-END:variables
}

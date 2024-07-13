package quiz;

import quiz.*;
import javax.swing.*;
import javax.swing.JTextArea;
import quiz.OnlineQuizzes.ScoreManager;

public class JFrameResultsPage extends javax.swing.JFrame {
    private ScoreManager scoreManager;
    private  Quiz quiz;

    public JFrameResultsPage() {
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

        jPanelResultsPage = new javax.swing.JPanel();
        jLabelResultsPage = new javax.swing.JLabel();
        jButtonResultsPage = new javax.swing.JButton();
        jTextFieldResults = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelResultsPage.setText("Score:");

        jButtonResultsPage.setText("Check Your Score!");
        jButtonResultsPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResultsPageActionPerformed(evt);
            }
        });

        jTextFieldResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldResultsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelResultsPageLayout = new javax.swing.GroupLayout(jPanelResultsPage);
        jPanelResultsPage.setLayout(jPanelResultsPageLayout);
        jPanelResultsPageLayout.setHorizontalGroup(
            jPanelResultsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelResultsPageLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabelResultsPage, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanelResultsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldResults)
                    .addComponent(jButtonResultsPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(84, 84, 84))
        );
        jPanelResultsPageLayout.setVerticalGroup(
            jPanelResultsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultsPageLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanelResultsPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelResultsPage, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldResults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jButtonResultsPage)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelResultsPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelResultsPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResultsPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResultsPageActionPerformed
        // TODO add your handling code here:
        jTextFieldResults.setText("Your score is: " + scoreManager.getScore());
    }//GEN-LAST:event_jButtonResultsPageActionPerformed

    private void jTextFieldResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldResultsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldResultsActionPerformed
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameResultsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameResultsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameResultsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameResultsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameResultsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonResultsPage;
    private javax.swing.JLabel jLabelResultsPage;
    private javax.swing.JPanel jPanelResultsPage;
    private javax.swing.JTextField jTextFieldResults;
    // End of variables declaration//GEN-END:variables
}

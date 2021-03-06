
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kazec
 */
public class RandomGameGUI extends javax.swing.JFrame {

    /**
     * Creates new form HelloWorldGUI
     */
    public RandomGameGUI() {
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

        titlePanel = new javax.swing.JPanel();
        title = new javax.swing.JTextField();
        logoPanel = new javax.swing.JPanel();
        logoText = new javax.swing.JLabel();
        sidebarPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        game1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        game1ContButton = new javax.swing.JButton();
        wrongMessage1 = new javax.swing.JTextField();
        rulesTitle = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(java.awt.Color.lightGray);

        title.setEditable(false);
        title.setBackground(new java.awt.Color(204, 204, 204));
        title.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(51, 102, 255));
        title.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        title.setText("Random Game");
        title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 76, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        logoPanel.setBackground(new java.awt.Color(204, 204, 204));
        logoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logoPanel.setToolTipText("");

        logoText.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        logoText.setAlignmentY(0.0F);
        logoText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoText)
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoText, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("1) Play\n2) Don't not play\n3) Win");
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
        sidebarPanel.setLayout(sidebarPanelLayout);
        sidebarPanelLayout.setHorizontalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sidebarPanelLayout.setVerticalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        game1.setBackground(new java.awt.Color(204, 204, 204));
        game1.setBorder(javax.swing.BorderFactory.createTitledBorder("Check all of the boxes and press continue!"));
        game1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCheckBox1.setBackground(new java.awt.Color(204, 204, 204));

        jCheckBox2.setBackground(new java.awt.Color(204, 204, 204));

        jCheckBox3.setBackground(new java.awt.Color(204, 204, 204));

        jCheckBox4.setBackground(new java.awt.Color(204, 204, 204));

        jCheckBox5.setBackground(new java.awt.Color(204, 204, 204));

        jCheckBox6.setBackground(new java.awt.Color(204, 204, 204));

        jCheckBox7.setBackground(new java.awt.Color(204, 204, 204));

        jCheckBox8.setBackground(new java.awt.Color(204, 204, 204));

        jCheckBox9.setBackground(new java.awt.Color(204, 204, 204));

        game1ContButton.setBackground(new java.awt.Color(204, 204, 204));
        game1ContButton.setText("Continue");
        game1ContButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                game1ContButtonActionPerformed(evt);
            }
        });

        wrongMessage1.setBackground(new java.awt.Color(204, 204, 204));
        wrongMessage1.setForeground(new java.awt.Color(255, 0, 0));
        wrongMessage1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        wrongMessage1.setText("Wrong");
        wrongMessage1.setBorder(null);
        wrongMessage1.setVisible(false);

        javax.swing.GroupLayout game1Layout = new javax.swing.GroupLayout(game1);
        game1.setLayout(game1Layout);
        game1Layout.setHorizontalGroup(
            game1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(game1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jCheckBox5)
                .addGroup(game1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(game1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, game1Layout.createSequentialGroup()
                        .addGap(0, 263, Short.MAX_VALUE)
                        .addGroup(game1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox7)
                            .addComponent(wrongMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(game1ContButton)
                .addContainerGap())
            .addGroup(game1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jCheckBox9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(game1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(game1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox8)
                    .addGroup(game1Layout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addGap(119, 119, 119)
                        .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(game1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox3)
                .addGap(133, 133, 133))
        );
        game1Layout.setVerticalGroup(
            game1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(game1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(game1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox5))
                .addGroup(game1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(game1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jCheckBox4))
                    .addGroup(game1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jCheckBox3)))
                .addGroup(game1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(game1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jCheckBox2))
                    .addGroup(game1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jCheckBox6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(game1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, game1Layout.createSequentialGroup()
                        .addComponent(jCheckBox9)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, game1Layout.createSequentialGroup()
                        .addComponent(jCheckBox7)
                        .addGap(78, 78, 78)))
                .addComponent(jCheckBox8)
                .addGap(16, 16, 16)
                .addGroup(game1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(game1ContButton)
                    .addComponent(wrongMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        rulesTitle.setBackground(new java.awt.Color(204, 204, 204));
        rulesTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rulesTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rulesTitle.setText("Rules");
        rulesTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sidebarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(rulesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(game1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rulesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sidebarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(game1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        game1.getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(793, 541));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void game1ContButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_game1ContButtonActionPerformed
        if (jCheckBox1.isSelected() && jCheckBox2.isSelected() && jCheckBox3.isSelected() && jCheckBox4.isSelected() && jCheckBox5.isSelected() && jCheckBox6.isSelected() && jCheckBox7.isSelected() && jCheckBox8.isSelected() && jCheckBox9.isSelected()) {
            game1.setVisible(false);
        }
        else {
            wrongMessage1.setVisible(true);
            game1.revalidate();
            game1.repaint();
        }
    }//GEN-LAST:event_game1ContButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RandomGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RandomGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RandomGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RandomGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RandomGameGUI().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel game1;
    private javax.swing.JButton game1ContButton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JLabel logoText;
    private javax.swing.JTextField rulesTitle;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JTextField title;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField wrongMessage1;
    // End of variables declaration//GEN-END:variables
}

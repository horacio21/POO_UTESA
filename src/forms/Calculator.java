package forms;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author horac
 */
public class Calculator extends javax.swing.JFrame {

    float a = 0, b = 0, c = 0;
    
    public Calculator() {
        initComponents();
        this.setLocationRelativeTo(null);
        firstValueText.setBackground(Color.yellow);
    }
    
    public void go(){
        if (sumRadio.isSelected()) {
            sum();
        }
        if (restRadio.isSelected()) {
            rest();
        }
        if (multiplicationRadio.isSelected()) {
            multiplication();
        }
        if (divisionRadio.isSelected()) {
            division();
        }
    }
    
    public void sum(){
        a = Float.parseFloat(firstValueText.getText());
        b = Float.parseFloat(secondValueText.getText());
            
        resultText.setText(String.valueOf(a + b));
    }
    
    public void rest(){
        a = Float.parseFloat(firstValueText.getText());
        b = Float.parseFloat(secondValueText.getText());
            
        resultText.setText(String.valueOf(a - b));
    }
    
    public void multiplication(){
        a = Float.parseFloat(firstValueText.getText());
        b = Float.parseFloat(secondValueText.getText());
            
        resultText.setText(String.valueOf(a * b));
    }

    public void division(){
        if (b == 0) {
            JOptionPane.showMessageDialog(null, "The second value cannot be ZERO for divisions.");
            secondValueText.setText("");
            resultText.setText("");
            return;
        }

        a = Float.parseFloat(firstValueText.getText());
        b = Float.parseFloat(secondValueText.getText());

        resultText.setText(String.valueOf(a / b));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        firstValueText = new javax.swing.JTextField();
        secondValueText = new javax.swing.JTextField();
        firstValueLabel = new javax.swing.JLabel();
        secondValueLabel = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        resultText = new javax.swing.JTextField();
        goButton = new javax.swing.JButton();
        sumRadio = new javax.swing.JRadioButton();
        multiplicationRadio = new javax.swing.JRadioButton();
        restRadio = new javax.swing.JRadioButton();
        divisionRadio = new javax.swing.JRadioButton();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Calculator"));

        firstValueText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstValueTextActionPerformed(evt);
            }
        });

        secondValueText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondValueTextActionPerformed(evt);
            }
        });

        firstValueLabel.setText("First Value:");

        secondValueLabel.setText("Second Value:");

        resultLabel.setText("Result:");

        resultText.setEditable(false);
        resultText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultTextActionPerformed(evt);
            }
        });

        goButton.setText("Go");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(sumRadio);
        sumRadio.setText("Sum");

        buttonGroup1.add(multiplicationRadio);
        multiplicationRadio.setText("Multiplication");

        buttonGroup1.add(restRadio);
        restRadio.setText("Rest");

        buttonGroup1.add(divisionRadio);
        divisionRadio.setText("Division");

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(firstValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secondValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(secondValueText, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(firstValueText)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resultText)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sumRadio)
                    .addComponent(multiplicationRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(divisionRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(restRadio)
                    .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstValueText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstValueLabel)
                    .addComponent(sumRadio)
                    .addComponent(restRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(secondValueText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(secondValueLabel))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(multiplicationRadio)
                        .addComponent(divisionRadio)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resultText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(resultLabel)
                        .addComponent(goButton))
                    .addComponent(closeButton))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstValueTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstValueTextActionPerformed
        if (firstValueText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "The first value cannot be empty");
            firstValueText.requestFocus(true);
            firstValueText.setBackground(Color.yellow);
        }
        else{
            secondValueText.requestFocus(true);
            secondValueText.setBackground(Color.yellow);
            firstValueText.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_firstValueTextActionPerformed

    private void secondValueTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondValueTextActionPerformed
        if (secondValueText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "The second value cannot be empty");
            secondValueText.requestFocus(true);
            secondValueText.setBackground(Color.yellow);
        }
        else{
            resultText.requestFocus(true);
            resultText.setBackground(Color.yellow);
            secondValueText.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_secondValueTextActionPerformed

    private void resultTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultTextActionPerformed

    }//GEN-LAST:event_resultTextActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        if (firstValueText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "The first value cannot be empty");
            firstValueText.requestFocus(true);
            firstValueText.setBackground(Color.yellow);
            secondValueText.setBackground(Color.WHITE);
            return;
        }
        if (secondValueText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "The second value cannot be empty");
            secondValueText.requestFocus(true);
            firstValueText.setBackground(Color.WHITE);
            secondValueText.setBackground(Color.yellow);
            return;
        }
        go();
    }//GEN-LAST:event_goButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton closeButton;
    private javax.swing.JRadioButton divisionRadio;
    private javax.swing.JLabel firstValueLabel;
    private javax.swing.JTextField firstValueText;
    private javax.swing.JButton goButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton multiplicationRadio;
    private javax.swing.JRadioButton restRadio;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JTextField resultText;
    private javax.swing.JLabel secondValueLabel;
    private javax.swing.JTextField secondValueText;
    private javax.swing.JRadioButton sumRadio;
    // End of variables declaration//GEN-END:variables
}

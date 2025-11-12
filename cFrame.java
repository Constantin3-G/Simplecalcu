/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
import java.awt.event.ActionEvent;


public class cFrame extends javax.swing.JFrame {
    
  private String operator;
  private double num1;
  private boolean operatorClicked = false;

    
    public cFrame() {
        initComponents();
        setupKeyBindings();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnSvn = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        zeroBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnPls = new javax.swing.JButton();
        subsBtn = new javax.swing.JButton();
        mltplyBtn = new javax.swing.JButton();
        dvdBtn = new javax.swing.JButton();
        clrBtn = new javax.swing.JButton();
        eqlsBtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(4, 4));

        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });
        jPanel1.add(btnOne);

        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });
        jPanel1.add(btnTwo);

        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });
        jPanel1.add(btnThree);

        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });
        jPanel1.add(btnFour);

        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });
        jPanel1.add(btnFive);

        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });
        jPanel1.add(btnSix);

        btnSvn.setText("7");
        btnSvn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSvnActionPerformed(evt);
            }
        });
        jPanel1.add(btnSvn);

        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });
        jPanel1.add(btnEight);

        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });
        jPanel1.add(btnNine);

        zeroBtn.setText("0");
        zeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroBtnActionPerformed(evt);
            }
        });
        jPanel1.add(zeroBtn);

        jPanel2.setLayout(new java.awt.GridLayout(3, 2));

        btnPls.setText("+");
        btnPls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlsActionPerformed(evt);
            }
        });
        jPanel2.add(btnPls);

        subsBtn.setText("-");
        subsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(subsBtn);

        mltplyBtn.setText("X");
        mltplyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mltplyBtnActionPerformed(evt);
            }
        });
        jPanel2.add(mltplyBtn);

        dvdBtn.setText("/");
        dvdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dvdBtnActionPerformed(evt);
            }
        });
        jPanel2.add(dvdBtn);

        clrBtn.setText("Clear");
        clrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrBtnActionPerformed(evt);
            }
        });
        jPanel2.add(clrBtn);

        eqlsBtn.setText("=");
        eqlsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eqlsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(eqlsBtn);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                .addComponent(jTextField2))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setupKeyBindings() {
        // PLUS
        jTextField1.getInputMap().put(KeyStroke.getKeyStroke('+'), "plus");
        jTextField1.getActionMap().put("plus", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handlePlus();
            }
        });

        // MINUS
        jTextField1.getInputMap().put(KeyStroke.getKeyStroke('-'), "minus");
        jTextField1.getActionMap().put("minus", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleMinus();
            }
        });

        // MULTIPLY
        jTextField1.getInputMap().put(KeyStroke.getKeyStroke('*'), "multiply");
        jTextField1.getActionMap().put("multiply", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleMultiply();
            }
        });

        // DIVIDE
        jTextField1.getInputMap().put(KeyStroke.getKeyStroke('/'), "divide");
        jTextField1.getActionMap().put("divide", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleDivide();
            }
        });
        
        jTextField2.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "equal");
        jTextField2.getActionMap().put("equal", new AbstractAction() {
           @Override
           public void actionPerformed(ActionEvent e) {
               calculateResult();
    }
});
    }
       

   private void handlePlus() {
    jTextField2.requestFocus();
    operator = "+";
    num1 = Double.parseDouble(jTextField1.getText());
    operatorClicked = true;
}

   private void handleMinus() {
    jTextField2.requestFocus();
    operator = "-";
    num1 = Double.parseDouble(jTextField1.getText());
    operatorClicked = true;
}

   private void handleMultiply() {
    jTextField2.requestFocus();
    operator = "*";
    num1 = Double.parseDouble(jTextField1.getText());
    operatorClicked = true;
}

   private void handleDivide() {
    jTextField2.requestFocus();
    operator = "/";
    num1 = Double.parseDouble(jTextField1.getText());
    operatorClicked = true;
}
    
   
   private void calculateResult() {
    double num2 = Double.parseDouble(jTextField2.getText());
    double result = 0;

    switch (operator) {
        case "+": result = num1 + num2; break;
        case "-": result = num1 - num2; break;
        case "*": result = num1 * num2; break;
        case "/": result = num1 / num2; break;
    }

    jLabel1.setText(String.valueOf(result));

    // Reset operatorClicked so next number starts in first field
    operatorClicked = false;
}
    
    
    //Operators +-*/
    
    private void btnPlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlsActionPerformed
         handlePlus();
        
       
    }//GEN-LAST:event_btnPlsActionPerformed

    private void subsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subsBtnActionPerformed
         handleMinus();
        
       
    }//GEN-LAST:event_subsBtnActionPerformed

    private void mltplyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mltplyBtnActionPerformed
         handleMultiply();
    }//GEN-LAST:event_mltplyBtnActionPerformed

    private void dvdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dvdBtnActionPerformed
         handleDivide();
        
    }//GEN-LAST:event_dvdBtnActionPerformed

    private void clrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrBtnActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jLabel1.setText("");
        
        num1 = 0;
        operator = "";
        operatorClicked = false;
        
        jTextField1.requestFocus();
        
        
    }//GEN-LAST:event_clrBtnActionPerformed

   

    
    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        if (!operatorClicked) {
           jTextField1.setText(jTextField1.getText() + "1");
        } else {
           jTextField2.setText(jTextField2.getText() + "1");
        
        }
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        if (!operatorClicked) {
           jTextField1.setText(jTextField1.getText() + "2");
        } else {
           jTextField2.setText(jTextField2.getText() + "2");
        
        }
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        if (!operatorClicked) {
           jTextField1.setText(jTextField1.getText() + "3");
        } else {
           jTextField2.setText(jTextField2.getText() + "3");
        
        }
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        if (!operatorClicked) {
           jTextField1.setText(jTextField1.getText() + "4");
        } else {
           jTextField2.setText(jTextField2.getText() + "4");
        
        } 
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        if (!operatorClicked) {
           jTextField1.setText(jTextField1.getText() + "5");
        } else {
           jTextField2.setText(jTextField2.getText() + "5");
        
        } 
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        if (!operatorClicked) {
           jTextField1.setText(jTextField1.getText() + "6");
        } else {
           jTextField2.setText(jTextField2.getText() + "6");
        
        }
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnSvnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSvnActionPerformed
        if (!operatorClicked) {
           jTextField1.setText(jTextField1.getText() + "7");
        } else {
           jTextField2.setText(jTextField2.getText() + "7");
        
        } 
    }//GEN-LAST:event_btnSvnActionPerformed

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        if (!operatorClicked) {
           jTextField1.setText(jTextField1.getText() + "8");
        } else {
           jTextField2.setText(jTextField2.getText() + "8");
        
        }
    }//GEN-LAST:event_btnEightActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        if (!operatorClicked) {
           jTextField1.setText(jTextField1.getText() + "9");
        } else {
           jTextField2.setText(jTextField2.getText() + "9");
        
        }
    }//GEN-LAST:event_btnNineActionPerformed

    private void zeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroBtnActionPerformed
         if (!operatorClicked) {
           jTextField1.setText(jTextField1.getText() + "0");
        } else {
           jTextField2.setText(jTextField2.getText() + "0");
        
        }   
         
    }//GEN-LAST:event_zeroBtnActionPerformed

    private void eqlsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eqlsBtnActionPerformed
       calculateResult();
    }//GEN-LAST:event_eqlsBtnActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(cFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnPls;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnSvn;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton clrBtn;
    private javax.swing.JButton dvdBtn;
    private javax.swing.JButton eqlsBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton mltplyBtn;
    private javax.swing.JButton subsBtn;
    private javax.swing.JButton zeroBtn;
    // End of variables declaration//GEN-END:variables
}

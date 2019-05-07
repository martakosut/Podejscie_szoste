/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kosut;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class NumerMaszynisty extends javax.swing.JFrame {

    
    Color k1 = new Color(3, 17, 34); //kolor tła
    Color k2 = new Color(255, 255, 255); // biały
    Color k3 = new Color(0, 0, 0); // czarny
    Color k4 = new Color(33, 49, 74); // kolor linii PASP Jasny
    Color k5 = new Color(41, 74, 107); // kolor linii PASP Ciemnny
    Color k6 = new Color(195, 195, 195); // szary
    Color k7 = new Color(150, 150, 150); // średni szary
    Color k8 = new Color(85, 85, 85); // ciemny szary
    Color k9 = new Color(8, 24, 57); // cień
    Color k10 = new Color(223, 223, 0); // żółty
    Color k11 = new Color(234, 124, 0); // pomrańczowy
    Color k12 = new Color(191, 0, 2); //czerwony
    Font j = new Font("Dialog", Font.BOLD, 16);
    Wyswietlacz_400 W1;
    Wskazowka1 K1;
    Wyswietlacz_250 W2;
    Wyswietlacz_180 W3;
    Wyswietlacz_140 W4;
    Ikony I;
    int wynik;

    public NumerMaszynisty() {
        initComponents();
        setBackground(k1);
         setSize(640, 480);
         W1 = new Wyswietlacz_400();
        K1 = new Wskazowka1(194, 165, 82, 9, 105, 3);
        W2 = new Wyswietlacz_250();
        W3 = new Wyswietlacz_180();
        W4 = new Wyswietlacz_140();
        I = new Ikony();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //Metoda rysowania
        g.setColor(k1); // tło
        g.fillRect(0, 0, 640, 480);
       I.Tlo(g);
        
        
        I.StandBy(g);
        K1.rysuj(g);
        g.setColor(k3);
        g.setFont(j);
        g.drawString("" + wynik, 180, 170);
        W1.rysuj(g);
        I.ETCS_1(g);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        button6 = new java.awt.Button();
        button7 = new java.awt.Button();
        button8 = new java.awt.Button();
        button9 = new java.awt.Button();
        Usun = new java.awt.Button();
        button10 = new java.awt.Button();
        button11 = new java.awt.Button();
        Wyjscie = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);

        label1.setBackground(new java.awt.Color(0, 0, 0));
        label1.setForeground(new java.awt.Color(250, 250, 250));
        label1.setText("Numer maszynisty");

        textField1.setBackground(new java.awt.Color(195, 195, 195));

        button1.setBackground(new java.awt.Color(3, 17, 34));
        button1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(250, 250, 250));
        button1.setLabel("1");
        button1.setName(""); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(3, 17, 34));
        button2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button2.setForeground(new java.awt.Color(250, 250, 250));
        button2.setLabel("2 abc");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(3, 17, 34));
        button3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button3.setForeground(new java.awt.Color(250, 250, 250));
        button3.setLabel("3 def");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(3, 17, 34));
        button4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button4.setForeground(new java.awt.Color(250, 250, 250));
        button4.setLabel("4 def");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setBackground(new java.awt.Color(3, 17, 34));
        button5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button5.setForeground(new java.awt.Color(250, 250, 250));
        button5.setLabel("5 jkl");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setBackground(new java.awt.Color(3, 17, 34));
        button6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button6.setForeground(new java.awt.Color(250, 250, 250));
        button6.setLabel("6 mno");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button7.setBackground(new java.awt.Color(3, 17, 34));
        button7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button7.setForeground(new java.awt.Color(250, 250, 250));
        button7.setLabel("7 pqrs");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setBackground(new java.awt.Color(3, 17, 34));
        button8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button8.setForeground(new java.awt.Color(250, 250, 250));
        button8.setLabel("8 tuv");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setBackground(new java.awt.Color(3, 17, 34));
        button9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button9.setForeground(new java.awt.Color(250, 250, 250));
        button9.setLabel("9 wxyz");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        Usun.setBackground(new java.awt.Color(3, 17, 34));
        Usun.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Usun.setForeground(new java.awt.Color(250, 250, 250));
        Usun.setLabel("Usuń");
        Usun.setName(""); // NOI18N
        Usun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsunActionPerformed(evt);
            }
        });

        button10.setBackground(new java.awt.Color(3, 17, 34));
        button10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button10.setForeground(new java.awt.Color(250, 250, 250));
        button10.setLabel("0");
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });

        button11.setBackground(new java.awt.Color(3, 17, 34));
        button11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        button11.setForeground(new java.awt.Color(250, 250, 250));
        button11.setLabel(".");
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });

        Wyjscie.setActionCommand("Wyjscie");
        Wyjscie.setBackground(new java.awt.Color(3, 17, 34));
        Wyjscie.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Wyjscie.setForeground(new java.awt.Color(250, 250, 250));
        Wyjscie.setLabel("X");
        Wyjscie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WyjscieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Wyjscie, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Usun, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Usun, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(Wyjscie, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
          textField1.setText(textField1.getText() + "1");
    }//GEN-LAST:event_button1ActionPerformed

    long czasPoprzedni = 0;
    int numerZnaku = 0;
    
    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
         String[] znaki = {"2", "a", "b", "c"};
        long czasTeraz = System.currentTimeMillis();
        if (czasTeraz - czasPoprzedni > 500) {
            numerZnaku = 0;

        } else {
            if (numerZnaku < znaki.length - 1) {
                numerZnaku++;
            }

        }

        textField1.setText(textField1.getText() + znaki[numerZnaku]);
        czasPoprzedni = czasTeraz;
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        String[] znaki = {"3", "d", "e", "f"};
        long czasTeraz = System.currentTimeMillis();
        if (czasTeraz - czasPoprzedni > 500) {
            numerZnaku = 0;

        } else {
            if (numerZnaku < znaki.length - 1) {
                numerZnaku++;
            }

        }

        textField1.setText(textField1.getText() + znaki[numerZnaku]);
        czasPoprzedni = czasTeraz;
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
         String[] znaki = {"4", "g", "h", "i"};
        long czasTeraz = System.currentTimeMillis();
        if (czasTeraz - czasPoprzedni > 500) {
            numerZnaku = 0;

        } else {
            if (numerZnaku < znaki.length - 1) {
                numerZnaku++;
            }

        }

        textField1.setText(textField1.getText() + znaki[numerZnaku]);
        czasPoprzedni = czasTeraz;
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
         String[] znaki = {"5", "j", "k", "l"};
        long czasTeraz = System.currentTimeMillis();
        if (czasTeraz - czasPoprzedni > 500) {
            numerZnaku = 0;

        } else {
            if (numerZnaku < znaki.length - 1) {
                numerZnaku++;
            }

        }

        textField1.setText(textField1.getText() + znaki[numerZnaku]);
        czasPoprzedni = czasTeraz;
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
           String[] znaki = {"6", "m", "n", "o"};
        long czasTeraz = System.currentTimeMillis();
        if (czasTeraz - czasPoprzedni > 500) {
            numerZnaku = 0;

        } else {
            if (numerZnaku < znaki.length - 1) {
                numerZnaku++;
            }

        }

        textField1.setText(textField1.getText() + znaki[numerZnaku]);
        czasPoprzedni = czasTeraz;
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        // TODO add your handling code here:
         String[] znaki = {"7", "p", "q", "r", "s"};
        long czasTeraz = System.currentTimeMillis();
        if (czasTeraz - czasPoprzedni > 500) {
            numerZnaku = 0;

        } else {
            if (numerZnaku < znaki.length - 1) {
                numerZnaku++;
            }

        }

        textField1.setText(textField1.getText() + znaki[numerZnaku]);
        czasPoprzedni = czasTeraz;
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        // TODO add your handling code here:
        String[] znaki = {"8", "t", "u", "v"};
        long czasTeraz = System.currentTimeMillis();
        if (czasTeraz - czasPoprzedni > 500) {
            numerZnaku = 0;

        } else {
            if (numerZnaku < znaki.length - 1) {
                numerZnaku++;
            }

        }

        textField1.setText(textField1.getText() + znaki[numerZnaku]);
        czasPoprzedni = czasTeraz;
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        // TODO add your handling code here:
            String[] znaki = {"9", "w", "x", "y", "z"};
        long czasTeraz = System.currentTimeMillis();
        if (czasTeraz - czasPoprzedni > 500) {
            numerZnaku = 0;

        } else {
            if (numerZnaku < znaki.length - 1) {
                numerZnaku++;
            }

        }

        textField1.setText(textField1.getText() + znaki[numerZnaku]);
        czasPoprzedni = czasTeraz;
    }//GEN-LAST:event_button9ActionPerformed

    private void UsunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsunActionPerformed
        // TODO add your handling code here:
        textField1.setText(null);
    }//GEN-LAST:event_UsunActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        // TODO add your handling code here:
        textField1.setText(textField1.getText() + "0");
    }//GEN-LAST:event_button10ActionPerformed

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        // TODO add your handling code here:
          textField1.setText(textField1.getText() + ".");
    }//GEN-LAST:event_button11ActionPerformed

    private void WyjscieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WyjscieActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_WyjscieActionPerformed

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
            java.util.logging.Logger.getLogger(NumerMaszynisty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumerMaszynisty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumerMaszynisty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumerMaszynisty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumerMaszynisty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Usun;
    private java.awt.Button Wyjscie;
    private java.awt.Button button1;
    private java.awt.Button button10;
    private java.awt.Button button11;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private java.awt.Button button8;
    private java.awt.Button button9;
    private java.awt.Label label1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}

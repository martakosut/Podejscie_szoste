/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kosut;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author User
 */
public class KoniecJazdy extends javax.swing.JFrame {

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

    public KoniecJazdy() {
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
        //   g.setColor(k1); // tło
        // g.fillRect(0, 0, 640, 480);
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
        EOA = new java.awt.Button();
        button1 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        label1.setBackground(new java.awt.Color(0, 0, 0));
        label1.setForeground(new java.awt.Color(250, 250, 250));
        label1.setName(""); // NOI18N
        label1.setText("Koniec Jazdy");

        EOA.setActionCommand("EOA");
        EOA.setBackground(new java.awt.Color(3, 17, 34));
        EOA.setForeground(new java.awt.Color(150, 150, 150));
        EOA.setLabel("EOA");
        EOA.setName("EOA"); // NOI18N

        button1.setActionCommand("Wyjscie");
        button1.setBackground(new java.awt.Color(3, 17, 34));
        button1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        button1.setForeground(new java.awt.Color(250, 250, 250));
        button1.setLabel("X");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EOA, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(EOA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(KoniecJazdy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KoniecJazdy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KoniecJazdy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KoniecJazdy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KoniecJazdy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button EOA;
    private java.awt.Button button1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}

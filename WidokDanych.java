
package Kosut;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class WidokDanych extends javax.swing.JFrame  {

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
    
    public WidokDanych() {
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
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        NumerMaszynisty = new java.awt.TextField();
        NumerPociagu = new java.awt.TextField();
        Dlugosc = new java.awt.TextField();
        ProcentHamulca = new java.awt.TextField();
        PredkoscMax = new java.awt.TextField();
        NaciskNaOs = new java.awt.TextField();
        Wyjscie = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);

        label1.setBackground(new java.awt.Color(0, 0, 0));
        label1.setForeground(new java.awt.Color(250, 250, 250));
        label1.setText("Widok danych");

        label2.setAlignment(java.awt.Label.RIGHT);
        label2.setBackground(new java.awt.Color(3, 17, 34));
        label2.setForeground(new java.awt.Color(195, 195, 195));
        label2.setText("Numer maszynisty");

        label3.setAlignment(java.awt.Label.RIGHT);
        label3.setBackground(new java.awt.Color(3, 17, 34));
        label3.setForeground(new java.awt.Color(195, 195, 195));
        label3.setText("Numer pociągu");

        label4.setAlignment(java.awt.Label.RIGHT);
        label4.setBackground(new java.awt.Color(3, 17, 34));
        label4.setForeground(new java.awt.Color(195, 195, 195));
        label4.setText("Długość (m)");

        label5.setAlignment(java.awt.Label.RIGHT);
        label5.setBackground(new java.awt.Color(3, 17, 34));
        label5.setForeground(new java.awt.Color(195, 195, 195));
        label5.setText("Procent hamulca");

        label6.setAlignment(java.awt.Label.RIGHT);
        label6.setBackground(new java.awt.Color(3, 17, 34));
        label6.setForeground(new java.awt.Color(195, 195, 195));
        label6.setText("Prędkość max. (km/h)");

        label7.setAlignment(java.awt.Label.RIGHT);
        label7.setBackground(new java.awt.Color(3, 17, 34));
        label7.setForeground(new java.awt.Color(195, 195, 195));
        label7.setText("Nacisk na oś (t)");

        NumerMaszynisty.setBackground(new java.awt.Color(3, 17, 34));
        NumerMaszynisty.setForeground(new java.awt.Color(195, 195, 195));

        NumerPociagu.setBackground(new java.awt.Color(3, 17, 34));
        NumerPociagu.setForeground(new java.awt.Color(195, 195, 195));

        Dlugosc.setBackground(new java.awt.Color(3, 17, 34));
        Dlugosc.setForeground(new java.awt.Color(195, 195, 195));

        ProcentHamulca.setBackground(new java.awt.Color(3, 17, 34));
        ProcentHamulca.setForeground(new java.awt.Color(195, 195, 195));

        PredkoscMax.setBackground(new java.awt.Color(3, 17, 34));
        PredkoscMax.setForeground(new java.awt.Color(195, 195, 195));

        NaciskNaOs.setBackground(new java.awt.Color(3, 17, 34));
        NaciskNaOs.setForeground(new java.awt.Color(195, 195, 195));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Wyjscie, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(NaciskNaOs, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(PredkoscMax, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ProcentHamulca, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Dlugosc, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(NumerPociagu, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(NumerMaszynisty, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(NumerMaszynisty, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(NumerPociagu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Dlugosc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ProcentHamulca, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PredkoscMax, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NaciskNaOs, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(174, 174, 174)
                .addComponent(Wyjscie, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(WidokDanych.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WidokDanych.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WidokDanych.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WidokDanych.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WidokDanych().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.TextField Dlugosc;
    public java.awt.TextField NaciskNaOs;
    public java.awt.TextField NumerMaszynisty;
    public java.awt.TextField NumerPociagu;
    public java.awt.TextField PredkoscMax;
    public java.awt.TextField ProcentHamulca;
    private java.awt.Button Wyjscie;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    // End of variables declaration//GEN-END:variables
}

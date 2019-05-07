package Kosut;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Spec extends javax.swing.JFrame {

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

    public Spec() {
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
        Przyczepnosc = new java.awt.Button();
        SRpredkosc_odleglosc = new java.awt.Button();
        CiagloscSkladu = new java.awt.Button();
        Wyjscie = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);

        label1.setBackground(new java.awt.Color(0, 0, 0));
        label1.setForeground(new java.awt.Color(250, 250, 250));
        label1.setText("Specjalne");

        Przyczepnosc.setBackground(new java.awt.Color(3, 17, 34));
        Przyczepnosc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Przyczepnosc.setForeground(new java.awt.Color(250, 250, 250));
        Przyczepnosc.setLabel("Przyczepność");
        Przyczepnosc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrzyczepnoscActionPerformed(evt);
            }
        });

        SRpredkosc_odleglosc.setBackground(new java.awt.Color(3, 17, 34));
        SRpredkosc_odleglosc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SRpredkosc_odleglosc.setForeground(new java.awt.Color(250, 250, 250));
        SRpredkosc_odleglosc.setLabel("SR prędkość/odległość");
        SRpredkosc_odleglosc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SRpredkosc_odlegloscActionPerformed(evt);
            }
        });

        CiagloscSkladu.setBackground(new java.awt.Color(3, 17, 34));
        CiagloscSkladu.setForeground(new java.awt.Color(150, 150, 150));
        CiagloscSkladu.setLabel("Ciągłość składu");

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
                    .addComponent(CiagloscSkladu, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Przyczepnosc, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(SRpredkosc_odleglosc, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Przyczepnosc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SRpredkosc_odleglosc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(CiagloscSkladu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242)
                .addComponent(Wyjscie, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WyjscieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WyjscieActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_WyjscieActionPerformed

    private void SRpredkosc_odlegloscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SRpredkosc_odlegloscActionPerformed
        // TODO add your handling code here:
        SRpredkosc_odleglosc sr = new SRpredkosc_odleglosc();
        sr.setVisible(true);
        System.out.println("Wybrano przycisk SR PRĘDKOŚĆ/ODLEGŁOŚĆ");
    }//GEN-LAST:event_SRpredkosc_odlegloscActionPerformed

    private void PrzyczepnoscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrzyczepnoscActionPerformed
        // TODO add your handling code here:
        Przyczepnosc p = new Przyczepnosc();
        p.setVisible(true);
        System.out.println("Wybrano przycisk PRZYCZEPNOŚĆ");
    }//GEN-LAST:event_PrzyczepnoscActionPerformed

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
            java.util.logging.Logger.getLogger(Spec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Spec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Spec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Spec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Spec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button CiagloscSkladu;
    private java.awt.Button Przyczepnosc;
    private java.awt.Button SRpredkosc_odleglosc;
    private java.awt.Button Wyjscie;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}

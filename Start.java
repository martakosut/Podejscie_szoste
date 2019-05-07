package Kosut;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Start extends javax.swing.JFrame  {

    public Color k1 = new Color(3, 17, 34); //kolor tła
    public Color k2 = new Color(255, 255, 255); // biały
    public Color k3 = new Color(0, 0, 0); // czarny
    public Color k4 = new Color(33, 49, 74); // kolor linii PASP Jasny
    public Color k5 = new Color(41, 74, 107); // kolor linii PASP Ciemnny
    public Color k6 = new Color(195, 195, 195); // szary
    public Color k7 = new Color(150, 150, 150); // średni szary
    public Color k8 = new Color(85, 85, 85); // ciemny szary
    public Color k9 = new Color(8, 24, 57); // cień
    public Color k10 = new Color(223, 223, 0); // żółty
    public Color k11 = new Color(234, 124, 0); // pomrańczowy
    public Color k12 = new Color(191, 0, 2); //czerwony
    Font j = new Font("Dialog", Font.BOLD, 16);
    Wyswietlacz_400 W1;
    Wskazowka1 K1;
    Wyswietlacz_250 W2;
    Wyswietlacz_180 W3;
    Wyswietlacz_140 W4;
    Ikony I;
    ObszarD D;
    ObszarA A;
   // Pociąg P;
    
    JPanel aktywnyPanel = null;

    int c = 0;
    int odl;
    int clicked = 1;
    int press = 1;
    int klik;
    double angle = -54;
    int wynik;
    int wynik1;
    int wynik2;
    int wynik8;

    public Start() {
        initComponents();
        setBackground(k1);
        setSize(640, 480);

        W1 = new Wyswietlacz_400();
        K1 = new Wskazowka1(194, 165, 82, 9, 105, 3);
        //K2 = new Wskazowka2(194, 165, 82, 9, 105, 3);
        W2 = new Wyswietlacz_250();
        W3 = new Wyswietlacz_180();
        W4 = new Wyswietlacz_140();
        I = new Ikony();
        A = new ObszarA(30, 99, 8, 187);
         D = new ObszarD(481, 180, 471, 50);
      //   P = new Pociag(10, 575);
    
    }


    public void paint(Graphics g) {
       super.paint(g); //Metoda rysowania
        g.setColor(k1);
        g.fillRect(0, 0, 640, 480);

        I.Tlo_menu(g);
        K1.rysuj(g);
        W1.rysuj(g);
        I.ETCS_1(g);
        I.pStaffRensponsible(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JButton();
        KoniecJazdy = new javax.swing.JButton();
        WidokDanych = new javax.swing.JButton();
        Spec = new javax.swing.JButton();
        Ustawienia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(3, 17, 34));
        setMaximumSize(new java.awt.Dimension(640, 480));
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);

        Menu.setBackground(new java.awt.Color(3, 17, 34));
        Menu.setForeground(new java.awt.Color(3, 17, 34));
        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kosut/Menu.jpg"))); // NOI18N
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        KoniecJazdy.setBackground(new java.awt.Color(3, 17, 34));
        KoniecJazdy.setForeground(new java.awt.Color(3, 17, 34));
        KoniecJazdy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kosut/koniecjazdy1.jpg"))); // NOI18N
        KoniecJazdy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KoniecJazdyActionPerformed(evt);
            }
        });

        WidokDanych.setBackground(new java.awt.Color(3, 17, 34));
        WidokDanych.setForeground(new java.awt.Color(3, 17, 34));
        WidokDanych.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kosut/widokdanych1.jpg"))); // NOI18N
        WidokDanych.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WidokDanychActionPerformed(evt);
            }
        });

        Spec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kosut/Spec1.jpg"))); // NOI18N
        Spec.setToolTipText("");
        Spec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecActionPerformed(evt);
            }
        });

        Ustawienia.setBackground(new java.awt.Color(3, 17, 34));
        Ustawienia.setForeground(new java.awt.Color(3, 17, 34));
        Ustawienia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kosut/Ustawienia1.jpg"))); // NOI18N
        Ustawienia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UstawieniaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(580, 580, 580)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ustawienia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(KoniecJazdy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(WidokDanych, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Spec, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(KoniecJazdy, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(WidokDanych, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Spec, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Ustawienia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
       // TODO add your handling code here:
        Menu m = new Menu();
        m.setVisible(true);
        System.out.println("Wybrano przycisk MENU");
    }//GEN-LAST:event_MenuActionPerformed

    private void KoniecJazdyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KoniecJazdyActionPerformed
        // TODO add your handling code here:
        KoniecJazdy k = new KoniecJazdy();
        k.setVisible(true);
        System.out.println("Wybrano przycisk KONIEC JAZDY");
    }//GEN-LAST:event_KoniecJazdyActionPerformed

    private void WidokDanychActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WidokDanychActionPerformed
        // TODO add your handling code here:
        WidokDanych wd = new WidokDanych();
        wd.setVisible(true);
        System.out.println("Wybrano przycisk WIDOK DANYCH");

    }//GEN-LAST:event_WidokDanychActionPerformed

    private void SpecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecActionPerformed
        // TODO add your handling code here:
        Spec s = new Spec();
        s.setVisible(true);
        System.out.println("Wybrano przycisk SPECJALNE");
    }//GEN-LAST:event_SpecActionPerformed

    private void UstawieniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UstawieniaActionPerformed
        // TODO add your handling code here:
        Ustawienia u = new Ustawienia();
        u.setVisible(true);
        System.out.println("Wybrano przycisk USTAWIENIA");
    }//GEN-LAST:event_UstawieniaActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KoniecJazdy;
    private javax.swing.JButton Menu;
    private javax.swing.JButton Spec;
    private javax.swing.JButton Ustawienia;
    private javax.swing.JButton WidokDanych;
    // End of variables declaration//GEN-END:variables

}

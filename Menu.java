/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kosut;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Menu extends javax.swing.JFrame {

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
    int wynik1;
    int wynik2;

    JPanel aktywnyPanel = null;
    int clicked = 1;
    int press = 1;
    int klik;

    public Menu() {
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

    public class Manewrowanie extends JPanel implements MouseListener {

        boolean CZYpShunting = false; // kliknięcie na ikonę pShunting

        public Manewrowanie() {
             setSize(640, 520);
            addMouseListener(this);
        }

        protected void paintComponent(Graphics g) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
            repaint();

            Font j = new Font("Dialog", Font.BOLD, 16);
            g.setFont(j);
            I.Tlo(g);
            I.pShunting(g);
            K1.rysuj(g);
            W1.rysuj(g);

            if (CZYpShunting == false) {
                I.pShunting(g);
                repaint();
            }

            if (CZYpShunting == true) {
                I.Shunting(g);
                g.setColor(k1);// zakrycie ikonki
                g.fillRect(165, 315, 58, 50);
                g.setColor(k9);
                g.drawRect(165, 315, 58, 50);
                repaint();
            }

            g.setColor(k2);
            if (clicked <= 199) {
                //wyświetlenie informacji na wskazówce
                g.setColor(k3);
                g.setFont(j);
                g.drawString("" + wynik, 180, 170);

                if (clicked < 40) {
                    g.setColor(k3);
                    g.setFont(j);
                    g.drawString("" + wynik, 180, 170);
                }

            } else if (clicked > 199) {
                g.setColor(k3);
                g.setFont(j);
                g.drawString("" + wynik1, 180, 170);
            }

            if (clicked >= 401) {
                g.setFont(j);
                g.drawString("401", 180, 170);
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {

            if (e.getX() > 165 && e.getX() < 165 + 58 && e.getY() > 315 && e.getY() < 315 + 50) {
                CZYpShunting = true;
                repaint();

            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new java.awt.Label();
        Start = new java.awt.Button();
        NumerMaszynisty = new java.awt.Button();
        DanePociągu = new java.awt.Button();
        button3 = new java.awt.Button();
        Poziom = new java.awt.Button();
        NumerPociągu = new java.awt.Button();
        TrybManewrowanie = new java.awt.Button();
        TrybPodrzędny = new java.awt.Button();
        Wyjście = new java.awt.Button();
        button1 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 500));
        setResizable(false);

        Menu.setBackground(new java.awt.Color(0, 0, 0));
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setText("Menu");

        Start.setActionCommand("Start");
        Start.setBackground(new java.awt.Color(3, 17, 34));
        Start.setForeground(new java.awt.Color(255, 255, 255));
        Start.setLabel("Start");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        NumerMaszynisty.setActionCommand("Numer maszynisty");
        NumerMaszynisty.setBackground(new java.awt.Color(3, 17, 34));
        NumerMaszynisty.setForeground(new java.awt.Color(255, 255, 255));
        NumerMaszynisty.setLabel("Numer maszynisty");
        NumerMaszynisty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumerMaszynistyActionPerformed(evt);
            }
        });

        DanePociągu.setActionCommand("Dane pociągu");
        DanePociągu.setBackground(new java.awt.Color(3, 17, 34));
        DanePociągu.setForeground(new java.awt.Color(255, 255, 255));
        DanePociągu.setLabel("Dane pociągu");
        DanePociągu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DanePociąguActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(3, 17, 34));
        button3.setEnabled(false);
        button3.setName(""); // NOI18N

        Poziom.setActionCommand("Poziom");
        Poziom.setBackground(new java.awt.Color(3, 17, 34));
        Poziom.setForeground(new java.awt.Color(255, 255, 255));
        Poziom.setLabel("Poziom");
        Poziom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoziomActionPerformed(evt);
            }
        });

        NumerPociągu.setActionCommand("Numer pociągu");
        NumerPociągu.setBackground(new java.awt.Color(3, 17, 34));
        NumerPociągu.setForeground(new java.awt.Color(255, 255, 255));
        NumerPociągu.setLabel("Numer pociągu");
        NumerPociągu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumerPociąguActionPerformed(evt);
            }
        });

        TrybManewrowanie.setActionCommand("Tryb Manewrowanie");
        TrybManewrowanie.setBackground(new java.awt.Color(3, 17, 34));
        TrybManewrowanie.setForeground(new java.awt.Color(255, 255, 255));
        TrybManewrowanie.setLabel("Tryb Manewrowanie");
        TrybManewrowanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrybManewrowanieActionPerformed(evt);
            }
        });
        TrybManewrowanie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TrybManewrowanieKeyPressed(evt);
            }
        });

        TrybPodrzędny.setActionCommand("Tryb Podrzędny");
        TrybPodrzędny.setBackground(new java.awt.Color(3, 17, 34));
        TrybPodrzędny.setForeground(new java.awt.Color(255, 255, 255));
        TrybPodrzędny.setLabel("Tryb Podrzędny");

        Wyjście.setBackground(new java.awt.Color(3, 17, 34));
        Wyjście.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Wyjście.setForeground(new java.awt.Color(255, 255, 255));
        Wyjście.setLabel("X");
        Wyjście.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WyjścieMouseClicked(evt);
            }
        });
        Wyjście.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WyjścieActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(3, 17, 34));
        button1.setForeground(new java.awt.Color(3, 17, 34));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        button1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                button1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Wyjście, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Poziom, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DanePociągu, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TrybManewrowanie, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TrybPodrzędny, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NumerMaszynisty, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NumerPociągu, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, 0))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NumerMaszynisty, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(DanePociągu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Poziom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumerPociągu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TrybManewrowanie, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TrybPodrzędny, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(Wyjście, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WyjścieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WyjścieMouseClicked

    }//GEN-LAST:event_WyjścieMouseClicked

    private void WyjścieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WyjścieActionPerformed

        //usuwanie poszczególnych przycisków
        Start.setVisible(false);
        Poziom.setVisible(false);
        NumerPociągu.setVisible(false);
        Menu.setVisible(false);
        NumerMaszynisty.setVisible(false);
        DanePociągu.setVisible(false);
        TrybPodrzędny.setVisible(false);
        Wyjście.setVisible(false);
        button3.setVisible(false);
        TrybManewrowanie.setVisible(false);

        //zamknięcie całego okna
        this.setVisible(false);

    }//GEN-LAST:event_WyjścieActionPerformed

    private void DanePociąguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DanePociąguActionPerformed
        // TODO add your handling code here:
        DanePociągu d = new DanePociągu();
        d.setVisible(true);
        System.out.println("Wybrano przycisk DANE POCIĄGU");

    }//GEN-LAST:event_DanePociąguActionPerformed

    private void NumerPociąguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumerPociąguActionPerformed
        // TODO add your handling code here:
        NumerPociągu n = new NumerPociągu();
        n.setVisible(true);
        System.out.println("Wybrano przycisk NUMER POCIĄGU");
    }//GEN-LAST:event_NumerPociąguActionPerformed

    private void PoziomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoziomActionPerformed
        // TODO add your handling code here:
        Poziom p = new Poziom();
        p.setVisible(true);
        System.out.println("Wybrano przycisk POZIOM");
    }//GEN-LAST:event_PoziomActionPerformed

    private void NumerMaszynistyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumerMaszynistyActionPerformed
        // TODO add your handling code here:
        NumerMaszynisty m = new NumerMaszynisty();
        m.setVisible(true);
        System.out.println("Wybrano przycick NUMER MASZYNISTY");
    }//GEN-LAST:event_NumerMaszynistyActionPerformed

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        // TODO add your handling code here:
        Start s = new Start();
        s.setVisible(true);
        System.out.println("Wybrano przyscisk START");
    }//GEN-LAST:event_StartActionPerformed

    private void TrybManewrowanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrybManewrowanieActionPerformed
        // TODO add your handling code here:
        Manewrowanie z = new Manewrowanie(); //utworzenie obiektu f klasy Figury
        add(z); //dodanie obiektu f klasy Figury do ramki
        aktywnyPanel = z;
        z.setBounds(0, 0, getWidth(), getHeight()); //położenie i rozmiary obiektu f na ramce
        setFocusable(true);
        Start.setVisible(false);
        Poziom.setVisible(false);
        NumerPociągu.setVisible(false);
        Menu.setVisible(false);
        NumerMaszynisty.setVisible(false);
        DanePociągu.setVisible(false);
        TrybPodrzędny.setVisible(false);
        Wyjście.setVisible(false);
        button3.setVisible(false);
        TrybManewrowanie.setVisible(false);
    }//GEN-LAST:event_TrybManewrowanieActionPerformed

    private void TrybManewrowanieKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TrybManewrowanieKeyPressed
        // TODO add your handling code here:
        int a = evt.getKeyCode();

        if (a == KeyEvent.VK_DOWN) {
            K1.obroc(-0.97);
        } // zmiana kata wychylenia o 0.97 dla 400
        // zmiana kata wychylenia o 1.16 dla 250
        // zmiana kąta wychylenia o 1.6 dla 180
        //zmiana kąta wychylenia o 2.05 dla 140

        if (a == KeyEvent.VK_UP) {
            K1.obroc(0.97);
        }

        if (a == KeyEvent.VK_UP) {
            wynik = clicked++;
            System.out.println(wynik);

            if (clicked > 199) {
                wynik1 = clicked;
                clicked++;
                System.out.println(wynik1);
            }
        } else if (a == KeyEvent.VK_DOWN) {
            wynik = clicked--;
            System.out.println(wynik - 2);

            if (clicked > 199) {
                wynik2 = clicked - 2;
                clicked--;
                System.out.println(wynik2);
            }
        }
    }//GEN-LAST:event_TrybManewrowanieKeyPressed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        Manewrowanie z = new Manewrowanie(); //utworzenie obiektu f klasy Figury
        add(z); //dodanie obiektu f klasy Figury do ramki
        aktywnyPanel = z;
        z.setBounds(0, 0, getWidth(), getHeight()); //położenie i rozmiary obiektu f na ramce
        setFocusable(true);
    }//GEN-LAST:event_button1ActionPerformed

    private void button1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_button1KeyPressed
        // TODO add your handling code here:
         int a = evt.getKeyCode();

        if (a == KeyEvent.VK_DOWN) {
            K1.obroc(-0.97);
        } // zmiana kata wychylenia o 0.97 dla 400
        // zmiana kata wychylenia o 1.16 dla 250
        // zmiana kąta wychylenia o 1.6 dla 180
        //zmiana kąta wychylenia o 2.05 dla 140

        if (a == KeyEvent.VK_UP) {
            K1.obroc(0.97);
        }

        if (a == KeyEvent.VK_UP) {
            wynik = clicked++;
            System.out.println(wynik);

            if (clicked > 199) {
                wynik1 = clicked;
                clicked++;
                System.out.println(wynik1);
            }
        } else if (a == KeyEvent.VK_DOWN) {
            wynik = clicked--;
            System.out.println(wynik - 2);

            if (clicked > 199) {
                wynik2 = clicked - 2;
                clicked--;
                System.out.println(wynik2);
            }
        }
    }//GEN-LAST:event_button1KeyPressed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button DanePociągu;
    private java.awt.Label Menu;
    private java.awt.Button NumerMaszynisty;
    private java.awt.Button NumerPociągu;
    private java.awt.Button Poziom;
    private java.awt.Button Start;
    private java.awt.Button TrybManewrowanie;
    private java.awt.Button TrybPodrzędny;
    private java.awt.Button Wyjście;
    private java.awt.Button button1;
    private java.awt.Button button3;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kosut;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;

/**
 *
 * @author User
 */
public class DanePociągu extends javax.swing.JFrame {

    public Color k1 = new Color(3, 17, 34); //kolor tła

    public DanePociągu() {
        initComponents();
        this.setSize(640, 480);
        this.setBackground(k1);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.

        g.setColor(k1);
        g.fillRect(0, 0, 650, 520);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        textField4 = new java.awt.TextField();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        textField5 = new java.awt.TextField();
        textField6 = new java.awt.TextField();
        textField7 = new java.awt.TextField();
        textField8 = new java.awt.TextField();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        button6 = new java.awt.Button();
        button7 = new java.awt.Button();
        button8 = new java.awt.Button();
        button9 = new java.awt.Button();
        button10 = new java.awt.Button();
        button11 = new java.awt.Button();
        button12 = new java.awt.Button();
        button13 = new java.awt.Button();
        label10 = new java.awt.Label();
        button14 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);

        label1.setAlignment(java.awt.Label.RIGHT);
        label1.setBackground(new java.awt.Color(0, 0, 0));
        label1.setForeground(new java.awt.Color(250, 250, 250));
        label1.setText("Dane pociągu");

        label2.setAlignment(java.awt.Label.RIGHT);
        label2.setBackground(new java.awt.Color(3, 17, 34));
        label2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label2.setForeground(new java.awt.Color(250, 250, 250));
        label2.setText("Długość (m)");

        label3.setAlignment(java.awt.Label.RIGHT);
        label3.setBackground(new java.awt.Color(3, 17, 34));
        label3.setForeground(new java.awt.Color(250, 250, 250));
        label3.setName(""); // NOI18N
        label3.setText("Procent hamulca");

        label4.setAlignment(java.awt.Label.RIGHT);
        label4.setBackground(new java.awt.Color(3, 17, 34));
        label4.setForeground(new java.awt.Color(250, 250, 250));
        label4.setText("Prędkość max. (km/h)");

        label5.setAlignment(java.awt.Label.RIGHT);
        label5.setBackground(new java.awt.Color(3, 17, 34));
        label5.setForeground(new java.awt.Color(250, 250, 250));
        label5.setText("Nacisk na oś (t)");

        textField1.setBackground(new java.awt.Color(3, 17, 34));
        textField1.setForeground(new java.awt.Color(250, 250, 250));

        textField2.setBackground(new java.awt.Color(3, 17, 34));
        textField2.setForeground(new java.awt.Color(250, 250, 250));

        textField3.setBackground(new java.awt.Color(3, 17, 34));
        textField3.setForeground(new java.awt.Color(250, 250, 250));

        textField4.setBackground(new java.awt.Color(3, 17, 34));
        textField4.setForeground(new java.awt.Color(250, 250, 250));

        label6.setAlignment(java.awt.Label.RIGHT);
        label6.setBackground(new java.awt.Color(85, 85, 85));
        label6.setForeground(new java.awt.Color(250, 250, 250));
        label6.setText("Długość (m)");

        label7.setAlignment(java.awt.Label.RIGHT);
        label7.setBackground(new java.awt.Color(85, 85, 85));
        label7.setForeground(new java.awt.Color(250, 250, 250));
        label7.setText("Procent hamulca");

        label8.setAlignment(java.awt.Label.RIGHT);
        label8.setBackground(new java.awt.Color(85, 85, 85));
        label8.setForeground(new java.awt.Color(250, 250, 250));
        label8.setText("Prędkość max.(km/h)");

        label9.setAlignment(java.awt.Label.RIGHT);
        label9.setBackground(new java.awt.Color(85, 85, 85));
        label9.setForeground(new java.awt.Color(250, 250, 250));
        label9.setText("Nacisk na os (t)");

        textField5.setBackground(new java.awt.Color(150, 150, 150));
        textField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                poleMaFocus(evt);
            }
        });

        textField6.setBackground(new java.awt.Color(150, 150, 150));
        textField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                poleMaFocus(evt);
            }
        });

        textField7.setBackground(new java.awt.Color(150, 150, 150));
        textField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                poleMaFocus(evt);
            }
        });

        textField8.setBackground(new java.awt.Color(150, 150, 150));
        textField8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                poleMaFocus(evt);
            }
        });

        button1.setBackground(new java.awt.Color(3, 17, 34));
        button1.setForeground(new java.awt.Color(250, 250, 250));
        button1.setLabel("1");
        button1.setName("1"); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(3, 17, 34));
        button2.setForeground(new java.awt.Color(250, 250, 250));
        button2.setLabel("2");
        button2.setName("2"); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(3, 17, 34));
        button3.setForeground(new java.awt.Color(250, 250, 250));
        button3.setLabel("3");
        button3.setName("3"); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(3, 17, 34));
        button4.setForeground(new java.awt.Color(250, 250, 250));
        button4.setLabel("4");
        button4.setMinimumSize(new java.awt.Dimension(4, 4));
        button4.setName("4"); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setBackground(new java.awt.Color(3, 17, 34));
        button5.setForeground(new java.awt.Color(250, 250, 250));
        button5.setLabel("5");
        button5.setName("5"); // NOI18N
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setBackground(new java.awt.Color(3, 17, 34));
        button6.setForeground(new java.awt.Color(250, 250, 250));
        button6.setLabel("6");
        button6.setName("6"); // NOI18N
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button7.setBackground(new java.awt.Color(3, 17, 34));
        button7.setForeground(new java.awt.Color(250, 250, 250));
        button7.setLabel("7");
        button7.setName("7"); // NOI18N
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setBackground(new java.awt.Color(3, 17, 34));
        button8.setForeground(new java.awt.Color(250, 250, 250));
        button8.setLabel("8");
        button8.setName("8"); // NOI18N
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setBackground(new java.awt.Color(3, 17, 34));
        button9.setForeground(new java.awt.Color(250, 250, 250));
        button9.setLabel("9");
        button9.setName("9"); // NOI18N
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        button10.setBackground(new java.awt.Color(3, 17, 34));
        button10.setForeground(new java.awt.Color(250, 250, 250));
        button10.setLabel("Usuń");
        button10.setName("Usuń"); // NOI18N
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });

        button11.setBackground(new java.awt.Color(3, 17, 34));
        button11.setForeground(new java.awt.Color(250, 250, 250));
        button11.setLabel(".");
        button11.setName("."); // NOI18N
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });

        button12.setBackground(new java.awt.Color(3, 17, 34));
        button12.setForeground(new java.awt.Color(250, 250, 250));
        button12.setLabel("0");
        button12.setName("0"); // NOI18N
        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12ActionPerformed(evt);
            }
        });

        button13.setBackground(new java.awt.Color(3, 17, 34));
        button13.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        button13.setForeground(new java.awt.Color(250, 250, 250));
        button13.setLabel("X");
        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button13ActionPerformed(evt);
            }
        });

        label10.setAlignment(java.awt.Label.CENTER);
        label10.setBackground(new java.awt.Color(3, 17, 34));
        label10.setForeground(new java.awt.Color(250, 250, 250));
        label10.setName("label10"); // NOI18N
        label10.setText("Czy kompletne uzupełnienie danyh pociągu?");

        button14.setBackground(new java.awt.Color(150, 150, 150));
        button14.setLabel("TAK");
        button14.setName("button14"); // NOI18N
        button14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(textField8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
TextField poleAktywne = null;
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        if (poleAktywne != null) {
            poleAktywne.setText(poleAktywne.getText() + "1");

            if (poleAktywne == textField5) {
                textField1.setText(textField1.getText() + "1");

            } else if (poleAktywne == textField6) {
                textField2.setText(textField2.getText() + "1");

            } else if (poleAktywne == textField7) {
                textField3.setText(textField3.getText() + "1");

            } else if (poleAktywne == textField8) {
                textField4.setText(textField4.getText() + "1");
            }

        }
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
         if (poleAktywne != null) {
            poleAktywne.setText(poleAktywne.getText() + "2");

            if (poleAktywne == textField5) {
                textField1.setText(textField1.getText() + "2");

            } else if (poleAktywne == textField6) {
                textField2.setText(textField2.getText() + "2");

            } else if (poleAktywne == textField7) {
                textField3.setText(textField3.getText() + "2");

            } else if (poleAktywne == textField8) {
                textField4.setText(textField4.getText() + "2");
            }

        }
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
         if (poleAktywne != null) {
            poleAktywne.setText(poleAktywne.getText() + "3");

            if (poleAktywne == textField5) {
                textField1.setText(textField1.getText() + "3");

            } else if (poleAktywne == textField6) {
                textField2.setText(textField2.getText() + "3");

            } else if (poleAktywne == textField7) {
                textField3.setText(textField3.getText() + "3");

            } else if (poleAktywne == textField8) {
                textField4.setText(textField4.getText() + "3");
            }

        }
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
         if (poleAktywne != null) {
            poleAktywne.setText(poleAktywne.getText() + "4");

            if (poleAktywne == textField5) {
                textField1.setText(textField1.getText() + "4");

            } else if (poleAktywne == textField6) {
                textField2.setText(textField2.getText() + "4");

            } else if (poleAktywne == textField7) {
                textField3.setText(textField3.getText() + "4");

            } else if (poleAktywne == textField8) {
                textField4.setText(textField4.getText() + "4");
            }

        }
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here: if (poleAktywne != null) {
            poleAktywne.setText(poleAktywne.getText() + "5");

            if (poleAktywne == textField5) {
                textField1.setText(textField1.getText() + "5");

            } else if (poleAktywne == textField6) {
                textField2.setText(textField2.getText() + "5");

            } else if (poleAktywne == textField7) {
                textField3.setText(textField3.getText() + "5");

            } else if (poleAktywne == textField8) {
                textField4.setText(textField4.getText() + "5");
            }

    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        // TODO add your handling code here:
         if (poleAktywne != null) {
            poleAktywne.setText(poleAktywne.getText() + "6");

            if (poleAktywne == textField5) {
                textField1.setText(textField1.getText() + "6");

            } else if (poleAktywne == textField6) {
                textField2.setText(textField2.getText() + "6");

            } else if (poleAktywne == textField7) {
                textField3.setText(textField3.getText() + "6");

            } else if (poleAktywne == textField8) {
                textField4.setText(textField4.getText() + "6");
            }
         }
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        // TODO add your handling code here:
        if (poleAktywne != null) {
            poleAktywne.setText(poleAktywne.getText() + "7");

            if (poleAktywne == textField5) {
                textField1.setText(textField1.getText() + "7");

            } else if (poleAktywne == textField6) {
                textField2.setText(textField2.getText() + "7");

            } else if (poleAktywne == textField7) {
                textField3.setText(textField3.getText() + "7");

            } else if (poleAktywne == textField8) {
                textField4.setText(textField4.getText() + "7");
            }
         }
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        // TODO add your handling code here:
        if (poleAktywne != null) {
            poleAktywne.setText(poleAktywne.getText() + "8");

            if (poleAktywne == textField5) {
                textField1.setText(textField1.getText() + "8");

            } else if (poleAktywne == textField6) {
                textField2.setText(textField2.getText() + "8");

            } else if (poleAktywne == textField7) {
                textField3.setText(textField3.getText() + "8");

            } else if (poleAktywne == textField8) {
                textField4.setText(textField4.getText() + "8");
            }
         }
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        // TODO add your handling code here:
        if (poleAktywne != null) {
            poleAktywne.setText(poleAktywne.getText() + "9");

            if (poleAktywne == textField5) {
                textField1.setText(textField1.getText() + "9");

            } else if (poleAktywne == textField6) {
                textField2.setText(textField2.getText() + "9");

            } else if (poleAktywne == textField7) {
                textField3.setText(textField3.getText() + "9");

            } else if (poleAktywne == textField8) {
                textField4.setText(textField4.getText() + "9");
            }
         }
    }//GEN-LAST:event_button9ActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        // TODO add your handling code here:
        if (poleAktywne != null) {
            poleAktywne.setText(null);
        
            if (poleAktywne == textField5) {
               textField1.setText(null);

            } else if (poleAktywne == textField6) {
                textField2.setText(null);

            } else if (poleAktywne == textField7) {
                textField3.setText(null);

            } else if (poleAktywne == textField8) {
                textField4.setText(null);
            }

        }
        
    }//GEN-LAST:event_button10ActionPerformed

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        // TODO add your handling code here:
        if (poleAktywne != null) {
            poleAktywne.setText(poleAktywne.getText() + ".");

            if (poleAktywne == textField5) {
                textField1.setText(textField1.getText() + ".");

            } else if (poleAktywne == textField6) {
                textField2.setText(textField2.getText() + ".");

            } else if (poleAktywne == textField7) {
                textField3.setText(textField3.getText() + ".");

            } else if (poleAktywne == textField8) {
                textField4.setText(textField4.getText() + ".");
            }
         }
    }//GEN-LAST:event_button11ActionPerformed

    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button12ActionPerformed
        // TODO add your handling code here:
        if (poleAktywne != null) {
            poleAktywne.setText(poleAktywne.getText() + "0");

            if (poleAktywne == textField5) {
                textField1.setText(textField1.getText() + "0");

            } else if (poleAktywne == textField6) {
                textField2.setText(textField2.getText() + "0");

            } else if (poleAktywne == textField7) {
                textField3.setText(textField3.getText() + "0");

            } else if (poleAktywne == textField8) {
                textField4.setText(textField4.getText() + "0");
            }
         }
    }//GEN-LAST:event_button12ActionPerformed

    private void button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button13ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_button13ActionPerformed

    private void poleMaFocus(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_poleMaFocus
        // TODO add your handling code here:
        poleAktywne = (TextField) evt.getSource();
    }//GEN-LAST:event_poleMaFocus

    private void button14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button14ActionPerformed
        // TODO add your handling code here:
            if (textField5 == null && textField6 == null && textField7 == null && textField8 == null) {
            this.setVisible(true);
        }

      else  if (textField5 != null && textField6 != null && textField7 != null && textField8 != null) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_button14ActionPerformed

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
            java.util.logging.Logger.getLogger(DanePociągu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanePociągu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanePociągu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanePociągu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanePociągu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button10;
    private java.awt.Button button11;
    private java.awt.Button button12;
    private java.awt.Button button13;
    private java.awt.Button button14;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private java.awt.Button button8;
    private java.awt.Button button9;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField6;
    private java.awt.TextField textField7;
    private java.awt.TextField textField8;
    // End of variables declaration//GEN-END:variables
}

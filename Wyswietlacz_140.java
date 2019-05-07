/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kosut;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class Wyswietlacz_140 extends JFrame {
     Color k2 = new Color(255, 255, 255); // biały
 Font j = new Font("Dialog", Font.BOLD, 16);
      
void rysuj(Graphics g){
        
    // g.setColor(Color.pink);
    // g.drawArc(69,40, 250, 250,306,288);
     
     g.setColor(k2);
     g.setFont(j);
     
     //0
     g.drawLine(120,267,135,246);
     g.drawString("0", 135, 244);
     
     //10
     g.drawLine(89,234,102,225);
     
     //20
     g.drawLine(72,192, 97, 187);
     g.drawString("20", 100, 191);
     
     //30
     g.drawLine(71,147,86,149);
     
     //40
     g.drawLine(86,104,107,116);
     g.drawString("40", 108, 126);
     
     //50
     g.drawLine(114,70,124,81);
     
     //60
     g.drawLine(154,47,162,72);
     g.drawString("60", 156, 87);
     
     //70
     g.drawLine(194,40,194,55);
     
     //80
     g.drawLine(236, 46, 228, 71);
     g.drawString("80",218, 87);
     
     //90
     g.drawLine(275,69,265,81);
     
     //100
     g.drawLine(304, 104, 281, 116);
     g.drawString("100", 253,129);
     
     //110
     g.drawLine(318,147, 303, 148);
     
     //120
     g.drawLine(316,191,292,186);
     g.drawString("120", 263, 190);
     
     //130
     g.drawLine(298,232,285,225);
     
     //140
     g.drawLine(267,266,252,245);
     g.drawString("140", 230, 244);
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kosut;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author User
 */
public class Wyswietlacz_180 extends JApplet {
       Color k2 = new Color(255, 255, 255); // biały
     Font j = new Font("Dialog", Font.BOLD, 16);
     
void rysuj(Graphics g){
        
     //g.setColor(Color.pink);
     //g.drawArc(69,40, 250, 250,306,288);
     
     g.setColor(k2);
     g.setFont(j);
     
     //0
     g.drawLine(120,266,135,247);
     g.drawString("0", 135, 244);
     
     //10
     g.drawLine(96,243,108,233);
     
     //20
     g.drawLine(79,214,102,204);
     g.drawString("20", 104,206);
     
     //30
     g.drawLine(73,180,88,178);
     
     //40
     g.drawLine(73,146,95,149);
     g.drawString("40",98,155);
     
     //50
     g.drawLine(82,113,96,119);
     
     //60
     g.drawLine(100,84,120,100);
     g.drawString("60",124,110);
     
     //70
     g.drawLine(125,61,134,73);
     
     //80
     g.drawLine(158,45,164,69);
     g.drawString("80", 158, 83);
     
     //90
     g.drawLine(194,40,194,55);
     
     //100
     g.drawLine(227,44,220,69);
     g.drawString("100", 204,83);
     
     //110
     g.drawLine(258,57,249,70);
     
     //120
     g.drawLine(285,79,267,96);
     g.drawString("120", 247, 112);
     
     //130
     g.drawLine(306,108,292,114);
     
     //140
     g.drawLine(316,142,292,147);
     g.drawString("140", 262,155);
     
     //150
     g.drawLine(318,177,303,175);
     
     //160
     g.drawLine(310,211,287,202);
     g.drawString("160", 258,204);
     
     //170
     g.drawLine(293,241,282,232);
     
     //180
     g.drawLine(267,266,252,246);
     g.drawString("180",228,242);
   
}
}

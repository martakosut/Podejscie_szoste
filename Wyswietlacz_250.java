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
public class Wyswietlacz_250 extends JApplet {
    
     Color k2 = new Color(255, 255, 255); // biały
     Font j = new Font("Dialog", Font.BOLD, 16);
    
      void rysuj(Graphics g){
      
         //g.setColor(Color.pink);
       //  g.drawArc(69,40, 250, 250,306,288);
        
     g.setColor(k2);
     g.setFont(j);
     
     //0
     g.drawLine(120,267,135,245);
     g.drawString("0",135,244);
   
     
     //10
     g.drawLine(102,249,113,239);
     
     //20
     g.drawLine(87,229,113,216);
     g.drawString("20", 115, 217);
     
     //30
     g.drawLine(76,206,90,201);
     
     //40
     g.drawLine(71,182,96,179);
     g.drawString("40", 98, 182);
     
     //50
     g.drawLine(70, 155, 90, 157);
     
     //60
     g.drawLine(74,130,99,137);
     g.drawString("60",102,144);
     
     //70
     g.drawLine( 84, 107, 98, 114);
     
     //80
     g.drawLine(98, 86, 117, 101);
     g.drawString("80", 120, 110);
     
     //90
     g.drawLine(116,68,126,80);
     
     //100
     g.drawLine(137,54,149,71);
     g.drawString("100",140,86);
     
     //110
     g.drawLine(161,45, 165, 60);
     
     //120
     g.drawLine(186,41,188,66);
     g.drawString("120",176,81);
     
     //130
     g.drawLine(212,41,210,56);
     
     //140
     g.drawLine(236,47,228,70);
     g.drawString("140", 214,84);
     
     //150
     g.drawLine(258,57,250,70);
     
     //160
     g.drawLine(278,72, 261,91);
     g.drawString("160", 242, 106);
     
     //170
     g.drawLine(295,90,283,99);
     
     //180
     g.drawLine(307,112,285,122);
     g.drawString("180",258,130);
     
     //190
     g.drawLine(315,135,301,139);
     
     //200
     g.drawLine(318,160,294,161);
     g.drawString("200",267,165);
     
     //210
     g.drawLine(317, 184, 303, 182);
     
     //220
     g.drawLine(311,208,287,199);
     g.drawString("220",260,200);
     
     //230
     g.drawLine(300, 230, 287, 222);
     
     //240
     g.drawLine(285,250,268,232);
     g.drawString("240", 243, 230);
    
      //250
     g.setColor(Color.white);
     g.drawLine(267,267,258,254); 
    
      
      
      
      }

}

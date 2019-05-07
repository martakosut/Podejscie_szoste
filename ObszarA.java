
package Kosut;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


public class ObszarA {
     Color k6 = new Color(195, 195, 195); // szary
 Font j = new Font("Dialog", Font.BOLD, 16);
 
 int x1, x2, x3,x4;
 int clicked = 1;

 
 public  ObszarA (int x1,int x2, int x3, int x4){
     this.x1 = x1;//30  x
     this.x2 = x2;//99  y
     this.x3 = x3;//8   w
     this.x4 = x4;//187 h
 
     
 } 
 public void slupek (Graphics g){
 g.setColor(k6);
 g.fillRect(30, x2, 8, x4);
 

 
 }  
 
 public void przesun (int t){
 x2 += t;
 x4 += -t;
 
 }
 

    void rysuj(Graphics g){
    g.setColor(k6);
   
    g.drawLine(10,100,23,100);//1000
    g.drawLine(10,101,23,101);
      
    g.drawLine(14,105,23,105); //900
    
    g.drawLine(14,112,23,112);//800
    
    g.drawLine(14,121,23,121);//700
    
    g.drawLine(14,131,23,131);//600
    
    g.drawLine(10,144,23,144);//500
    g.drawLine(10,145,23,145);
    
    g.drawLine(14,158,23,158);//400
    
    g.drawLine(14,178,23,178);//300
    
    g.drawLine(14,204,23,204);//200
    
    g.drawLine(14,251,23,251);//100
    
    g.drawLine(10,284,23,284);//0
    g.drawLine(10,285,23,285);
    
    // powyżej odległosci 1000 m słupek jest długi
     }
    
    void r_1001 (Graphics g) {
    g.setColor(k6);
    g.fillRect(x1, x2, x3, x4);
    }
    
    void r_1000 (Graphics g){ //100
    g.setColor(k6);
    g.fillRect(x1,x2, x3, x4);
    g.setFont(j);
    g.drawString("1000",20 ,89 );
    }
    
    void r_990 (Graphics g){ 
    g.setColor(k6);
    g.fillRect(x1, x2+((1/10)*5), x3, x4-((1/10)*5));
    g.setFont(j);
    g.drawString("990",20 ,89 );
    }
    
    void r_980 (Graphics g){
    g.setColor(k6);
    g.fillRect(x1, x2+1, x3, x4-1);
    g.setFont(j);
    g.drawString("980",20 ,89 );
    }
    
    void r_970 (Graphics g){
    g.setColor(k6);
    g.fillRect(x1, x2+((3/10)*5), x3, x4-((3/10)*5));
    g.setFont(j);
    g.drawString("970",20 ,89 );
    }
    
    void r_960 (Graphics g){
    g.setColor(k6);
    g.fillRect(x1, x2+2, x3, x4-2);
    g.setFont(j);
    g.drawString("960",20 ,89 );
    }
    void r_950 (Graphics g){
    g.setColor(k6);
    g.fillRect(x1, x2+((5/10)*5), x3, x4-((5/10)*5));
    g.setFont(j);
    g.drawString("950",20 ,89 );
    }
    void r_940 (Graphics g){
    g.setColor(k6);
    g.fillRect(x1, x2+3, x3, x4-3);
    g.setFont(j);
    g.drawString("940",20 ,89 );
    }
    void r_930 (Graphics g){
    g.setColor(k6);
    g.fillRect(x1, x2+((7/10)*5), x3, x4-((7/10)*5));
    g.setFont(j);
    g.drawString("930",20 ,89 );
    }
    void r_920 (Graphics g){
    g.setColor(k6);
    g.fillRect(x1, x2+4, x3, x4-4);
    g.setFont(j);
    g.drawString("920",20 ,89 );
    }
    void r_910 (Graphics g){
    g.setColor(k6);
    g.fillRect(x1, x2+((9/10)*5), x3, x4-((9/10)*5));
    g.setFont(j);
    g.drawString("910",20 ,89 );
    }
    
    
    void r_900 (Graphics g){//105
    g.setColor(k6);
    g.fillRect(x1, x2+5, x3, x4-5);
    g.setFont(j);
    g.drawString("900",20 ,89 );
    }
    
   void r_890 (Graphics g){ 
    g.setColor(k6);
    g.fillRect(x1, x2+5+((1/10)*12), x3, x4-5-((1/10)*12));
    g.setFont(j);
    g.drawString("890",20 ,89 );
    }
    
    void r_880 (Graphics g){
    g.setColor(k6);
    g.fillRect(x1, x2+6+((2/10)*12), x3, x4-5-((2/10)*12));
    g.setFont(j);
    g.drawString("880",20 ,89 );
    }
    
    void r_870 (Graphics g){
    g.setColor(k6);
    g.fillRect(x1, x2+5+((3/10)*12), x3, x4-5-((3/10)*12));
    g.setFont(j);
    g.drawString("870",20 ,89 );
    }
    
    void r_860 (Graphics g){
    g.setColor(k6);
    g.fillRect(x1,x2+13+((4/10)*12), x3, x4-13-((4/10)*12));
    g.setFont(j);
    g.drawString("860",20 ,89 );
    }
    void r_850 (Graphics g){
    g.setColor(k6);
    g.fillRect(x1, x2+13+((5/10)*12), x3,x4-13-((5/10)*12));
    g.setFont(j);
    g.drawString("850",20 ,89 );
    }
    void r_840 (Graphics g){
    g.setColor(k6);
    g.fillRect(x1, x2+13+((6/10)*12), x3, x4-13-((6/10)*12));
    g.setFont(j);
    g.drawString("840",20 ,89 );
    }
    void r_830 (Graphics g){
    g.setColor(k6);
    g.fillRect(x1,x2+13+((7/10)*12), x3, x4-13-((7/10)*12));
    g.setFont(j);
    g.drawString("830",20 ,89 );
    }
    void r_820 (Graphics g){
    g.setColor(k6);
    g.fillRect(x1, x2+13+((8/10)*12), x3, x4-13-((8/10)*12));
    g.setFont(j);
    g.drawString("820",20 ,89 );
    }
    void r_810 (Graphics g){
    g.setColor(k6);
    g.fillRect(x1, x2+13+((9/10)*12), x3, x4-13-((9/10)*12));
    g.setFont(j);
    g.drawString("810",20 ,89 );
    }
    void r_800 (Graphics g){//105
    g.setColor(k6);
    g.fillRect(x1, x2+13, x3, x4-13);
    g.setFont(j);
    g.drawString("800",20 ,89 );
    }
    void r_700 (Graphics g){//105
    g.setColor(k6);
    g.fillRect(x1, x2+22, x3, x4-22);
    g.setFont(j);
    g.drawString("700",20 ,89 );
    
    }
    void r_600 (Graphics g){//105
    g.setColor(k6);
    g.fillRect(x1, x2+32, x3, x4-32);
    g.setFont(j);
    g.drawString("600",20 ,89 );
    
    }
    
    void r_500 (Graphics g){//105
    g.setColor(k6);
    g.fillRect(x1, x2+46, x3, x4-46);
    g.setFont(j);
    g.drawString("500",20 ,89 );
    }
     void r_400 (Graphics g){//105
    g.setColor(k6);
    g.fillRect(x1, x2+59, x3, x4-59);
    g.setFont(j);
    g.drawString("400",20 ,89 );
    }
      void r_300 (Graphics g){//105
    g.setColor(k6);
    g.fillRect(x1, x2+79, x3, x4-79);
    g.setFont(j);
    g.drawString("300",20 ,89 );
    }
      void r_200 (Graphics g){//105
    g.setColor(k6);
    g.fillRect(x1, x2+105, x3, x4-105);
    g.setFont(j);
    g.drawString("200",20 ,89 );
    }
     
      
       void r_100 (Graphics g){//152
    g.setColor(k6);
    g.fillRect(x1, x2+152, x3, x4-152);
    g.setFont(j);
    g.drawString("100",20 ,89 );
    }
       
        void r_0 (Graphics g){//152
    g.setColor(k6);
    g.fillRect(x1, x2+185, x3, x4-185);
    g.setFont(j);
    g.drawString("0",20 ,89 );
    }
  //dorydować warości pośrednie
}

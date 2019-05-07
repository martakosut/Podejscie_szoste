

package Kosut;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


public class ObszarD {
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

    Font jx = new Font("Dialog", Font.BOLD, 12);

    int x1, y1; // współrzędne żółtej linii
    int a1, a2; // współrzedne strzałki dół

    public ObszarD(int x1, int y1, int a1, int a2) {
        this.x1 = x1;
        this.y1 = y1;
        this.a1 = a1;//471
        this.a2 = a2;

    }

    public void marker(Graphics g) { // żółta linia
        g.setColor(k10);
        g.fillRect(x1, y1, 93, 2);
    }

    public void Strzalkadol(Graphics g) { // żółta linia
        g.setColor(k6);
        g.fillRect(a1, a2, 20, 2);

        int[] aa1 = {a1 + 10, a1 + 20, a1 + 15};
        int[] aa2 = {a2 + 2, a2 + 2, a2 + 10};
        g.fillPolygon(aa1, aa2, 3);
    }

    public void przesun(int z) { // przesuniecie żółtej linii
        y1 += z;
        a2 += z;
    }

    public void linie(Graphics g) {
        g.setColor(k7);
        g.fillRect(374, 300, 200, 2);
        g.setColor(k8);
        g.fillRect(374, 267, 200, 1);
        g.fillRect(374, 223, 200, 1);
        g.fillRect(374, 198, 200, 1);
        g.fillRect(374, 180, 200, 1);
        g.setColor(k7);
        g.fillRect(374, 167, 200, 2);
        g.setColor(k8);
        g.fillRect(374, 123, 200, 1);
        g.fillRect(374, 80, 200, 1);
        g.setColor(k7);
        g.fillRect(374, 38, 200, 2);

        drowPlus(g);
        drowMinus(g);

        g.fillRect(554, 17, 12, 12);
        g.setColor(k1);
        g.fillRect(555, 18, 10, 10);
    }

    public void drowPlus(Graphics g) {
        g.setColor(k2);//znak plus
        g.fillRect(353, 303, 2, 12);
        g.fillRect(348, 308, 12, 2);
    }

    public void drowMinus(Graphics g) {
        g.setColor(k2);//
        g.fillRect(348, 23, 12, 2);//znak minus
    }

    public void odleglosc1(Graphics g) { // 0-1000
        int valueOfDistance = 1000;
        g.setColor(k7);
        g.setFont(jx);
        g.drawString(String.valueOf(valueOfDistance), 345, 42);
        g.drawString(String.valueOf(valueOfDistance / 2), 350, 84);
        g.drawString(String.valueOf(valueOfDistance / 4), 350, 127);
        g.drawString(String.valueOf(valueOfDistance / 8), 350, 171);
        //  g.drawString("100",350, 184);  
        //  g.drawString("75",355, 202);
        //  g.drawString("50",355, 227);
        //  g.drawString("25",355,271);
        g.drawString("0", 365, 304);
    }

    public void odleglosc2(Graphics g) { // 0-2000
        int valueOfDistance = 2000;
        g.setColor(k7);
        g.setFont(jx);
        g.drawString(String.valueOf(valueOfDistance), 345, 42);
        g.drawString(String.valueOf(valueOfDistance / 2), 350, 84);
        g.drawString(String.valueOf(valueOfDistance / 4), 350, 127);
        g.drawString(String.valueOf(valueOfDistance / 8), 350, 171);
        //  g.drawString("200",350, 184);  
        //  g.drawString("150",350, 202);
        //  g.drawString("100",350, 227);
        //  g.drawString("50",355,271);
        g.drawString("0", 365, 304);
    }

    public void odleglosc3(Graphics g) { // 0-4000
        g.setColor(k7);
        g.setFont(jx);
        g.drawString("4000", 342, 42);
        g.drawString("2000", 342, 84);
        g.drawString("1000", 342, 127);
        g.drawString("500", 350, 171);
        //  g.drawString("400",350, 184);  
        //  g.drawString("300",350, 202);
        //  g.drawString("200",350, 227);
        //  g.drawString("100",350,271);
        g.drawString("0", 365, 304);
    }

    public void odleglosc4(Graphics g) { // 0-8000
        g.setColor(k7);
        g.setFont(jx);
        g.drawString("8000", 342, 42);
        g.drawString("4000", 342, 84);
        g.drawString("2000", 342, 127);
        g.drawString("1000", 342, 171);
        //  g.drawString("800",350, 184);  
        //  g.drawString("600",350, 202);
        //  g.drawString("400",350, 227);
        //  g.drawString("200",350,271);
        g.drawString("0", 365, 304);
    }

    public void odleglosc5(Graphics g) { //0-16000
        g.setColor(k7);
        g.setFont(jx);
        g.drawString("16000", 337, 42);
        g.drawString("8000", 342, 84);
        g.drawString("4000", 342, 127);
        g.drawString("2000", 342, 171);
        //  g.drawString("1600",342, 184);  
        //  g.drawString("1200",342, 202);
        //  g.drawString("800",350, 227);
        //  g.drawString("400",350,271);
        g.drawString("0", 365, 304);
    }

    public void odleglosc6(Graphics g) {// 0-32000
        g.setColor(k7);
        g.setFont(jx);
        g.drawString("32000", 337, 42);
        g.drawString("16000", 337, 84);
        g.drawString("8000", 342, 127);
        g.drawString("4000", 342, 171);
        //  g.drawString("3200",342, 184);  
        //  g.drawString("2400",342, 202);
        //  g.drawString("1600",342, 227);
        //  g.drawString("800",350,271);
        g.drawString("0", 365, 304);
    }

    //obszar D5 zależny jest od uwarunkowania terenu
    public void obszarD5(Graphics g) { // pionowy pasek uwarunkowania pochylenia terenu
        g.setColor(k6);
        g.fillRect(449, 30, 18, 279);
        g.setColor(k3);
        g.drawString("0", 455, 160);
    }

    public void ObszarD7(Graphics g) { // granatowe paski predkosci
        g.setColor(k5);
        g.fillRect(481, 30, 93, 270);
        g.setColor(k4);
        g.fillRect(481, 30, 93, 70);
    }
 
}

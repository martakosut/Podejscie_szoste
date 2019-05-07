
package Kosut;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;


public class Ikony  extends JFrame implements ActionListener{

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
    Font ij = new Font("Dialog", Font.BOLD, 14);
    Timer zegarRamki;

    public Ikony() {
        zegarRamki = new Timer(500, this);
        zegarRamki.start();
    }

    public void Tlo(Graphics g) {
        //kolor tła
        g.setColor(k1);
        g.drawRect(0, 0, 640, 480); // ramka prostokąta
        g.fillRect(0, 0, 640, 480); // wypełniony prostokąt    

        // linie pomocicze
        g.setColor(k9);
        g.drawLine(0, 15, 334, 15);
        g.drawLine(54, 15, 54, 465);
        g.drawLine(334, 15, 334, 15);
        g.drawLine(0, 69, 54, 69);
        g.drawLine(0, 315, 334, 315);
        g.drawLine(0, 365, 334, 365);
        g.drawLine(0, 465, 334, 465);
        g.drawLine(334, 15, 334, 465);
        g.drawLine(0, 290, 54, 290);
        g.drawLine(0, 390, 54, 390);
        g.drawLine(0, 415, 54, 415);
        g.drawLine(0, 440, 54, 440);

        g.drawRect(165, 315, 58, 50);

        g.drawRect(137, 270, 36, 36);
        g.drawRect(173, 270, 36, 36);
        g.drawRect(209, 270, 36, 36);

        g.drawRect(63, 270, 36, 36);
        g.drawRect(289, 270, 36, 36);

        g.drawLine(289, 365, 289, 465);
        g.drawLine(289, 415, 334, 415);

        g.setColor(k8);
        int[] c1 = {295, 328, 311};
        int[] c2 = {405, 405, 375};
        g.fillPolygon(c1, c2, 3);
        int[] c3 = {295, 328, 311};
        int[] c4 = {425, 425, 455};
        g.fillPolygon(c3, c4, 3);

    }

    public void Tlo_menu(Graphics g) {
        //kolor tła
        g.setColor(k1);
        g.drawRect(0, 0, 640, 480); // ramka prostokąta
        g.fillRect(0, 0, 640, 480); // wypełniony prostokąt    

        // linie pomocicze
        g.setColor(k9);
        g.drawLine(0, 15, 580, 15);
        g.drawLine(54, 15, 54, 465);
        g.drawLine(334, 15, 334, 15);
        g.drawLine(0, 69, 54, 69);
        g.drawLine(0, 315, 580, 315);
        g.drawLine(0, 365, 334, 365);
        g.drawLine(0, 465, 334, 465);
        g.drawLine(334, 15, 334, 465);
        g.drawLine(0, 290, 54, 290);
        g.drawLine(0, 390, 54, 390);
        g.drawLine(0, 415, 54, 415);
        g.drawLine(0, 440, 54, 440);

        g.drawRect(165, 315, 58, 50);

        g.drawRect(137, 270, 36, 36);
        g.drawRect(173, 270, 36, 36);
        g.drawRect(209, 270, 36, 36);

        g.drawRect(63, 270, 36, 36);
        g.drawRect(289, 270, 36, 36);

        g.drawLine(289, 365, 289, 465);
        g.drawLine(289, 415, 334, 415);

        g.setColor(k8);
        int[] c1 = {295, 328, 311};
        int[] c2 = {405, 405, 375};
        g.fillPolygon(c1, c2, 3);
        int[] c3 = {295, 328, 311};
        int[] c4 = {425, 425, 455};
        g.fillPolygon(c3, c4, 3);
        
        g.setColor(k9);
        g.drawLine(580,30,580,315);
        g.drawLine(580,40,640,40);
        g.drawLine(580,290,640,290);

    }

    public void ETCS_0(Graphics g) {
        g.setColor(k6); // symbol 0 ETCS 
        g.drawRect(1, 328, 52, 10);
        Font jj = new Font("Dialog", Font.BOLD, 12);
        g.setFont(jj);
        g.drawString("0", 25, 327);
        // g.drawLine(0,340,54,340);
    }

    protected void zs_ETCS0(Graphics g) { //zapowedź szara poziomu 0

        g.setColor(k6);
        int[] x1 = {168, 188, 188, 194, 188, 188, 168, 168};
        int[] y1 = {330, 330, 326, 332, 338, 334, 334, 330};
        g.fillPolygon(x1, y1, 8);
        g.drawRect(168, 340, 52, 10);
        g.drawString("0", 208, 338);
    }

    public void zz_ETCS0(Graphics g) { //zapowedź żółty poziomu 0
        g.setColor(k10);
        int[] x1 = {168, 188, 188, 194, 188, 188, 168, 168};
        int[] y1 = {330, 330, 326, 332, 338, 334, 334, 330};
        g.fillPolygon(x1, y1, 8);
        g.drawRect(168, 340, 52, 10);
        g.drawString("0", 208, 338);
        
          // ramka zwn.
        if (kolor % 2 == 0) {
            g.setColor(k1);
        } else {
            g.setColor(k10);
        }
        g.drawRect(165, 315, 58, 50);
    }

    public void ETCS_1(Graphics g) {
        g.setColor(k6); // symbol 1 transmisja przerywana poziomu ETCS
        Font jj = new Font("Dialog", Font.BOLD, 12);
        g.setFont(jj);
        g.fillRect(1, 328, 10, 10);
        g.fillRect(15, 328, 10, 10);
        g.fillRect(29, 328, 10, 10);
        g.fillRect(43, 328, 10, 10);
        g.drawString("1", 25, 327);
        //g.drawLine(0,340,54,340);

    }

    public void zs_ETCS1(Graphics g) { //zapowedź szara poziomu 1
        g.setColor(k6);
        int[] x1 = {168, 188, 188, 194, 188, 188, 168, 168};
        int[] y1 = {330, 330, 326, 332, 338, 334, 334, 330};
        g.fillPolygon(x1, y1, 8);
        g.fillRect(168, 340, 7, 7);
        g.fillRect(177, 340, 7, 7);
        g.fillRect(186, 340, 7, 7);
        g.fillRect(195, 340, 7, 7);
        g.fillRect(204, 340, 7, 7);
        g.fillRect(213, 340, 7, 7);
        g.drawString("1", 208, 338);
    }

    public void zz_ETCS1(Graphics g) { //zapowiedź żółty poziomu 1
        g.setColor(k10);
        int[] x1 = {168, 188, 188, 194, 188, 188, 168, 168};
        int[] y1 = {330, 330, 326, 332, 338, 334, 334, 330};
        g.fillPolygon(x1, y1, 8);
        g.fillPolygon(x1, y1, 8);
        g.fillRect(168, 340, 7, 7);
        g.fillRect(177, 340, 7, 7);
        g.fillRect(186, 340, 7, 7);
        g.fillRect(195, 340, 7, 7);
        g.fillRect(204, 340, 7, 7);
        g.fillRect(213, 340, 7, 7);
        g.drawString("1", 208, 338);
        
          // ramka zwn.
        if (kolor % 2 == 0) {
            g.setColor(k1);
        } else {
            g.setColor(k10);
        }
        g.drawRect(165, 315, 58, 50);
    }

    public void ETCS_2(Graphics g) {
        g.setColor(k6); // symbol 2 transmisja ciągła poziomu ETCS
        Font jj = new Font("Dialog", Font.BOLD, 12);
        g.setFont(jj);
        g.fillRect(1, 328, 52, 10);
        g.drawString("2", 25, 327);
    }

    public void zs_ETCS2(Graphics g) { //zapowedź szara poziomu 2
        g.setColor(k6);
        int[] x1 = {168, 188, 188, 194, 188, 188, 168, 168};
        int[] y1 = {330, 330, 326, 332, 338, 334, 334, 330};
        g.fillPolygon(x1, y1, 8);
        g.fillRect(168, 340, 52, 10);
        g.drawString("2", 208, 338);
    }

    public void zz_ETCS2(Graphics g) { //zapowedź żółty poziomu 2
        g.setColor(k10);
        int[] x1 = {168, 188, 188, 194, 188, 188, 168, 168};
        int[] y1 = {330, 330, 326, 332, 338, 334, 334, 330};
        g.fillPolygon(x1, y1, 8);
        g.fillRect(168, 340, 52, 10);
        g.drawString("2", 208, 338);
        
          // ramka zwn.
        if (kolor % 2 == 0) {
            g.setColor(k1);
        } else {
            g.setColor(k10);
        }
        g.drawRect(165, 315, 58, 50);
    }

    public void ETCS_3(Graphics g) {
        g.setColor(k6); // symbol 3 transmisja ciągła poziomu ETCS
        Font jj = new Font("Dialog", Font.BOLD, 12);
        g.setFont(jj);
        g.fillRect(1, 328, 52, 10);
        g.drawString("3", 25, 327);
    }

    public void zs_ETCS3(Graphics g) { //zapowedź szara poziomu 3
        g.setColor(k6);
        int[] x1 = {168, 188, 188, 194, 188, 188, 168, 168};
        int[] y1 = {330, 330, 326, 332, 338, 334, 334, 330};
        g.fillPolygon(x1, y1, 8);
        g.fillRect(168, 340, 52, 10);
        g.drawString("3", 208, 338);
    }

    public void zz_ETCS3(Graphics g) { //zapowedź żółty poziomu 3
        g.setColor(k10);
        int[] x1 = {168, 188, 188, 194, 188, 188, 168, 168};
        int[] y1 = {330, 330, 326, 332, 338, 334, 334, 330};
        g.fillPolygon(x1, y1, 8);
        g.fillRect(168, 340, 52, 10);
        g.drawString("3", 208, 338);
        
          // ramka zwn.
        if (kolor % 2 == 0) {
            g.setColor(k1);
        } else {
            g.setColor(k10);
        }
        g.drawRect(165, 315, 58, 50);
    }

    public void ETCS_NTC(Graphics g) {
        g.setColor(k6); // symbol NTC
        Font ntc = new Font("Dialog", Font.BOLD, 20);
        g.setFont(ntc);
        g.drawString("NTC", 7, 338);
        // g.drawLine(0,340,54,340);
    }

    public void zs_NTC(Graphics g) { //zapowedź szara poziomu NTC
        g.setColor(k6);
        Font jj = new Font("Dialog", Font.BOLD, 12);
        g.setFont(jj);
        int[] x1 = {168, 188, 188, 194, 188, 188, 168, 168};
        int[] y1 = {337, 337, 333, 339, 345, 341, 341, 337};
        g.fillPolygon(x1, y1, 8);
        g.drawString("NTC", 198, 344);
    }

    public void zz_NTC(Graphics g) { //zapowedź szara poziomu NTC
        g.setColor(k10);
        Font jj = new Font("Dialog", Font.BOLD, 12);
        g.setFont(jj);
        int[] x1 = {168, 188, 188, 194, 188, 188, 168, 168};
        int[] y1 = {337, 337, 333, 339, 345, 341, 341, 337};
        g.fillPolygon(x1, y1, 8);
        g.drawString("NTC", 198, 344);
        
          // ramka zwn.
        if (kolor % 2 == 0) {
            g.setColor(k1);
        } else {
            g.setColor(k10);
        }
        g.drawRect(165, 315, 58, 50);
    }

    public void StandBy(Graphics g) {
        g.setColor(k2); // symbol czuwania
        // g.drawRect(291,272,32,32);
        g.fillArc(293, 274, 28, 28, 120, 300);
        g.setColor(k1);
        g.fillArc(294, 275, 26, 26, 120, 300);
        g.setColor(k2);
        g.fillRect(305, 274, 5, 10);
    }

    public void StaffRensponsible(Graphics g) {
        g.setColor(k1);
        g.drawRect(291, 272, 32, 32);
        g.setColor(k2);
        g.fillOval(291, 277, 32, 22);
        g.setColor(k1);
        g.fillOval(292, 278, 30, 20);
        g.setColor(k2);
        g.drawLine(291, 272, 323, 304);
        g.drawLine(291, 304, 323, 272);
        g.drawRect(291, 272, 32, 32);
    }

    public void pStaffRensponsible(Graphics g) { // zezwolenie na jazdę na odpowiedzialność maszynisty
        g.setColor(k1);
        g.drawRect(178, 324, 32, 32);
        g.setColor(k10);
        g.fillOval(178, 329, 32, 22);
        g.setColor(k1);
        g.fillOval(179, 330, 30, 20);
        g.setColor(k10);
        g.drawLine(178, 324, 210, 356);
        g.drawLine(178, 356, 210, 324);
        g.drawRect(178, 324, 32, 32);

        // ramka zwn.
        if (kolor % 2 == 0) {
            g.setColor(k1);
        } else {
            g.setColor(k10);
        }
        g.drawRect(165, 315, 58, 50);
    }

    public void FullSupervision(Graphics g) {
        g.setColor(k1); // ikonka trby pełnego nadzoru
        g.drawRect(291, 272, 32, 32);
        g.setColor(k2);
        g.fillOval(291, 277, 32, 22);
        g.setColor(k1);
        g.fillOval(292, 278, 30, 20);
        g.setColor(k2);
        g.drawRect(291, 272, 32, 32);
    }

    public void Shunting(Graphics g) {
        // ikonka trybu manwerowanie
        g.setColor(k2);
        //  g.drawRect(291, 272, 32, 32);
        g.setColor(k2);
        int[] x3 = {294, 308, 308, 315, 315, 321, 321, 294};
        int[] y3 = {285, 285, 277, 277, 285, 285, 295, 295};
        g.fillPolygon(x3, y3, 8);
        g.fillOval(296, 290, 10, 10);
        g.fillOval(309, 290, 10, 10);
        g.setColor(k1);
        int[] x4 = {294, 299, 299, 306, 306, 299, 299, 294};
        int[] y4 = {290, 287, 289, 289, 291, 291, 293, 290};
        g.fillPolygon(x4, y4, 8);
        int[] x5 = {320, 315, 315, 308, 308, 315, 315, 320};
        int[] y5 = {290, 287, 289, 289, 291, 291, 293, 290};
        g.fillPolygon(x5, y5, 8);

    }

    public void pShunting(Graphics g) {
        // ikonka trybu manwerowanie potwierdzenie
        g.setColor(k10);
        // g.drawRect(178, 324, 32, 32);
        g.setColor(k10);
        int[] x3 = {181, 195, 195, 202, 202, 208, 208, 181};
        int[] y3 = {337, 337, 329, 329, 337, 337, 347, 347};
        g.fillPolygon(x3, y3, 8);
        g.fillOval(183, 342, 10, 10);
        g.fillOval(196, 342, 10, 10);
        g.setColor(k1);
        int[] x4 = {181, 186, 186, 193, 193, 186, 186, 181};
        int[] y4 = {342, 339, 341, 341, 343, 343, 345, 342};
        g.fillPolygon(x4, y4, 8);
        int[] x5 = {207, 202, 202, 195, 195, 202, 202, 207};
        int[] y5 = {342, 339, 341, 341, 343, 343, 345, 342};
        g.fillPolygon(x5, y5, 8);

        // ramka zwn.
        if (kolor % 2 == 0) {
            g.setColor(k1);
        } else {
            g.setColor(k10);
        }
        g.drawRect(165, 315, 58, 50);

    }

    public void NonLeading(Graphics g) {
        // ikonka trybu podrzędny

        g.setColor(k2);
        g.drawLine(290, 272, 293, 272);
        g.drawLine(293, 272, 303, 285);
        g.drawLine(303, 285, 303, 295);
        g.drawLine(303, 295, 295, 300);
        g.drawLine(295, 300, 290, 300);
        g.fillOval(290, 295, 8, 8);
        int[] a1 = {293, 300, 293};
        int[] a2 = {275, 285, 285};
        g.fillPolygon(a1, a2, 3);

        g.setColor(k2);
        g.drawLine(324, 272, 321, 272);
        g.drawLine(321, 272, 311, 285);
        g.drawLine(311, 285, 311, 295);
        g.drawLine(311, 295, 319, 300);
        g.drawLine(319, 300, 324, 300);
        g.fillOval(316, 295, 8, 8);
        int[] a3 = {321, 314, 321};
        int[] a4 = {275, 285, 285};
        g.fillPolygon(a3, a4, 3);

        g.fillRect(303, 290, 8, 3);

        //  g.setColor(k2);
        //  g.drawRect(289, 270, 36, 36);
    }

    public void EOAactive(Graphics g) { //jazda za sygnał "STÓJ"
        g.setColor(k6);
        // g.drawRect(176, 322, 36, 36);
        g.fillRect(188, 325, 12, 26);
        g.fillRect(189, 324, 10, 28);
        g.fillRect(192, 352, 4, 4);
        g.fillRect(190, 354, 8, 2);

        int[] x4 = {201, 206, 206, 210, 206, 206, 201, 201};
        int[] y4 = {337, 337, 332, 339, 346, 341, 341, 337};
        g.fillPolygon(x4, y4, 8);

        int[] x3 = {178, 186, 186, 183};
        int[] y3 = {337, 337, 341, 341};
        g.fillPolygon(x3, y3, 4);
        g.setColor(k1);
        g.fillOval(189, 324, 8, 8);
        g.fillOval(189, 333, 8, 8);
        g.fillOval(189, 342, 8, 8);
    }

    public void Trip(Graphics g) { // zatrzymanie
        g.setColor(k6);
        g.fillRect(289, 270, 36, 36);
        g.setColor(k12);
        //g.drawRect(289, 270, 36, 36);

        g.fillRect(301, 274, 12, 26);
        g.fillRect(302, 273, 10, 28);
        g.fillRect(305, 301, 4, 4);
        g.fillRect(303, 303, 8, 2);
        g.setColor(k6);
        g.fillOval(302, 273, 8, 8);
        g.fillOval(302, 282, 8, 8);
        g.fillOval(302, 291, 8, 8);

    }

    public void PostTrip(Graphics g) { // po zatrzymaniu
        g.setColor(k6);
        //g.drawRect(289, 270, 36, 36);

        g.fillRect(301, 274, 12, 26);
        g.fillRect(302, 273, 10, 28);
        g.fillRect(305, 301, 4, 4);
        g.fillRect(303, 303, 8, 2);
        g.setColor(k1);
        g.fillOval(302, 273, 8, 8);
        g.fillOval(302, 282, 8, 8);
        g.fillOval(302, 291, 8, 8);

    }

    public void pTrip(Graphics g) { // potwierdzenie zatrzymania
        g.setColor(k10);
        // g.drawRect(176, 322, 36, 36);
        g.fillRect(188, 325, 12, 26);
        g.fillRect(189, 324, 10, 28);
        g.fillRect(192, 352, 4, 4);
        g.fillRect(190, 354, 8, 2);
        g.setColor(k1);
        g.fillOval(189, 324, 8, 8);
        g.fillOval(189, 333, 8, 8);
        g.fillOval(189, 342, 8, 8);

        // ramka zwn.
        if (kolor % 2 == 0) {
            g.setColor(k1);
        } else {
            g.setColor(k10);
        }
        g.drawRect(165, 315, 58, 50);
    }

    public void OnSight(Graphics g) { // jazda na widoczność
        g.setColor(k6);
        // g.drawRect(289, 270, 36, 36);
        g.drawLine(293, 288, 318, 274);
        g.drawLine(293, 289, 318, 302);
        g.fillOval(311, 277, 6, 22);
    }

    public void pOnSight(Graphics g) { // zezwolenie na jazdę na widocznosc
        g.setColor(k10);
        // g.drawRect(176, 322, 36, 36);
        g.drawLine(180, 340, 207, 325);
        g.drawLine(180, 341, 207, 353);
        g.fillOval(200, 328, 6, 22);

        // ramka zwn.
        if (kolor % 2 == 0) {
            g.setColor(k1);
        } else {
            g.setColor(k10);
        }
        g.drawRect(165, 315, 58, 50);
    }

    public void Reversing(Graphics g) { // ikonka cofania
        g.setColor(k2);
        // g.drawRect(289, 270, 36, 36);
        g.drawLine(308, 273, 311, 273);
        g.drawLine(311, 273, 321, 286);
        g.drawLine(321, 286, 321, 296);
        g.drawLine(321, 296, 313, 301);
        g.drawLine(313, 301, 308, 301);
        g.fillOval(308, 295, 8, 8);
        int[] a1 = {311, 318, 311};
        int[] a2 = {276, 286, 286};
        g.fillPolygon(a1, a2, 3);

        int[] b1 = {308, 298, 298, 291, 298, 298, 304, 308};
        int[] b2 = {285, 285, 280, 287, 294, 289, 289, 285};
        g.fillPolygon(b1, b2, 8);
    }

    public void pReversing(Graphics g) { // ikonka potwierdzenia cofania
        g.setColor(k10);
        // g.drawRect(176, 322, 36, 36);
        g.drawLine(195, 325, 198, 325);
        g.drawLine(198, 325, 208, 338);
        g.drawLine(208, 338, 208, 348);
        g.drawLine(208, 348, 200, 353);
        g.drawLine(200, 353, 195, 353);
        g.fillOval(195, 347, 8, 8);
        int[] a1 = {198, 205, 198};
        int[] a2 = {328, 338, 338};
        g.fillPolygon(a1, a2, 3);

        int[] b1 = {195, 185, 185, 178, 185, 185, 191, 195};
        int[] b2 = {337, 337, 332, 339, 346, 341, 341, 337};
        g.fillPolygon(b1, b2, 8);

        // ramka zwn.
        if (kolor % 2 == 0) {
            g.setColor(k1);
        } else {
            g.setColor(k10);
        }
        g.drawRect(165, 315, 58, 50);
    }

    public void Unfitted(Graphics g) { // ikonka trybu linia niewyposażona
        g.setColor(k2);
        // g.drawRect(289, 270, 36, 36);
        g.drawLine(292, 300, 315, 277);
        g.drawLine(304, 300, 320, 277);
        g.drawLine(291, 299, 305, 299);
        g.drawLine(297, 294, 308, 294);
        g.drawLine(301, 290, 311, 290);
        g.drawLine(305, 286, 313, 286);
        g.drawLine(309, 282, 316, 282);
        g.drawLine(313, 278, 318, 278);
    }

    public void pUnfitted(Graphics g) { // ikonka potwierdzenia linii niewyposażonej
        g.setColor(k10);
        // g.drawRect(176, 322, 36, 36);
        g.drawLine(179, 352, 204, 329);
        g.drawLine(191, 352, 209, 329);
        g.drawLine(178, 351, 193, 351);
        g.drawLine(184, 346, 196, 346);
        g.drawLine(188, 342, 199, 342);
        g.drawLine(193, 338, 202, 338);
        g.drawLine(197, 334, 205, 334);
        g.drawLine(202, 330, 207, 330);

        // ramka zwn.
        if (kolor % 2 == 0) {
            g.setColor(k1);
        } else {
            g.setColor(k10);
        }
        g.drawRect(165, 315, 58, 50);
    }

    public void SystemFailure(Graphics g) {// uszkodzenie systemu
        g.setColor(k6);
        g.fillRect(291, 272, 32, 32);

        g.setColor(k12);
        //g.drawRect(291, 272, 32, 32);

        int[] x1 = {291, 307, 323};
        int[] x2 = {304, 272, 304};
        g.fillPolygon(x1, x2, 3);

        g.setColor(k6);
        g.fillRect(305, 282, 4, 15);
        g.fillRect(305, 299, 4, 4);
    }

    public void NationalSystem(Graphics g) {// System Narodowy - brak określonej lokalizacji, umieszczony przeze mnie w polu B7
        g.setColor(k6);
       // g.drawRect(289, 270, 36, 36);
        int[] a1 = {305, 294, 294, 305, 309, 320, 320, 309, 305};
        int[] a2 = {275, 286, 290, 301, 301, 290, 286, 275, 275};
        g.fillPolygon(a1, a2, 9);
        g.setColor(k1);
        int[] b1 = {305, 298, 298, 305, 309, 316, 316, 309, 305};
        int[] b2 = {279, 286, 290, 297, 297, 290, 286, 279, 279};
        g.fillPolygon(b1, b2, 9);
    }

    public void pNationalSystem(Graphics g) {// zezwolenie na system  narodowy
        g.setColor(k10);
        //g.drawRect(176, 322, 36, 36);
        int[] a1 = {192, 181, 181, 192, 196, 207, 207, 196, 192};
        int[] a2 = {327, 338, 342, 353, 353, 342, 338, 327, 327};
        g.fillPolygon(a1, a2, 9);
        g.setColor(k1);
        int[] b1 = {192, 185, 185, 192, 196, 203, 203, 196, 192};
        int[] b2 = {331, 338, 342, 349, 349, 342, 338, 331, 331};
        g.fillPolygon(b1, b2, 9);

        // ramka zwn.
        if (kolor % 2 == 0) {
            g.setColor(k1);
        } else {
            g.setColor(k10);
        }
        g.drawRect(165, 315, 58, 50);
    }

    public void LimittedSupervision(Graphics g) { // jazda z niepełnym nadzorem
        g.setColor(k2);
        g.drawRect(289, 270, 36, 36);
        g.setColor(k1);
        g.drawRect(290, 271, 34, 34);
        g.setColor(k2);
        g.fillOval(289, 277, 36, 22);
        g.fillRect(291, 272, 5, 5);
        g.fillRect(291, 300, 5, 5);
        g.fillRect(319, 300, 5, 5);
        g.fillRect(319, 272, 5, 5);
        g.setColor(k1);
        g.fillRect(306, 280, 4, 4);
        g.fillRect(306, 287, 4, 4);
        g.fillRect(306, 294, 4, 4);
    }

    public void pLimittedSupervision(Graphics g) { // zezwolenie na jazdę z niepełnym nadzorem
        g.setColor(k10);
        g.drawRect(176, 322, 36, 36);
        g.setColor(k1);
        g.drawRect(177, 323, 34, 34);
        g.setColor(k10);
        g.fillOval(176, 329, 36, 22);
        g.fillRect(178, 324, 5, 5);
        g.fillRect(178, 352, 5, 5);
        g.fillRect(206, 352, 5, 5);
        g.fillRect(206, 324, 5, 5);
        g.setColor(k1);
        g.fillRect(192, 332, 4, 4);
        g.fillRect(192, 339, 4, 4);
        g.fillRect(192, 346, 4, 4);

        // ramka zwn.
        if (kolor % 2 == 0) {
            g.setColor(k1);
        } else {
            g.setColor(k10);
        }
        g.drawRect(165, 315, 58, 50);
    }

    public void ST_01(Graphics g) { // załączenie hamowania przez system
        g.setColor(k6);
        g.fillRect(1, 342, 52, 21);
        g.setColor(k12);
        g.fillRect(8, 343, 38, 19);
        g.setColor(k6);
        g.fillOval(15, 341, 26, 21);
        g.setColor(k12);
        g.fillOval(20, 343, 17, 17);
    }

    public void ST_02(Graphics g) { // śliska szyna
        g.setColor(k6);
        g.fillRect(5, 311, 44, 2);
        g.fillOval(20, 292, 15, 15);
        g.drawLine(12, 307, 42, 307);
        int[] e1 = {14, 14, 10, 14};
        int[] e2 = {304, 310, 306, 304};
        g.fillPolygon(e1, e2, 4);
        int[] f1 = {41, 41, 45, 41};
        int[] f2 = {304, 310, 306, 304};
        g.fillPolygon(f1, f2, 4);
        g.setColor(k1);
        g.fillOval(22, 294, 11, 11);
    }

    public void ST_03(Graphics g) { // istniejaca sesja komunikacyjna
        g.setColor(k6);
        int[] m1 = {10, 12, 17, 17, 12, 10};
        int[] m2 = {367, 367, 372, 382, 387, 387};
        g.fillPolygon(m1, m2, 6);
        g.fillRect(17, 375, 20, 4);
        g.fillRect(37, 368, 4, 18);
        g.setColor(k1);
        int[] n1 = {10, 12, 14, 14, 12, 10};
        int[] n2 = {371, 371, 376, 378, 383, 383};
        g.fillPolygon(n1, n2, 6);
    }

    public void ST_04(Graphics g) { // brak sesji komunikacyjnej
        g.setColor(k6);
        g.fillRect(1, 367, 52, 21);
        g.setColor(k12);
        int[] m1 = {10, 12, 17, 17, 12, 10};
        int[] m2 = {367, 367, 372, 382, 387, 387};
        g.fillPolygon(m1, m2, 6);
        int[] r1 = {17, 22, 25, 17};
        int[] r2 = {375, 375, 379, 379};
        g.fillPolygon(r1, r2, 4);
        int[] p1 = {30, 37, 37, 34};
        int[] p2 = {375, 375, 379, 379};
        g.fillPolygon(p1, p2, 4);
        g.fillRect(37, 368, 4, 18);
        g.setColor(k6);
        int[] n1 = {10, 12, 14, 14, 12, 10};
        int[] n2 = {371, 371, 376, 378, 383, 383};
        g.fillPolygon(n1, n2, 6);
    }

    public void ST_06(Graphics g) { //cofanie dozwolone
        g.setColor(k6);
        g.drawLine(1, 392, 8, 392);
        g.drawLine(8, 392, 15, 400);
        g.drawLine(15, 400, 15, 410);
        g.drawLine(15, 410, 10, 413);
        int[] u1 = {6, 13, 6};
        int[] u2 = {395, 402, 402};
        g.fillPolygon(u1, u2, 3);
        int[] y1 = {20, 25, 25};
        int[] y2 = {400, 395, 405};
        g.fillPolygon(y1, y2, 3);
        g.fillRect(25, 399, 10, 3);
        int[] z1 = {35, 40, 40, 35, 32};
        int[] z2 = {399, 405, 408, 413, 413};
        g.fillPolygon(z1, z2, 5);
        g.setColor(k1);
        int[] z11 = {35, 40, 38, 35, 32};
        int[] z22 = {402, 407, 406, 410, 410};
        g.fillPolygon(z11, z22, 5);

    }

    public void TC_01B3(Graphics g) {
        g.setColor(k6);
        g.fillRect(139, 272, 32, 4);
        g.fillRect(139, 299, 32, 5);
        g.fillRect(145, 288, 15, 3);
        g.drawLine(157, 290, 146, 295);
        g.drawLine(146, 295, 152, 299);
    }

    public void TC_01B4(Graphics g) {
        g.setColor(k6);
        g.fillRect(175, 272, 32, 4);
        g.fillRect(175, 299, 32, 5);
        g.fillRect(181, 288, 15, 3);
        g.drawLine(193, 290, 182, 295);
        g.drawLine(182, 295, 188, 299);
    }

    public void TC_01B5(Graphics g) {
        g.setColor(k6);
        g.fillRect(211, 272, 32, 4);
        g.fillRect(211, 299, 32, 5);
        g.fillRect(217, 288, 15, 3);
        g.drawLine(229, 290, 218, 295);
        g.drawLine(218, 295, 224, 299);
    }

    public void TC_02B3(Graphics g) {
        g.setColor(k6);
        g.fillRect(139, 272, 32, 4);
        g.fillRect(139, 299, 32, 5);
        g.fillRect(145, 288, 15, 3);
        g.drawLine(157, 290, 146, 295);
        g.drawLine(146, 295, 152, 299);

        int[] x1 = {158, 158, 155, 160, 165, 162, 162};
        int[] y1 = {278, 281, 281, 286, 281, 281, 278};
        g.fillPolygon(x1, y1, 7);
    }

    public void TC_02B4(Graphics g) {
        g.setColor(k6);
        g.fillRect(175, 272, 32, 4);
        g.fillRect(175, 299, 32, 5);
        g.fillRect(181, 288, 15, 3);
        g.drawLine(193, 290, 182, 295);
        g.drawLine(182, 295, 188, 299);

        int[] x1 = {194, 194, 191, 196, 201, 198, 198};
        int[] y1 = {278, 281, 281, 286, 281, 281, 278};
        g.fillPolygon(x1, y1, 7);
    }

    public void TC_02B5(Graphics g) {
        g.setColor(k6);
        g.fillRect(211, 272, 32, 4);
        g.fillRect(211, 299, 32, 5);
        g.fillRect(217, 288, 15, 3);
        g.drawLine(229, 290, 218, 295);
        g.drawLine(218, 295, 224, 299);

        int[] x1 = {230, 230, 227, 232, 237, 234, 234};
        int[] y1 = {278, 281, 281, 286, 281, 281, 278};
        g.fillPolygon(x1, y1, 7);
    }

    public void TC_03B3(Graphics g) {
        g.setColor(k10);
        g.fillRect(139, 272, 32, 4);
        g.fillRect(139, 299, 32, 5);
        g.fillRect(145, 288, 15, 3);
        g.drawLine(157, 290, 146, 295);
        g.drawLine(146, 295, 152, 299);

        int[] x1 = {158, 158, 155, 160, 165, 162, 162};
        int[] y1 = {278, 281, 281, 286, 281, 281, 278};
        g.fillPolygon(x1, y1, 7);
    }

    public void TC_03B4(Graphics g) {
        g.setColor(k10);
        g.fillRect(175, 272, 32, 4);
        g.fillRect(175, 299, 32, 5);
        g.fillRect(181, 288, 15, 3);
        g.drawLine(193, 290, 182, 295);
        g.drawLine(182, 295, 188, 299);

        int[] x1 = {194, 194, 191, 196, 201, 198, 198};
        int[] y1 = {278, 281, 281, 286, 281, 281, 278};
        g.fillPolygon(x1, y1, 7);
    }

    public void TC_03B5(Graphics g) {
        g.setColor(k10);
        g.fillRect(211, 272, 32, 4);
        g.fillRect(211, 299, 32, 5);
        g.fillRect(217, 288, 15, 3);
        g.drawLine(229, 290, 218, 295);
        g.drawLine(218, 295, 224, 299);

        int[] x1 = {230, 230, 227, 232, 237, 234, 234};
        int[] y1 = {278, 281, 281, 286, 281, 281, 278};
        g.fillPolygon(x1, y1, 7);
    }

    public void TC_04B3(Graphics g) {
        g.setColor(k6);
        g.fillRect(139, 272, 32, 4);
        g.fillRect(139, 299, 32, 5);
        g.fillRect(145, 277, 23, 3);
        g.drawLine(160, 280, 143, 290);
        g.drawLine(143, 290, 158, 299);

        int[] x1 = {161, 161, 158, 163, 168, 165, 165};
        int[] y1 = {295, 292, 292, 287, 292, 292, 295};
        g.fillPolygon(x1, y1, 7);
    }

    public void TC_04B4(Graphics g) {
        g.setColor(k6);
        g.fillRect(175, 272, 32, 4);
        g.fillRect(175, 299, 32, 5);
        g.fillRect(181, 277, 23, 3);
        g.drawLine(196, 280, 179, 290);
        g.drawLine(179, 290, 194, 299);

        int[] x1 = {197, 197, 194, 199, 204, 201, 201};
        int[] y1 = {295, 292, 292, 287, 292, 292, 295};
        g.fillPolygon(x1, y1, 7);
    }

    public void TC_04B5(Graphics g) {
        g.setColor(k6);
        g.fillRect(211, 272, 32, 4);
        g.fillRect(211, 299, 32, 5);
        g.fillRect(217, 277, 23, 3);
        g.drawLine(235, 280, 218, 290);
        g.drawLine(218, 290, 233, 299);

        int[] x1 = {236, 236, 233, 238, 243, 240, 240};
        int[] y1 = {295, 292, 292, 287, 292, 292, 295};
        g.fillPolygon(x1, y1, 7);
    }

    public void TC_05B3(Graphics g) {
        g.setColor(k10);
        g.fillRect(139, 272, 32, 4);
        g.fillRect(139, 299, 32, 5);
        g.fillRect(145, 277, 23, 3);
        g.drawLine(160, 280, 143, 290);
        g.drawLine(143, 290, 158, 299);

        int[] x1 = {161, 161, 158, 163, 168, 165, 165};
        int[] y1 = {295, 292, 292, 287, 292, 292, 295};
        g.fillPolygon(x1, y1, 7);
    }

    public void TC_05B4(Graphics g) {
        g.setColor(k10);
        g.fillRect(175, 272, 32, 4);
        g.fillRect(175, 299, 32, 5);
        g.fillRect(181, 277, 23, 3);
        g.drawLine(196, 280, 179, 290);
        g.drawLine(179, 290, 194, 299);

        int[] x1 = {197, 197, 194, 199, 204, 201, 201};
        int[] y1 = {295, 292, 292, 287, 292, 292, 295};
        g.fillPolygon(x1, y1, 7);
    }

    public void TC_05B5(Graphics g) {
        g.setColor(k10);
        g.fillRect(211, 272, 32, 4);
        g.fillRect(211, 299, 32, 5);
        g.fillRect(217, 277, 23, 3);
        g.drawLine(235, 280, 218, 290);
        g.drawLine(218, 290, 233, 299);

        int[] x1 = {236, 236, 233, 238, 243, 240, 240};
        int[] y1 = {295, 292, 292, 287, 292, 292, 295};
        g.fillPolygon(x1, y1, 7);
    }

    public void TC_06B3(Graphics g) {
        g.setColor(k6);
        g.fillRect(142, 275, 5, 17);
        g.fillRect(162, 275, 5, 17);
        g.fillRect(142, 295, 25, 5);
    }

    public void TC_06B4(Graphics g) {
        g.setColor(k6);
        g.fillRect(178, 275, 5, 17);
        g.fillRect(198, 275, 5, 17);
        g.fillRect(178, 295, 25, 5);
    }

    public void TC_06B5(Graphics g) {
        g.setColor(k6);
        g.fillRect(214, 275, 5, 17);
        g.fillRect(234, 275, 5, 17);
        g.fillRect(214, 295, 25, 5);
    }

    public void TC_07B3(Graphics g) {
        g.setColor(k10);
        g.fillRect(142, 275, 5, 17);
        g.fillRect(162, 275, 5, 17);
        g.fillRect(142, 295, 25, 5);
    }

    public void TC_07B4(Graphics g) {
        g.setColor(k10);
        g.fillRect(178, 275, 5, 17);
        g.fillRect(198, 275, 5, 17);
        g.fillRect(178, 295, 25, 5);
    }

    void TC_07B5(Graphics g) {
        g.setColor(k10);
        g.fillRect(214, 275, 5, 17);
        g.fillRect(234, 275, 5, 17);
        g.fillRect(214, 295, 25, 5);
    }

    public void TC_08B3(Graphics g) {
        g.setColor(k6);
        g.fillRect(142, 275, 5, 20);
        g.fillRect(162, 275, 5, 20);
        g.fillRect(142, 295, 25, 5);
    }

    void TC_08B4(Graphics g) {
        g.setColor(k6);
        g.fillRect(178, 275, 5, 20);
        g.fillRect(198, 275, 5, 20);
        g.fillRect(178, 295, 25, 5);
    }

    public void TC_08B5(Graphics g) {
        g.setColor(k6);
        g.fillRect(214, 275, 5, 20);
        g.fillRect(234, 275, 5, 20);
        g.fillRect(214, 295, 25, 5);
    }

    public void TC_09B3(Graphics g) {
        g.setColor(k10);
        g.fillRect(142, 275, 5, 20);
        g.fillRect(162, 275, 5, 20);
        g.fillRect(142, 295, 25, 5);
    }

    public void TC_09B4(Graphics g) {
        g.setColor(k10);
        g.fillRect(178, 275, 5, 20);
        g.fillRect(198, 275, 5, 20);
        g.fillRect(178, 295, 25, 5);
    }

    public void TC_09B5(Graphics g) {
        g.setColor(k10);
        g.fillRect(214, 275, 5, 20);
        g.fillRect(234, 275, 5, 20);
        g.fillRect(214, 295, 25, 5);
    }

    public void TC_10B3(Graphics g) {
        g.setColor(k6);
        g.fillRect(139, 299, 32, 3);
        g.drawLine(145, 272, 169, 296);
        g.drawLine(144, 272, 168, 296);
        g.drawLine(169, 272, 145, 296);
        g.drawLine(168, 272, 144, 296);
        g.drawString("0", 140, 290);
    }

    public void TC_10B4(Graphics g) {
        g.setColor(k6);
        g.fillRect(175, 299, 32, 3);
        g.drawLine(181, 272, 205, 296);
        g.drawLine(180, 272, 204, 296);
        g.drawLine(205, 272, 181, 296);
        g.drawLine(204, 272, 180, 296);
        g.drawString("0", 176, 290);
    }

    public void TC_10B5(Graphics g) {
        g.setColor(k6);
        g.fillRect(211, 299, 32, 3);
        g.drawLine(217, 272, 241, 296);
        g.drawLine(216, 272, 240, 296);
        g.drawLine(241, 272, 217, 296);
        g.drawLine(240, 272, 216, 296);
        g.drawString("0", 212, 290);
    }

    public void TC_11B3(Graphics g) {
        g.setColor(k10);
        g.fillRect(139, 299, 32, 3);
        g.drawLine(145, 272, 169, 296);
        g.drawLine(144, 272, 168, 296);
        g.drawLine(169, 272, 145, 296);
        g.drawLine(168, 272, 144, 296);
        g.drawString("0", 140, 290);
    }

    public void TC_11B4(Graphics g) {
        g.setColor(k10);
        g.fillRect(175, 299, 32, 3);
        g.drawLine(181, 272, 205, 296);
        g.drawLine(180, 272, 204, 296);
        g.drawLine(205, 272, 181, 296);
        g.drawLine(204, 272, 180, 296);
        g.drawString("0", 176, 290);
    }

    public void TC_11B5(Graphics g) {
        g.setColor(k10);
        g.fillRect(211, 299, 32, 3);
        g.drawLine(217, 272, 241, 296);
        g.drawLine(216, 272, 240, 296);
        g.drawLine(241, 272, 217, 296);
        g.drawLine(240, 272, 216, 296);
        g.drawString("0", 212, 290);
    }

    public void TC_12B3(Graphics g) {
        g.setColor(k6);
        g.drawLine(140, 273, 170, 303);
        g.drawLine(140, 274, 170, 304);
        g.drawLine(170, 273, 140, 303);
        g.drawLine(170, 274, 140, 304);
        g.fillOval(140, 280, 8, 8);
        g.drawLine(144, 287, 144, 303);
        g.drawLine(151, 280, 154, 283);
        g.drawLine(154, 283, 154, 287);
        g.drawLine(154, 287, 151, 290);
        g.drawLine(156, 277, 159, 280);
        g.drawLine(159, 280, 159, 290);
        g.drawLine(159, 290, 154, 295);
        g.drawLine(161, 274, 164, 277);
        g.drawLine(164, 277, 164, 293);
        g.drawLine(164, 293, 157, 300);
    }

    public void TC_12B4(Graphics g) {
        g.setColor(k6);
        g.drawLine(176, 273, 206, 303);
        g.drawLine(176, 274, 206, 304);
        g.drawLine(206, 273, 176, 303);
        g.drawLine(206, 274, 176, 304);
        g.fillOval(176, 280, 8, 8);
        g.drawLine(180, 287, 180, 303);
        g.drawLine(187, 280, 190, 283);
        g.drawLine(190, 283, 190, 287);
        g.drawLine(190, 287, 187, 290);
        g.drawLine(192, 277, 195, 280);
        g.drawLine(195, 280, 195, 290);
        g.drawLine(195, 290, 190, 295);
        g.drawLine(197, 274, 200, 277);
        g.drawLine(200, 277, 200, 293);
        g.drawLine(200, 293, 193, 300);
    }

    public void TC_12B5(Graphics g) {
        g.setColor(k6);
        g.drawLine(212, 273, 242, 303);
        g.drawLine(212, 274, 242, 304);
        g.drawLine(242, 273, 212, 303);
        g.drawLine(242, 274, 212, 304);
        g.fillOval(212, 280, 8, 8);
        g.drawLine(216, 287, 216, 303);
        g.drawLine(223, 280, 226, 283);
        g.drawLine(226, 283, 226, 287);
        g.drawLine(226, 287, 223, 290);
        g.drawLine(228, 277, 231, 280);
        g.drawLine(231, 280, 231, 290);
        g.drawLine(231, 290, 226, 295);
        g.drawLine(233, 274, 236, 277);
        g.drawLine(236, 277, 236, 293);
        g.drawLine(236, 293, 229, 300);
    }

    public void TC_13B3(Graphics g) {
        g.setColor(k6);
        g.fillRect(141, 298, 29, 3);
        g.fillRect(141, 290, 29, 3);
        g.fillRect(141, 293, 3, 3);
        g.fillRect(148, 293, 3, 3);
        g.fillRect(154, 272, 3, 24);
        g.fillRect(161, 293, 3, 3);
        g.fillRect(167, 293, 3, 3);
        g.drawLine(140, 272, 170, 302);
        g.drawLine(140, 273, 170, 303);
        g.drawLine(140, 274, 170, 304);
        g.drawLine(170, 272, 140, 302);
        g.drawLine(170, 273, 140, 303);
        g.drawLine(170, 274, 140, 304);
    }

    public void TC_13B4(Graphics g) {
        g.setColor(k6);
        g.fillRect(177, 298, 29, 3);
        g.fillRect(177, 290, 29, 3);
        g.fillRect(177, 293, 3, 3);
        g.fillRect(184, 293, 3, 3);
        g.fillRect(190, 272, 3, 24);
        g.fillRect(197, 293, 3, 3);
        g.fillRect(203, 293, 3, 3);
        g.drawLine(176, 272, 206, 302);
        g.drawLine(176, 273, 206, 303);
        g.drawLine(176, 274, 206, 304);
        g.drawLine(206, 272, 176, 302);
        g.drawLine(206, 273, 176, 303);
        g.drawLine(206, 274, 176, 304);
    }

    public void TC_13B5(Graphics g) {
        g.setColor(k6);
        g.fillRect(213, 298, 29, 3);
        g.fillRect(213, 290, 29, 3);
        g.fillRect(213, 293, 3, 3);
        g.fillRect(220, 293, 3, 3);
        g.fillRect(226, 272, 3, 24);
        g.fillRect(233, 293, 3, 3);
        g.fillRect(239, 293, 3, 3);
        g.drawLine(212, 272, 242, 302);
        g.drawLine(212, 273, 242, 303);
        g.drawLine(212, 274, 242, 304);
        g.drawLine(242, 272, 212, 302);
        g.drawLine(242, 273, 212, 303);
        g.drawLine(242, 274, 212, 304);
    }

    public void TC_14B3(Graphics g) {
        g.setColor(k10);
        g.fillRect(141, 298, 29, 3);
        g.fillRect(141, 290, 29, 3);
        g.fillRect(141, 293, 3, 3);
        g.fillRect(148, 293, 3, 3);
        g.fillRect(154, 272, 3, 24);
        g.fillRect(161, 293, 3, 3);
        g.fillRect(167, 293, 3, 3);
        g.drawLine(140, 272, 170, 302);
        g.drawLine(140, 273, 170, 303);
        g.drawLine(140, 274, 170, 304);
        g.drawLine(170, 272, 140, 302);
        g.drawLine(170, 273, 140, 303);
        g.drawLine(170, 274, 140, 304);
    }

    public void TC_14B4(Graphics g) {
        g.setColor(k10);
        g.fillRect(177, 298, 29, 3);
        g.fillRect(177, 290, 29, 3);
        g.fillRect(177, 293, 3, 3);
        g.fillRect(184, 293, 3, 3);
        g.fillRect(190, 272, 3, 24);
        g.fillRect(197, 293, 3, 3);
        g.fillRect(203, 293, 3, 3);
        g.drawLine(176, 272, 206, 302);
        g.drawLine(176, 273, 206, 303);
        g.drawLine(176, 274, 206, 304);
        g.drawLine(206, 272, 176, 302);
        g.drawLine(206, 273, 176, 303);
        g.drawLine(206, 274, 176, 304);
    }

    public void TC_14B5(Graphics g) {
        g.setColor(k10);
        g.fillRect(213, 298, 29, 3);
        g.fillRect(213, 290, 29, 3);
        g.fillRect(213, 293, 3, 3);
        g.fillRect(220, 293, 3, 3);
        g.fillRect(226, 272, 3, 24);
        g.fillRect(233, 293, 3, 3);
        g.fillRect(239, 293, 3, 3);
        g.drawLine(212, 272, 242, 302);
        g.drawLine(212, 273, 242, 303);
        g.drawLine(212, 274, 242, 304);
        g.drawLine(242, 272, 212, 302);
        g.drawLine(242, 273, 212, 303);
        g.drawLine(242, 274, 212, 304);
    }

    public void TC_15B3(Graphics g) {
        g.setColor(k6);
        g.fillRect(141, 298, 29, 3);
        g.fillRect(141, 290, 29, 3);
        g.fillRect(154, 272, 3, 18);
        g.drawLine(151, 296, 153, 294);
        g.drawLine(153, 294, 155, 294);
        g.drawLine(155, 294, 157, 296);
        g.drawLine(157, 296, 159, 296);
        g.drawLine(159, 296, 160, 293);

        g.drawLine(140, 272, 170, 302);
        g.drawLine(140, 273, 170, 303);
        g.drawLine(140, 274, 170, 304);
        g.drawLine(170, 272, 140, 302);
        g.drawLine(170, 273, 140, 303);
        g.drawLine(170, 274, 140, 304);
    }

    public void TC_15B4(Graphics g) {
        g.setColor(k6);
        g.fillRect(177, 298, 29, 3);
        g.fillRect(177, 290, 29, 3);
        g.fillRect(190, 272, 3, 18);
        g.drawLine(187, 296, 189, 294);
        g.drawLine(189, 294, 191, 294);
        g.drawLine(191, 294, 193, 296);
        g.drawLine(193, 296, 195, 296);
        g.drawLine(195, 296, 196, 293);

        g.drawLine(176, 272, 206, 302);
        g.drawLine(176, 273, 206, 303);
        g.drawLine(176, 274, 206, 304);
        g.drawLine(206, 272, 176, 302);
        g.drawLine(206, 273, 176, 303);
        g.drawLine(206, 274, 176, 304);
    }

    public void TC_15B5(Graphics g) {
        g.setColor(k6);
        g.fillRect(213, 298, 29, 3);
        g.fillRect(213, 290, 29, 3);
        g.fillRect(226, 272, 3, 18);
        g.drawLine(223, 296, 225, 294);
        g.drawLine(225, 294, 227, 294);
        g.drawLine(227, 294, 229, 296);
        g.drawLine(229, 296, 231, 296);
        g.drawLine(231, 296, 232, 293);

        g.drawLine(212, 272, 242, 302);
        g.drawLine(212, 273, 242, 303);
        g.drawLine(212, 274, 242, 304);
        g.drawLine(242, 272, 212, 302);
        g.drawLine(242, 273, 212, 303);
        g.drawLine(242, 274, 212, 304);
    }

    public void TC_16B3(Graphics g) {
        g.setColor(k10);
        g.fillRect(141, 298, 29, 3);
        g.fillRect(141, 290, 29, 3);
        g.fillRect(154, 272, 3, 18);
        g.drawLine(151, 296, 153, 294);
        g.drawLine(153, 294, 155, 294);
        g.drawLine(155, 294, 157, 296);
        g.drawLine(157, 296, 159, 296);
        g.drawLine(159, 296, 160, 293);

        g.drawLine(140, 272, 170, 302);
        g.drawLine(140, 273, 170, 303);
        g.drawLine(140, 274, 170, 304);
        g.drawLine(170, 272, 140, 302);
        g.drawLine(170, 273, 140, 303);
        g.drawLine(170, 274, 140, 304);
    }

    public void TC_16B4(Graphics g) {
        g.setColor(k10);
        g.fillRect(177, 298, 29, 3);
        g.fillRect(177, 290, 29, 3);
        g.fillRect(190, 272, 3, 18);
        g.drawLine(187, 296, 189, 294);
        g.drawLine(189, 294, 191, 294);
        g.drawLine(191, 294, 193, 296);
        g.drawLine(193, 296, 195, 296);
        g.drawLine(195, 296, 196, 293);

        g.drawLine(176, 272, 206, 302);
        g.drawLine(176, 273, 206, 303);
        g.drawLine(176, 274, 206, 304);
        g.drawLine(206, 272, 176, 302);
        g.drawLine(206, 273, 176, 303);
        g.drawLine(206, 274, 176, 304);
    }

    public void TC_16B5(Graphics g) {
        g.setColor(k10);
        g.fillRect(213, 298, 29, 3);
        g.fillRect(213, 290, 29, 3);
        g.fillRect(226, 272, 3, 18);
        g.drawLine(223, 296, 225, 294);
        g.drawLine(225, 294, 227, 294);
        g.drawLine(227, 294, 229, 296);
        g.drawLine(229, 296, 231, 296);
        g.drawLine(231, 296, 232, 293);

        g.drawLine(212, 272, 242, 302);
        g.drawLine(212, 273, 242, 303);
        g.drawLine(212, 274, 242, 304);
        g.drawLine(242, 272, 212, 302);
        g.drawLine(242, 273, 212, 303);
        g.drawLine(242, 274, 212, 304);
    }

    public void TC_17B3(Graphics g) {
        Font jk = new Font("Dialog", Font.PLAIN, 25);
        g.setColor(k6);
        g.fillRect(140, 285, 30, 10);
        g.fillOval(142, 273, 25, 30);
        g.setColor(k1);
        g.fillOval(144, 275, 21, 26);
        g.setColor(k6);
        g.setFont(jk);
        g.drawString("G", 146, 298);
        g.drawLine(140, 272, 170, 302);
        g.drawLine(140, 273, 170, 303);
        g.drawLine(140, 274, 170, 304);
        g.drawLine(170, 272, 140, 302);
        g.drawLine(170, 273, 140, 303);
        g.drawLine(170, 274, 140, 304);
    }

    public void TC_17B4(Graphics g) {
        Font jk = new Font("Dialog", Font.PLAIN, 25);
        g.setColor(k6);
        g.fillRect(176, 285, 30, 10);
        g.fillOval(178, 273, 25, 30);
        g.setColor(k1);
        g.fillOval(180, 275, 21, 26);
        g.setColor(k6);
        g.setFont(jk);
        g.drawString("G", 182, 298);
        g.drawLine(176, 272, 206, 302);
        g.drawLine(176, 273, 206, 303);
        g.drawLine(176, 274, 206, 304);
        g.drawLine(206, 272, 176, 302);
        g.drawLine(206, 273, 176, 303);
        g.drawLine(206, 274, 176, 304);
    }

    public void TC_17B5(Graphics g) {
        Font jk = new Font("Dialog", Font.PLAIN, 25);
        g.setColor(k6);
        g.fillRect(212, 285, 30, 10);
        g.fillOval(214, 273, 25, 30);
        g.setColor(k1);
        g.fillOval(216, 275, 21, 26);
        g.setColor(k6);
        g.setFont(jk);
        g.drawString("G", 218, 298);
        g.drawLine(212, 272, 242, 302);
        g.drawLine(212, 273, 242, 303);
        g.drawLine(212, 274, 242, 304);
        g.drawLine(242, 272, 212, 302);
        g.drawLine(242, 273, 212, 303);
        g.drawLine(242, 274, 212, 304);
    }

    public void TC_18B3(Graphics g) {
        Font jk = new Font("Dialog", Font.PLAIN, 25);
        g.setColor(k10);
        g.fillRect(140, 285, 30, 10);
        g.fillOval(142, 273, 25, 30);
        g.setColor(k1);
        g.fillOval(144, 275, 21, 26);
        g.setColor(k10);
        g.setFont(jk);
        g.drawString("G", 146, 298);
        g.drawLine(140, 272, 170, 302);
        g.drawLine(140, 273, 170, 303);
        g.drawLine(140, 274, 170, 304);
        g.drawLine(170, 272, 140, 302);
        g.drawLine(170, 273, 140, 303);
        g.drawLine(170, 274, 140, 304);
    }

    public void TC_18B4(Graphics g) {
        Font jk = new Font("Dialog", Font.PLAIN, 25);
        g.setColor(k10);
        g.fillRect(176, 285, 30, 10);
        g.fillOval(178, 273, 25, 30);
        g.setColor(k1);
        g.fillOval(180, 275, 21, 26);
        g.setColor(k10);
        g.setFont(jk);
        g.drawString("G", 182, 298);
        g.drawLine(176, 272, 206, 302);
        g.drawLine(176, 273, 206, 303);
        g.drawLine(176, 274, 206, 304);
        g.drawLine(206, 272, 176, 302);
        g.drawLine(206, 273, 176, 303);
        g.drawLine(206, 274, 176, 304);
    }

    public void TC_18B5(Graphics g) {
        Font jk = new Font("Dialog", Font.PLAIN, 25);
        g.setColor(k10);
        g.fillRect(212, 285, 30, 10);
        g.fillOval(214, 273, 25, 30);
        g.setColor(k1);
        g.fillOval(216, 275, 21, 26);
        g.setColor(k10);
        g.setFont(jk);
        g.drawString("G", 218, 298);
        g.drawLine(212, 272, 242, 302);
        g.drawLine(212, 273, 242, 303);
        g.drawLine(212, 274, 242, 304);
        g.drawLine(242, 272, 212, 302);
        g.drawLine(242, 273, 212, 303);
        g.drawLine(242, 274, 212, 304);
    }

    public void TC_19B3(Graphics g) {
        g.setColor(k6);
        int[] x1 = {141, 160, 170, 170, 163, 141};
        int[] y1 = {274, 274, 285, 295, 300, 300};
        g.fillPolygon(x1, y1, 6);
        g.fillOval(145, 295, 10, 10);
        g.setColor(k1);
        int[] x2 = {141, 160, 167, 167, 163, 141};
        int[] y2 = {277, 277, 285, 295, 297, 297};
        g.fillPolygon(x2, y2, 6);
        g.setColor(k6);
        int[] x3 = {145, 155, 160, 155, 150, 150, 145, 150, 150, 155, 158, 155, 145};
        int[] y3 = {280, 280, 285, 290, 290, 293, 289, 284, 288, 288, 285, 282, 282};
        g.fillPolygon(x3, y3, 13);
    }

    public void TC_19B4(Graphics g) {
        g.setColor(k6);
        int[] x1 = {177, 196, 206, 206, 199, 177};
        int[] y1 = {274, 274, 285, 295, 300, 300};
        g.fillPolygon(x1, y1, 6);
        g.fillOval(181, 295, 10, 10);
        g.setColor(k1);
        int[] x2 = {177, 196, 203, 203, 199, 177};
        int[] y2 = {277, 277, 285, 295, 297, 297};
        g.fillPolygon(x2, y2, 6);
        g.setColor(k6);
        int[] x3 = {181, 191, 196, 191, 186, 186, 181, 186, 186, 191, 194, 191, 181};
        int[] y3 = {280, 280, 285, 290, 290, 293, 289, 284, 288, 288, 285, 282, 282};
        g.fillPolygon(x3, y3, 13);
    }

    public void TC_19B5(Graphics g) {
        g.setColor(k6);
        int[] x1 = {213, 232, 242, 242, 235, 213};
        int[] y1 = {274, 274, 285, 295, 300, 300};
        g.fillPolygon(x1, y1, 6);
        g.fillOval(217, 295, 10, 10);
        g.setColor(k1);
        int[] x2 = {213, 232, 239, 239, 235, 213};
        int[] y2 = {277, 277, 285, 295, 297, 297};
        g.fillPolygon(x2, y2, 6);
        g.setColor(k6);
        int[] x3 = {217, 227, 232, 227, 222, 222, 217, 222, 222, 227, 230, 227, 217};
        int[] y3 = {280, 280, 285, 290, 290, 293, 289, 284, 288, 288, 285, 282, 282};
        g.fillPolygon(x3, y3, 13);
    }

    public void TC_21B3(Graphics g) {
        g.setColor(k10);
        int[] x1 = {141, 160, 170, 170, 163, 141};
        int[] y1 = {274, 274, 285, 295, 300, 300};
        g.fillPolygon(x1, y1, 6);
        g.fillOval(145, 295, 10, 10);
        g.setColor(k1);
        int[] x2 = {141, 160, 167, 167, 163, 141};
        int[] y2 = {277, 277, 285, 295, 297, 297};
        g.fillPolygon(x2, y2, 6);
        g.setColor(k10);
        int[] x3 = {145, 155, 160, 155, 150, 150, 145, 150, 150, 155, 158, 155, 145};
        int[] y3 = {280, 280, 285, 290, 290, 293, 289, 284, 288, 288, 285, 282, 282};
        g.fillPolygon(x3, y3, 13);
    }

    public void TC_21B4(Graphics g) {
        g.setColor(k10);
        int[] x1 = {177, 196, 206, 206, 199, 177};
        int[] y1 = {274, 274, 285, 295, 300, 300};
        g.fillPolygon(x1, y1, 6);
        g.fillOval(181, 295, 10, 10);
        g.setColor(k1);
        int[] x2 = {177, 196, 203, 203, 199, 177};
        int[] y2 = {277, 277, 285, 295, 297, 297};
        g.fillPolygon(x2, y2, 6);
        g.setColor(k10);
        int[] x3 = {181, 191, 196, 191, 186, 186, 181, 186, 186, 191, 194, 191, 181};
        int[] y3 = {280, 280, 285, 290, 290, 293, 289, 284, 288, 288, 285, 282, 282};
        g.fillPolygon(x3, y3, 13);
    }

    public void TC_21B5(Graphics g) {
        g.setColor(k10);
        int[] x1 = {213, 232, 242, 242, 235, 213};
        int[] y1 = {274, 274, 285, 295, 300, 300};
        g.fillPolygon(x1, y1, 6);
        g.fillOval(217, 295, 10, 10);
        g.setColor(k1);
        int[] x2 = {213, 232, 239, 239, 235, 213};
        int[] y2 = {277, 277, 285, 295, 297, 297};
        g.fillPolygon(x2, y2, 6);
        g.setColor(k10);
        int[] x3 = {217, 227, 232, 227, 222, 222, 217, 222, 222, 227, 230, 227, 217};
        int[] y3 = {280, 280, 285, 290, 290, 293, 289, 284, 288, 288, 285, 282, 282};
        g.fillPolygon(x3, y3, 13);
    }

    public void TC_20B3(Graphics g) {
        g.setColor(k6);
        int[] x1 = {141, 160, 170, 170, 163, 141};
        int[] y1 = {274, 274, 285, 295, 300, 300};
        g.fillPolygon(x1, y1, 6);
        g.fillOval(145, 295, 10, 10);
        g.setColor(k1);
        int[] x2 = {141, 160, 167, 167, 163, 141};
        int[] y2 = {277, 277, 285, 295, 297, 297};
        g.fillPolygon(x2, y2, 6);
        g.setColor(k6);
        int[] x3 = {170, 162, 155, 150, 150, 145, 150, 150, 155, 162, 170};
        int[] y3 = {278, 278, 285, 285, 281, 286, 291, 288, 288, 281, 281};
        g.fillPolygon(x3, y3, 11);
    }

    public void TC_20B4(Graphics g) {
        g.setColor(k6);
        int[] x1 = {177, 196, 206, 206, 199, 177};
        int[] y1 = {274, 274, 285, 295, 300, 300};
        g.fillPolygon(x1, y1, 6);
        g.fillOval(181, 295, 10, 10);
        g.setColor(k1);
        int[] x2 = {177, 196, 203, 203, 199, 177};
        int[] y2 = {277, 277, 285, 295, 297, 297};
        g.fillPolygon(x2, y2, 6);
        g.setColor(k6);
        int[] x3 = {206, 198, 191, 186, 186, 181, 186, 186, 191, 198, 206};
        int[] y3 = {278, 278, 285, 285, 281, 286, 291, 288, 288, 281, 281};
        g.fillPolygon(x3, y3, 11);
    }

    public void TC_20B5(Graphics g) {
        g.setColor(k6);
        int[] x1 = {213, 232, 242, 242, 235, 213};
        int[] y1 = {274, 274, 285, 295, 300, 300};
        g.fillPolygon(x1, y1, 6);
        g.fillOval(217, 295, 10, 10);
        g.setColor(k1);
        int[] x2 = {213, 232, 239, 239, 235, 213};
        int[] y2 = {277, 277, 285, 295, 297, 297};
        g.fillPolygon(x2, y2, 6);
        g.setColor(k6);
        int[] x3 = {242, 234, 227, 222, 222, 217, 222, 222, 227, 234, 242};
        int[] y3 = {278, 278, 285, 285, 281, 286, 291, 288, 288, 281, 281};
        g.fillPolygon(x3, y3, 11);
    }

    public void TC_22B3(Graphics g) {
        g.setColor(k10);
        int[] x1 = {141, 160, 170, 170, 163, 141};
        int[] y1 = {274, 274, 285, 295, 300, 300};
        g.fillPolygon(x1, y1, 6);
        g.fillOval(145, 295, 10, 10);
        g.setColor(k1);
        int[] x2 = {141, 160, 167, 167, 163, 141};
        int[] y2 = {277, 277, 285, 295, 297, 297};
        g.fillPolygon(x2, y2, 6);
        g.setColor(k10);
        int[] x3 = {170, 162, 155, 150, 150, 145, 150, 150, 155, 162, 170};
        int[] y3 = {278, 278, 285, 285, 281, 286, 291, 288, 288, 281, 281};
        g.fillPolygon(x3, y3, 11);
    }

    public void TC_22B4(Graphics g) {
        g.setColor(k10);
        int[] x1 = {177, 196, 206, 206, 199, 177};
        int[] y1 = {274, 274, 285, 295, 300, 300};
        g.fillPolygon(x1, y1, 6);
        g.fillOval(181, 295, 10, 10);
        g.setColor(k1);
        int[] x2 = {177, 196, 203, 203, 199, 177};
        int[] y2 = {277, 277, 285, 295, 297, 297};
        g.fillPolygon(x2, y2, 6);
        g.setColor(k10);
        int[] x3 = {206, 198, 191, 186, 186, 181, 186, 186, 191, 198, 206};
        int[] y3 = {278, 278, 285, 285, 281, 286, 291, 288, 288, 281, 281};
        g.fillPolygon(x3, y3, 11);
    }

    public void TC_22B5(Graphics g) {
        g.setColor(k10);
        int[] x1 = {213, 232, 242, 242, 235, 213};
        int[] y1 = {274, 274, 285, 295, 300, 300};
        g.fillPolygon(x1, y1, 6);
        g.fillOval(217, 295, 10, 10);
        g.setColor(k1);
        int[] x2 = {213, 232, 239, 239, 235, 213};
        int[] y2 = {277, 277, 285, 295, 297, 297};
        g.fillPolygon(x2, y2, 6);
        g.setColor(k10);
        int[] x3 = {242, 234, 227, 222, 222, 217, 222, 222, 227, 234, 242};
        int[] y3 = {278, 278, 285, 285, 281, 286, 291, 288, 288, 281, 281};
        g.fillPolygon(x3, y3, 11);
    }

    int kolor = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        kolor++;
    }

}

    
   
    
    


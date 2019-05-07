/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kosut;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;

/**
 *
 * @author User
 */
public class Wskazowka1 extends Path2D.Double {
    int clicked = 1;
    
    // bieżący kąt
    private double angle = -54;

    // współrzędne początku figury (środek prawej krawędzi strzałki)
    int x0, y0;

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

    public Wskazowka1(int x0, int y0, int w1, int h1, int w2, int h2) {
        this.x0 = x0;
        this.y0 = y0;

        moveTo(x0, y0);
        lineTo(x0, y0 + h1 / 2);
        lineTo(x0 - w1, y0 + h1 / 2);
        lineTo(x0 - w1 - 8, y0 + h2 / 2);
        lineTo(x0 - w2, y0 + h2 / 2);
        lineTo(x0 - w2, y0 - h2 / 2);
        lineTo(x0 - w1 - 8, y0 - h2 / 2);
        lineTo(x0 - w1, y0 - h1 / 2);
        lineTo(x0, y0 - h1 / 2);
        lineTo(x0, y0);

        closePath();

    }

    public void rysuj(Graphics g) {
        if( angle < 64)
            g.setColor(k6);
        else
        if( angle >= 64 && angle<69)
            g.setColor(k10);
        else
            if( angle >= 69 && angle<76)
            g.setColor(k11);
        else
            g.setColor(Color.RED);
            
        
        g.fillOval(169, 140, 50, 50);
        Graphics2D g2d = (Graphics2D) g.create();

        Shape shape = getTransformedInstance();

        g2d.fill(shape);

        g2d.draw(shape);

        g2d.dispose();

    }

    public void obroc(double delta) {
        if (angle >= -54 && angle <= 235) {
            angle += delta;

        }

    }

    public Shape getTransformedInstance() {
        AffineTransform at = new AffineTransform();
        at.rotate(Math.toRadians(angle), x0, y0);
        //at.translate(x0, y0);
        return createTransformedShape(at);

    }
}

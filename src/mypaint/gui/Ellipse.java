/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypaint.gui;


import java.awt.Graphics2D;

/**
 *
 * @author otonr
 */
public class Ellipse extends GeometricShapes{   
    
    @Override
    public void draw (Graphics2D g2d){
        g2d = (Graphics2D) g2d.create();
        
        int xInitialDraw = xInitial <= xEnd ? xInitial : xEnd;
        int xEndDraw = xInitial <= xEnd ? xEnd : xInitial;
        int yInitialDraw = yInitial <= yEnd ? yInitial : yEnd;
        int yEndDraw = yInitial <= yEnd ? yEnd : yInitial;
        
        
        if (colorFill != null){
            g2d.setColor(colorFill);
            g2d.fillOval(xInitialDraw, yInitialDraw, xEndDraw - xInitialDraw, yEndDraw - yInitialDraw);
        }
        if (colorContour != null){
            g2d.setColor(colorContour);
            g2d.drawOval(xInitialDraw, yInitialDraw, xEndDraw - xInitialDraw, yEndDraw - yInitialDraw);
        }
        
    }


    
}

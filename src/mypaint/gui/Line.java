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
public class Line extends GeometricShapes{
    
    @Override
    public void draw (Graphics2D g2d){
        g2d = (Graphics2D) g2d.create();
        
        if (colorContour != null){
            g2d.setColor( colorContour);
            g2d.drawLine(xInitial, yInitial, xEnd, yEnd);
        }
        
        g2d.dispose();
    }

}

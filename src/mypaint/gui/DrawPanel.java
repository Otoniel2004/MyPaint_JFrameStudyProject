/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypaint.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author otonr
 */
public class DrawPanel extends JPanel {
    
    private List<GeometricShapes> shapes;
    private GeometricShapes tempShapes;
    
    public DrawPanel() {
        shapes = new ArrayList<>();

    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2d.setColor( Color.WHITE);
        g2d.fillRect(0, 0, getWidth(), getHeight()); 
        g2d.setColor( Color.BLACK);
        
        for (GeometricShapes GeometricShapes : shapes){
            GeometricShapes.draw(g2d);            
        }
        
        if ( tempShapes != null){
            tempShapes.draw(g2d);
        }
        
        g2d.setColor( Color.BLACK);
        g2d.drawRect(0, 0, getWidth(), getHeight()); 
        g2d.dispose();
    }
    
    public void addGeometricShapes(GeometricShapes shapes1) {
        shapes.add(shapes1);
    }

    public void setTempShapes(GeometricShapes tempShapes) {
        this.tempShapes = tempShapes;
    }
       
}

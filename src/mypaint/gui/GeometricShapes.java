/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypaint.gui;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author otonr
 */
public abstract class GeometricShapes {
    
    protected int xInitial;
    protected int yInitial;
    protected int xEnd;
    protected int yEnd;
    protected Color colorContour;
    protected Color colorFill;
    
    public GeometricShapes(){
        colorContour = Color.BLACK;
        colorFill = Color.WHITE;
    }
    
    public abstract void draw(Graphics2D g2d);

    public int getxInitial() {
        return xInitial;
    }

    public void setxInitial(int xInitial) {
        this.xInitial = xInitial;
    }

    public int getyInitial() {
        return yInitial;
    }

    public void setyInitial(int yInitial) {
        this.yInitial = yInitial;
    }

    public int getxEnd() {
        return xEnd;
    }

    public void setxEnd(int xEnd) {
        this.xEnd = xEnd;
    }

    public int getyEnd() {
        return yEnd;
    }

    public void setyEnd(int yEnd) {
        this.yEnd = yEnd;
    }

    public Color getColorContour() {
        return colorContour;
    }

    public void setColorContour(Color colorContour) {
        this.colorContour = colorContour;
    }

    public Color getColorFill() {
        return colorFill;
    }

    public void setColorFill(Color colorFill) {
        this.colorFill = colorFill;
    }

    
    
}

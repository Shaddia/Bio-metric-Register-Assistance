/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bra;

import javax.swing.ImageIcon;

/**
 *
 * @author SISTEMAS
 */
public class lblImagenHuella {

    public static void setIcon(ImageIcon imageIcon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private float Width;
    private float Height;

    public lblImagenHuella() {
    }

    public lblImagenHuella(float Width, float Height) {
        this.Width = Width;
        this.Height = Height;
    }

    public float getWidth() {
        return Width;
    }

    public void setWidth(float Width) {
        this.Width = Width;
    }

    public float getHeight() {
        return Height;
    }

    public void setHeight(float Height) {
        this.Height = Height;
    }

    @Override
    public String toString() {
        return "lblImagenHuella{" + "Width=" + Width + ", Height=" + Height + '}';
    }
}

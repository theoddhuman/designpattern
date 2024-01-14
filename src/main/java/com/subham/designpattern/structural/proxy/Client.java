package com.subham.designpattern.structural.proxy;

import java.awt.geom.Point2D;

/**
 * @author subham.paul
 * 
 * We need to provide a palceholder or surrogate to anothe object.
 * 
 * Proxy acts on behalf of the object. We can create the original object on demand.
 */
public class Client {
    public static void main(String[] args) {
        Image img = ImageFactory.getImage("A1.bmp");
        Point2D point2D = new Point2D.Double(1, 2);
        img.setLocation(point2D);
        System.out.println("Image location :"+img.getLocation());
        System.out.println("rendering image now.....");
        img.render();
    }
}

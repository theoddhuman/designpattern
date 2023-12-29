package com.subham.designpattern.structural.proxy.dynamic;

import com.subham.designpattern.structural.proxy.Image;

import java.awt.geom.Point2D;

/**
 * @author subham.paul
 */
public class Client {
    public static void main(String[] args) {
        Image img = ImageFactory.getImage("A.bmp");
        img.setLocation(new Point2D.Double(-10, 0));
        System.out.println(img.getLocation());
        System.out.println("*****************************");
        img.render();
    }
}

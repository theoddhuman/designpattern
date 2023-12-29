package com.subham.designpattern.structural.proxy;


import java.awt.geom.Point2D;

/**
 * @author subham.paul
 *
 * Interface implemented by proxy and concrete objects
 */
public interface Image {
    void setLocation(Point2D point2d);

    Point2D getLocation();

    void render();
}

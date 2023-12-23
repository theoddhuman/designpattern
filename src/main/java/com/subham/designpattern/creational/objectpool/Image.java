package com.subham.designpattern.creational.objectpool;

/**
 * @author subham.paul
 *
 * Represents our abstract reusable
 */
public interface Image extends Poolable {
    void draw();

    Point2D getLocation();

    void setLocation(Point2D location);
}

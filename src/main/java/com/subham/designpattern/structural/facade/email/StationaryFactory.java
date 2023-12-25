package com.subham.designpattern.structural.facade.email;

/**
 * @author subham.paul
 */
public class StationaryFactory {
    public static Stationary createStationary() {
        return new HalloweenStationary();
    }
}

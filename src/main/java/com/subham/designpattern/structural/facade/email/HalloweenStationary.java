package com.subham.designpattern.structural.facade.email;

/**
 * @author subham.paul
 */
public class HalloweenStationary implements Stationary {
    @Override
    public String getHeader() {
        return "It's Halloween!!";
    }

    @Override
    public String getFooter() {
        return "BUY MORE STUFF! It's Halloween, c'mon!!";
    }
}

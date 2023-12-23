package com.subham.designpattern.creational.prototype;

/**
 * @author subham.paul
 */
public class Swordsman extends GameUnit {
    private String state = "idle";

    private UnitType unitType;

    public void attack() {
        this.state = "attacking";
    }

    @Override
    public String toString() {
        return "Swordsman " + state + " @ " + getPosition();
    }

    @Override
    protected void reset() {
        state = "idle";
        unitType = UnitType.SWORDSMAN;
    }
}
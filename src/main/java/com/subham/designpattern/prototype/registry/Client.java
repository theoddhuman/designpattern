package com.subham.designpattern.prototype.registry;

import com.subham.designpattern.prototype.Major;
import com.subham.designpattern.prototype.Swordsman;
import com.subham.designpattern.prototype.UnitType;

/**
 * @author subham.paul
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        GameUnitRegistry.load();
        Swordsman swordsman = (Swordsman) GameUnitRegistry.getGameUnit(UnitType.SWORDSMAN);
        System.out.println(swordsman);

        Major major = (Major) GameUnitRegistry.getGameUnit(UnitType.MAJOR);
        System.out.println(major);
    }
}

package com.subham.designpattern.creational.prototype.registry;

import com.subham.designpattern.creational.prototype.Major;
import com.subham.designpattern.creational.prototype.Swordsman;
import com.subham.designpattern.creational.prototype.UnitType;

/**
 * @author subham.paul
 * 
 * We cna maintain a regsitry of prototypes based on the type of instances.
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

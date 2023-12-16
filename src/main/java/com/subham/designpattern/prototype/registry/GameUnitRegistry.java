package com.subham.designpattern.prototype.registry;

import com.subham.designpattern.prototype.GameUnit;
import com.subham.designpattern.prototype.Major;
import com.subham.designpattern.prototype.Swordsman;
import com.subham.designpattern.prototype.UnitType;

import java.util.HashMap;
import java.util.Map;

/**
 * @author subham.paul
 */
public class GameUnitRegistry {
    private static Map<UnitType, GameUnit> gameUnitMap = new HashMap<>();

    public static void load() {
        Swordsman swordsman = new Swordsman();
        gameUnitMap.put(UnitType.SWORDSMAN, swordsman);

        Major major = new Major();
        gameUnitMap.put(UnitType.MAJOR, major);
    }

    public static GameUnit getGameUnit(UnitType unitType) throws CloneNotSupportedException {
        return gameUnitMap.get(unitType).clone();
    }
}

package com.subham.designpattern.creational.prototype;

/**
 * @author subham.paul
 * 
 * We have a complex object that is costly to create. to create more instances of such class, we use an 
 * existing instance a sour protoype.
 * 
 * Prototype will allow us to make copies of existing object and save us from having to create objects
 * from scratch.
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman s1 = new Swordsman();
        s1.move(new Point3D(-10,0,0), 20);
        s1.attack();
        System.out.println(s1);

        Swordsman s2 = (Swordsman) s1.clone();
        System.out.println(s2);
    }
}

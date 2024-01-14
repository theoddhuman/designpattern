package com.subham.designpattern.creational.objectpool;

/**
 * @author subham.paul
 * 
 * In our system if cost of creating an instance of a class is high and we need a large no of objects
 * of this class for short duration, then we can use object pool.
 * 
 * We either pre-crete objects of the class or collect unsused instances in an in-memory cache.
 * When code needs and object of this class we provide it from its cache.
 */
public class Client {
    public static final ObjectPool<BitMap> bitMapPool = new ObjectPool<>(()->new BitMap("Logo"), 10);
    public static void main(String[] args) {
        BitMap b1 = bitMapPool.get();
        b1.setLocation(new Point2D(10, 10));
        BitMap b2 = bitMapPool.get();
        b2.setLocation(new Point2D(-10, 0));

        b1.draw();
        b2.draw();

        bitMapPool.release(b1);
        bitMapPool.release(b2);
    }
}

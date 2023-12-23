package com.subham.designpattern.objectpool;

/**
 * @author subham.paul
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

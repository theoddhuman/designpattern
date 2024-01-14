package com.subham.designpattern.creational.simplefactory;

/**
 * @author subham.paul
 * 
 * Move the instantiation logic to a separate class and most commonly to a static method of this class.
 */
public class Client {
    public static void main(String[] args) {
        Post post = PostFactory.createPost("news");
        System.out.println(post);
    }
}

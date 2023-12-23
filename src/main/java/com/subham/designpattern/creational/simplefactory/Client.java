package com.subham.designpattern.creational.simplefactory;

/**
 * @author subham.paul
 */
public class Client {
    public static void main(String[] args) {
        Post post = PostFactory.createPost("news");
        System.out.println(post);
    }
}

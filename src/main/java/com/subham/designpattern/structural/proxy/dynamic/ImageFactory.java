package com.subham.designpattern.structural.proxy.dynamic;

import com.subham.designpattern.structural.proxy.Image;

import java.lang.reflect.Proxy;

/**
 * @author subham.paul
 *
 * Factory to get image objects.
 */
public class ImageFactory {
    //We'll provide proxy to caller instead of real object

    public static Image getImage(String name) {
        return (Image) Proxy.newProxyInstance(ImageFactory.class.getClassLoader(), new Class[]{Image.class}, new ImageInvocationHandler(name));
    }
}

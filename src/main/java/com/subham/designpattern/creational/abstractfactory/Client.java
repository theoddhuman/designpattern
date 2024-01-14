package com.subham.designpattern.creational.abstractfactory;

import com.subham.designpattern.creational.abstractfactory.aws.AwsResourceFactory;
import com.subham.designpattern.creational.abstractfactory.gcp.GoogleResourceFactory;

/**
 * @author subham.paul
 * 
 * Define an interface or abstract class for creating families of related (or dependent) 
 * objects but without specifying their concrete sub-classes.
 * 
 * Isolates the client code from concrete classes.
 */
public class Client {
    private ResourceFactory resourceFactory;

    public Client(ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }

    public Instance createServer(Instance.Capacity capacity, int mib) {
        Instance instance = resourceFactory.createInstance(capacity);
        Storage storage = resourceFactory.createStorage(mib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance instance = aws.createServer(Instance.Capacity.large, 20480);
        instance.start();
        instance.stop();

        System.out.println("################################");
        Client gcp = new Client(new GoogleResourceFactory());
        Instance instance1 = gcp.createServer(Instance.Capacity.small, 10420);
        instance1.start();
        instance1.stop();
    }
}

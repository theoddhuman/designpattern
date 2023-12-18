package com.subham.designpattern.abstractfactory;

import com.subham.designpattern.abstractfactory.aws.AwsResourceFactory;
import com.subham.designpattern.abstractfactory.gcp.GoogleResourceFactory;

/**
 * @author subham.paul
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

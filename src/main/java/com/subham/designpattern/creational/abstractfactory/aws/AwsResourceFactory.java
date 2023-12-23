package com.subham.designpattern.creational.abstractfactory.aws;

import com.subham.designpattern.creational.abstractfactory.Instance;
import com.subham.designpattern.creational.abstractfactory.ResourceFactory;
import com.subham.designpattern.creational.abstractfactory.Storage;

/**
 * @author subham.paul
 *
 * Factory implementation for Google cloud platform resources
 */
public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
}

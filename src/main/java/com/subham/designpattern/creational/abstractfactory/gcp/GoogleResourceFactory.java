package com.subham.designpattern.creational.abstractfactory.gcp;

import com.subham.designpattern.creational.abstractfactory.Instance;
import com.subham.designpattern.creational.abstractfactory.ResourceFactory;
import com.subham.designpattern.creational.abstractfactory.Storage;

/**
 * @author subham.paul
 *
 * Factory implementation for Google cloud platform resources
 */
public class GoogleResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}

package com.subham.designpattern.abstractfactory.gcp;

import com.subham.designpattern.abstractfactory.Instance;
import com.subham.designpattern.abstractfactory.ResourceFactory;
import com.subham.designpattern.abstractfactory.Storage;

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

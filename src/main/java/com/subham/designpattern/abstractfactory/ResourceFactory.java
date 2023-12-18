package com.subham.designpattern.abstractfactory;

/**
 * @author subham.paul
 *
 * Abstract factory with methods defined for each object type.
 */
public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capMib);
}

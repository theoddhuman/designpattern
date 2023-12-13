package com.subham.designpattern.factorymethod.message;

/**
 * @author subham.paul
 */
public class JsonMessage extends Message {
    @Override
    public String getContent() {
        return "{\"JSON]\":[]}";
    }
}

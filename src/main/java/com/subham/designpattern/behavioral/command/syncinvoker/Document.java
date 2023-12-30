package com.subham.designpattern.behavioral.command.syncinvoker;

/**
 * @author subham.paul
 *
 * This is receiver
 */
public class Document {
    public void open(String docName, String mode) {
        System.out.println("Document " + docName + " Opened in " + mode + " mode.");
    }

    public void save(String docName) {
        System.out.println("Document " + docName + " Opened");
    }
}

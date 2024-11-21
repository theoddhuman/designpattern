package com.subham.designpattern.structural.flyweight;

/**
 * @author subham.paul
 *
 * A concrete Flyweight. Instance is shared
 */
public class SystemErrorMessage implements ErrorMessage {
    //some error message $errorCode
    //intrinsic state
    private String messageTemplate;

    //http://somedomain.com/help?error=
    //intrinsic state
    private String helpUrlBase;

    public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }

    @Override
    public String getText(String code) {
        return messageTemplate.replace("$errorCode", code) + helpUrlBase+code;
    }
}

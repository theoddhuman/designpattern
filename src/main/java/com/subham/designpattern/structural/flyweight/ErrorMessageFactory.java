package com.subham.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author subham.paul
 *
 * Flyweight factory. Returns shared flyweight based on key
 */
public class ErrorMessageFactory {
    //This serves as key for getting flyweight instance
    public enum ErrorType {GenericSystemError, PageNotFoundError, ServerError}

    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

    public static ErrorMessageFactory getInstance() {
        return FACTORY;
    }

    private Map<ErrorType, SystemErrorMessage> systemErrorMessages = new HashMap<>();

    private ErrorMessageFactory() {
    }

    public SystemErrorMessage getError(ErrorType type) {
        if(!systemErrorMessages.containsKey(type)) {
            if(type.equals(ErrorType.GenericSystemError)) {
                systemErrorMessages.put(ErrorType.GenericSystemError,
                        new SystemErrorMessage("A genetic error of type $errorCode occured. Please refer to:\n",
                                "http://google.com/q="));
            } else if (type.equals(ErrorType.PageNotFoundError)) {
                systemErrorMessages.put(ErrorType.PageNotFoundError,
                        new SystemErrorMessage("Page not foun. An error of type $errorCode occured. Please refer to:\n",
                                "http://google.com/q="));
            }
        }
        return systemErrorMessages.get(type);
    }

    public UserBannedErrorMessage getUserBannedMessage(String caseId) {
        return new UserBannedErrorMessage(caseId);
    }
}

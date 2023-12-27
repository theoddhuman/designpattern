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
        systemErrorMessages.put(ErrorType.GenericSystemError,
                new SystemErrorMessage("A genetic error of type $errorCode occured. Please refer to:\n",
                        "http://google.com/q="));
        systemErrorMessages.put(ErrorType.PageNotFoundError,
                new SystemErrorMessage("Page not foun. An error of type $errorCode occured. Please refer to:\n",
                        "http://google.com/q="));
    }

    public SystemErrorMessage getError(ErrorType type) {
        return systemErrorMessages.get(type);
    }

    public UserBannedErrorMessage getUserBannedMessage(String caseId) {
        return new UserBannedErrorMessage(caseId);
    }
}

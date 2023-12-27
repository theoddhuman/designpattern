package com.subham.designpattern.structural.flyweight;

/**
 * @author subham.paul
 */
public class Client {
    public static void main(String[] args) {
        SystemErrorMessage errorMessage1 = ErrorMessageFactory.getInstance().getError(ErrorMessageFactory.ErrorType.GenericSystemError);
        System.out.println(errorMessage1.getText("1234"));

        ErrorMessage errorMessage2 = ErrorMessageFactory.getInstance().getUserBannedMessage("1245");
        System.out.println(errorMessage2.getText(null));
    }
}

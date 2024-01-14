package com.subham.designpattern.structural.flyweight;

/**
 * @author subham.paul
 * 
 * Our system needs a large number of objects of a particular class and maintaining these instances
 * is a performance concern.
 * 
 * Flyweight allows us to share an object in multiple contexts. But instead of sharing entire object,
 * which may not be feasible, we divide object state in two parts: intrinsic ( state taht is shared inn
 * every context) and extrinsic state (context specific state). We create objetcs with only intrinsic
 * state and share them in multiple contexts.
 */
public class Client {
    public static void main(String[] args) {
        SystemErrorMessage errorMessage1 = ErrorMessageFactory.getInstance().getError(ErrorMessageFactory.ErrorType.GenericSystemError);
        System.out.println(errorMessage1.getText("1234"));

        ErrorMessage errorMessage2 = ErrorMessageFactory.getInstance().getUserBannedMessage("1245");
        System.out.println(errorMessage2.getText(null));
    }
}

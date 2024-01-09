package com.subham.designpattern.behavioral.interpreter;

/**
 * @author subham.paul
 *
 * Abstract expression
 */
public interface PermissionExpression {
    boolean interpret(User user);
}

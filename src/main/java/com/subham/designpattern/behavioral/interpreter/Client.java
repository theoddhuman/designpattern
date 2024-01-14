package com.subham.designpattern.behavioral.interpreter;

/**
 * @author subham.paul
 * 
 * We use interpreter when we want to process a simple language with rules or grammar.
 * 
 * Interpreter allows us to represent the rules of language or grammar in a dtat structure and then
 * interpret sentences in that language.
 */
public class Client {
    public static void main(String[] args) {
        Report report1  = new Report("Cashflow report", "USER OR ADMIN");

        ExpressionBuilder builder = new ExpressionBuilder();
        PermissionExpression  exp = builder.build(report1);
        System.out.println(exp);

        User user1 = new User("Dave", "USER");

        System.out.println("USer access report:"+ exp.interpret(user1));
    }
}

package com.subham.designpattern.behavioral.visitor;

/**
 * @author subham.paul
 */
public interface Visitor {
    void visit(Programmer programmer);

    void visit(ProjectLead lead);

    void visit(Manager manager);

    void visit(VicePresident vp);
}

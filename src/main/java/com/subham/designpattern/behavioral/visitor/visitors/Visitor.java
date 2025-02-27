package com.subham.designpattern.behavioral.visitor.visitors;

import com.subham.designpattern.behavioral.visitor.objects.Manager;
import com.subham.designpattern.behavioral.visitor.objects.Programmer;
import com.subham.designpattern.behavioral.visitor.objects.ProjectLead;
import com.subham.designpattern.behavioral.visitor.objects.VicePresident;

/**
 * @author subham.paul
 */
public interface Visitor {
    void visit(Programmer programmer);

    void visit(ProjectLead lead);

    void visit(Manager manager);

    void visit(VicePresident vp);
}

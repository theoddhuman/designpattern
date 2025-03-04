package com.subham.designpattern.behavioral.visitor.visitors;

import com.subham.designpattern.behavioral.visitor.*;
import com.subham.designpattern.behavioral.visitor.objects.*;

import java.util.Map;

/**
 * @author subham.paul
 */
public class PrintVisitor implements Visitor {
    private Map<Integer, PerformanceRating> ratings;

    public PrintVisitor() {}

    public PrintVisitor(Map<Integer, PerformanceRating> ratings) {
        this.ratings = ratings;
    }

    @Override
    public void visit(Programmer programmer) {
        String msg = programmer.getName() +" is a " + programmer.getSkill()+" programmer.";
        msg += getRatings(programmer);
        System.out.println(msg);
    }

    @Override
    public void visit(ProjectLead lead) {
        String msg  = lead.getName()+" is a Project Lead with "+lead.getDirectReports().size()+" programmers reporting.";
        msg += getRatings(lead);
        System.out.println(msg);
    }

    @Override
    public void visit(Manager manager) {
        String msg = manager.getName()+" is a Manager with "+manager.getDirectReports().size()+" leads reporting.";
        msg += getRatings(manager);
        System.out.println(msg);
    }

    @Override
    public void visit(VicePresident vp) {
        String msg = vp.getName()+" is a Vice President with "+vp.getDirectReports().size()+" managers reporting.";
        msg += getRatings(vp);
        System.out.println(msg);

    }

    private String getRatings(Employee emp) {
        if(ratings !=null) {
            return "\n\tRatings: Personal="+emp.getPerformanceRating()
                    +"  Final="+ratings.get(emp.getEmployeeId());
        } else {
            return "";
        }
    }
}

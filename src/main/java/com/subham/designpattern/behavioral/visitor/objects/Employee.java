package com.subham.designpattern.behavioral.visitor.objects;

import com.subham.designpattern.behavioral.visitor.visitors.Visitor;

import java.util.Collection;

/**
 * @author subham.paul
 */
public interface Employee {
    int getPerformanceRating();

    void setPerformanceRating(int rating);

    Collection<Employee> getDirectReports();

    int getEmployeeId();

    void accept(Visitor visitor);
}

package com.subham.designpattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author subham.paul
 */
public class Manager extends AbstractEmployee {
    private List<Employee> directReports = new ArrayList<>();

    public Manager(String name,Employee...employees) {
        super(name);
        Arrays.stream(employees).forEach(directReports::add);
    }

    @Override
    public Collection<Employee> getDirectReports() {
        return directReports;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

package com.subham.designpattern.behavioral.visitor.objects;

import com.subham.designpattern.behavioral.visitor.visitors.Visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author subham.paul
 */
public class VicePresident extends AbstractEmployee {
    private final List<Employee> directReports = new ArrayList<>();

    public VicePresident(String name, Employee...employees) {
        super(name);
        directReports.addAll(Arrays.asList(employees));
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

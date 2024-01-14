package com.subham.designpattern.structural.adapter;

/**
 * @author subham.paul
 * 
 * We have an existing object which provides the functionality the client needs.
 * But client code can't use this object because it expects an object with different interface.
 * 
 * Using adapter design pattern we make this existing object work with client by adpating the object
 * to client's expected interface.
 * 
 * Two types of adapter - Class Adapter and Object Adapter
 */
public class Client {
    public static void main(String[] args) {
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();
        System.out.println(businessCardDesigner.designCard(adapter));

        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter adapter1 = new EmployeeObjectAdapter(employee);
        BusinessCardDesigner businessCardDesigner1 = new BusinessCardDesigner();
        System.out.println(businessCardDesigner1.designCard(adapter1));

    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Elliot Alderson");
        employee.setJobTitle("Security Engineer");
        employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
    }
}

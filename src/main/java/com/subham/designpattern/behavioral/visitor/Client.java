package com.subham.designpattern.behavioral.visitor;

import com.subham.designpattern.behavioral.visitor.objects.Employee;
import com.subham.designpattern.behavioral.visitor.visitors.AppraisalVisitor;
import com.subham.designpattern.behavioral.visitor.visitors.PrintVisitor;
import com.subham.designpattern.behavioral.visitor.visitors.Visitor;

import java.util.Date;
import java.util.Random;

/**
 * @author subham.paul
 * 
 * This pattern allows us to define new operations that can vbe performed on an object without
 * changing the class definition of the object.
 * 
 * Think of this pattern as an object (visitor) that visits all nodes in an object structure.
 * Each time our visitor visits a particular object from the object structure, the object calls
 * a specific mehtod on visitor, passing itself as an argument.
 * 
 * Each time we need a new operation we create a subclass of visitor, implement the operation in
 * that class and visit object structure.
 * 
 */
public class Client {
    public static void main(String[] args) {
        Employee emps = OrgStructure.buildOrganization();

        Visitor visitor = new PrintVisitor();
        visitOrgStructure(emps, visitor);
        System.out.println("***************************************");

        //Perform a fake appraisal
        appraisal(emps, new Random(new Date().getTime()));

        AppraisalVisitor visitor2 = new AppraisalVisitor();
        //Carry out final appraisal where we consider team performance
        visitOrgStructure(emps, visitor2);

        //create new print visitor with final ratings taken from appraisal visitor
        visitor = new PrintVisitor(visitor2.getFinalRatings());
        visitOrgStructure(emps, visitor);
    }

    private static void visitOrgStructure(Employee emp, Visitor visitor) {
        emp.accept(visitor);
        emp.getDirectReports().forEach(e -> visitOrgStructure(e, visitor));
    }

    //This method assigns some random values to performance rating field of employees
    private static void appraisal(Employee emp, Random random) {
        int rating = random.nextInt(6);
        emp.setPerformanceRating(Math.max(rating, 1));
        emp.getDirectReports().forEach(r -> appraisal(r, random));
    }
}

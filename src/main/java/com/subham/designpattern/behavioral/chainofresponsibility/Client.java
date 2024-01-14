package com.subham.designpattern.behavioral.chainofresponsibility;

import java.time.LocalDate;

/**
 * @author subham.paul
 * 
 * Typically the code which wants some request handled calls the exact method on an exact object to 
 * process it, thus the tight coupling. Chain of responsibility solves this problem by giving more 
 * than one object, chance to process the request.
 * 
 * We create objects which are chained together by one object knowing reference of object which is next in chain.
 * We give request to first object in chain, if it can't handle that it simply passes the request
 * down the chain.
 */
public class Client {
    public static void main(String[] args) {
        LeaveApplication application = LeaveApplication.getBuilder().withType(LeaveApplication.Type.Sick)
                .from(LocalDate.now()).to(LocalDate.of(2024, 2, 28))
                .build();
        System.out.println(application);
        System.out.println("**************************************************");
        LeaveApprover leaveApprover = createChain();
        leaveApprover.processLeaveApplication(application);
        System.out.println(application);
    }

    private static LeaveApprover createChain() {
        Director director = new Director(null);
        Manager manager = new Manager(director);
        ProjectLead projectLead = new ProjectLead(manager);
        return projectLead;
    }
}

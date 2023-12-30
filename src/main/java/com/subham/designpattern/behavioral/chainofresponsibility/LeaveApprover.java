package com.subham.designpattern.behavioral.chainofresponsibility;

/**
 * @author subham.paul
 *
 * This represents a handler in chain of responsibility
 */
public interface LeaveApprover {
    void processLeaveApplication(LeaveApplication application);

    String getApproverRole();
}

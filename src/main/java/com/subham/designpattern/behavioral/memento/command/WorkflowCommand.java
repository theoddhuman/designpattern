package com.subham.designpattern.behavioral.memento.command;

/**
 * @author subham.paul
 */
public interface WorkflowCommand {
    void execute();

    void undo();
}

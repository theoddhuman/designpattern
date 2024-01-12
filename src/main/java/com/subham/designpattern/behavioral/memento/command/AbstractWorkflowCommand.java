package com.subham.designpattern.behavioral.memento.command;

import com.subham.designpattern.behavioral.memento.WorkflowDesigner;

/**
 * @author subham.paul
 *
 * care taker
 */
public abstract class AbstractWorkflowCommand implements WorkflowCommand {
    protected WorkflowDesigner.Memento memento;

    protected WorkflowDesigner receiver;

    public AbstractWorkflowCommand(WorkflowDesigner workflowDesigner) {
        receiver = workflowDesigner;
    }

    @Override
    public void undo() {
        receiver.setMemento(memento);
    }
}

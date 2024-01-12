package com.subham.designpattern.behavioral.memento.command;

import com.subham.designpattern.behavioral.memento.WorkflowDesigner;

/**
 * @author subham.paul
 */
public class CreateCommand extends AbstractWorkflowCommand {
    private String name;

    public CreateCommand(WorkflowDesigner designer, String name) {
        super(designer);
        this.name = name;
    }

    @Override
    public void execute() {
        this.memento = receiver.getMemento();
        receiver.createWorkflow(name);
    }
}

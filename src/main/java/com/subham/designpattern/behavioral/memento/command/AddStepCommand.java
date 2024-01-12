package com.subham.designpattern.behavioral.memento.command;

import com.subham.designpattern.behavioral.memento.WorkflowDesigner;

/**
 * @author subham.paul
 */
public class AddStepCommand extends AbstractWorkflowCommand {
    private String step;

    public AddStepCommand(WorkflowDesigner designer, String step) {
        super(designer);
        this.step = step;
    }

    @Override
    public void execute() {
        this.memento = receiver.getMemento();
        receiver.addStep(step);
    }
}

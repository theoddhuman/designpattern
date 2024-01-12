package com.subham.designpattern.behavioral.memento.command;

import com.subham.designpattern.behavioral.memento.WorkflowDesigner;

/**
 * @author subham.paul
 */
public class RemoveStepCommand extends AbstractWorkflowCommand {
    String step;

    public RemoveStepCommand(WorkflowDesigner designer, String step) {
        super(designer);
        this.step = step;
    }

    @Override
    public void execute() {
        this.memento = receiver.getMemento();
        receiver.removeStep(step);
    }
}

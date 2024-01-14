package com.subham.designpattern.behavioral.memento;

import com.subham.designpattern.behavioral.memento.command.AddStepCommand;
import com.subham.designpattern.behavioral.memento.command.CreateCommand;
import com.subham.designpattern.behavioral.memento.command.WorkflowCommand;

import java.util.LinkedList;

/**
 * @author subham.paul
 * 
 * When we want to store object's state without exposing internal details about the state then
 * we can use memento design pattern.
 * 
 * This pattern is often combined with Command design pattern to provide undo functionality in
 * application.
 * 
 */
public class Client {
    public static void main(String[] args) {
        WorkflowDesigner designer = new WorkflowDesigner();
        LinkedList<WorkflowCommand> workflowCommands = runCommands(designer);
        designer.print();
        workflowCommands.removeLast().undo();
        designer.print();
        workflowCommands.removeLast().undo();
        designer.print();
    }

    private static LinkedList<WorkflowCommand> runCommands(WorkflowDesigner designer) {
        LinkedList<WorkflowCommand> commands = new LinkedList<>();

        WorkflowCommand cmd = new CreateCommand(designer,"Leave Workflow");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(designer,"Create Leave Application");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(designer,"Submit Application");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(designer,"Application Approved");
        commands.addLast(cmd);
        cmd.execute();

        return commands;
    }
}

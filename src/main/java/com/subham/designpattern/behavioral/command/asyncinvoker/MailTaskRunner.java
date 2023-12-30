package com.subham.designpattern.behavioral.command.asyncinvoker;

import java.util.LinkedList;
import java.util.List;

/**
 * @author subham.paul
 *
 * This is invoker actually executing commands.
 * starts a worker thread in charge of executing commands
 */
public class MailTaskRunner implements Runnable {
    private Thread runner;

    private volatile boolean stop;

    private List<Command> pendingCommands;

    private static final MailTaskRunner RUNNER = new MailTaskRunner();

    public static MailTaskRunner getInstance() {
        return RUNNER;
    }

    private MailTaskRunner() {
        pendingCommands = new LinkedList<>();
        runner = new Thread(this);
        runner.start();
    }

    @Override
    public void run() {
        while(true) {
            Command command = null;
            synchronized (pendingCommands) {
                if(pendingCommands.isEmpty()) {
                    try {
                        pendingCommands.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Runner interrupted");
                        if(stop) {
                            System.out.println("Runner stopping");
                            return;
                        }
                    }
                }
                command = pendingCommands.isEmpty() ? null : pendingCommands.remove(0);
            }
            if(command == null) {
                return;
            }
            command.execute();
        }

    }

    public void addCommand(Command command) {
        synchronized (pendingCommands) {
            pendingCommands.add(command);
            pendingCommands.notifyAll();
        }
    }

    public void shutdown() {
        this.stop = true;
        this.runner.interrupt();
    }
}

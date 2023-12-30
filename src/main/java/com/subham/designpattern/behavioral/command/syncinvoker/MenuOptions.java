package com.subham.designpattern.behavioral.command.syncinvoker;

/**
 * @author subham.paul
 *
 * Invoker class
 */
public class MenuOptions {
    private ActionListenerCommand actionOpen;

    private ActionListenerCommand actionSave;

    public MenuOptions(ActionListenerCommand actionOpen, ActionListenerCommand actionSave) {
        this.actionOpen = actionOpen;
        this.actionSave = actionSave;
    }

    public void clickOpen() {
        actionOpen.execute();
    }

    public void clickSave() {
        actionSave.execute();
    }
}

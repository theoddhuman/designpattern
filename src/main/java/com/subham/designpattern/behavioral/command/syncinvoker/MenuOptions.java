package com.subham.designpattern.behavioral.command.syncinvoker;

/**
 * @author subham.paul
 *
 * Invoker class
 */
public class MenuOptions {
    private ActionCommand actionOpen;

    private ActionCommand actionSave;

    public MenuOptions(ActionCommand actionOpen, ActionCommand actionSave) {
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

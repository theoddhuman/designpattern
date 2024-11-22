package com.subham.designpattern.behavioral.command.syncinvoker;

/**
 * @author subham.paul
 *
 * Concrete command
 */
public class ActionSave implements ActionCommand {
    private String docName;

    private Document document;

    public ActionSave(String docName, Document document) {
        this.docName = docName;
        this.document = document;
    }

    @Override
    public void execute() {
        document.save(docName);
    }
}

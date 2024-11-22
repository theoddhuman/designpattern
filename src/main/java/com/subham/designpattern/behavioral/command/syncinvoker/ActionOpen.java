package com.subham.designpattern.behavioral.command.syncinvoker;

/**
 * @author subham.paul
 *
 * Concerete command
 */
public class ActionOpen implements ActionCommand {
    private Document document;

    private String docName;

    private String mode;

    public ActionOpen(String docName, String mode, Document document) {
        this.document = document;
        this.docName = docName;
        this.mode = mode;
    }

    @Override
    public void execute() {
        document.open(docName, mode);
    }
}

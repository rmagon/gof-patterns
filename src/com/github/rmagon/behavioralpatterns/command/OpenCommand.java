package com.github.rmagon.behavioralpatterns.command;

/**
 * Date : 10/12/17
 * This Command opens a document
 *
 * @author rachitmagon
 */
public class OpenCommand implements Command {

    Application application;

    public OpenCommand(Application application) {
        this.application = application;
    }

    @Override
    public void execute() {
        String name = askUserForName();
        Document document = new Document(name);
        document.open();
        application.add(document);

    }

    private String askUserForName() {
        return "New Document";
    }
}

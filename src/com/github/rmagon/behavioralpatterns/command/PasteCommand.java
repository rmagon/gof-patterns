package com.github.rmagon.behavioralpatterns.command;

/**
 * Date : 10/12/17
 * This command pastes data from the clipboard to the document
 *
 * @author rachitmagon
 */
public class PasteCommand implements Command {

    Document document;

    /**
     * @param document This is the Document on which paste is required.
     */
    public PasteCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        this.document.paste();
    }

}

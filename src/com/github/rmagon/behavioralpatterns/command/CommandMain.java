package com.github.rmagon.behavioralpatterns.command;

/**
 * Date : 10/12/17
 * <b>Intent as written in Design Patterns: Elements of reusable object-oriented software by Gang of Four</b>
 * <p/>
 * Encapsulate a request as an object,
 * thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.
 * <p/>
 * This is a sample Java Program for the example in the <a href="https://en.wikipedia.org/wiki/Design_Patterns">Design Patterns Book</a>
 *
 * @author rachitmagon
 */
public class CommandMain {

    public static void main(String args[]) {

        Application application = new Application();

        //Open Command to open a new document
        OpenCommand openCommand = new OpenCommand(application);
        openCommand.execute();

        //Paste Command to paste clipboard data into document
        PasteCommand pasteCommand = new PasteCommand(application.getDocuments().get(0));
        pasteCommand.execute();


    }
}

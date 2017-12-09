package com.github.rmagon.behavioralpatterns.chainofresponsibility;

/**
 * Date : 10/12/17
 * <b>Intent as written in Design Patterns: Elements of reusable object-oriented software by Gang of Four</b>
 * Avoid coupling the sender of a request to it's receiver by giving more than one object a change to handle the request
 * <p/>
 * This is a sample Java Program for the example in the <a href="https://en.wikipedia.org/wiki/Design_Patterns">Design Patterns Book</a>
 *
 * @author rachitmagon
 */
public class ChainOfResponsibilityMain {

    public static void main(String args[]) {

        Application application = new Application(null, Topic.APPLICATION_TOPIC);
        Dialog dialog = new Dialog(application, Topic.PRINT_TOPIC);
        Button button = new Button(dialog, Topic.PAPER_ORIENTATION_TOPIC);

        //In this case button will handle the request directly.
        button.handleHelp();


        //In this case button will not handle the request, it's successor Dialog will handle the request
        Button buttonWithoutHelp = new Button(dialog, Topic.NO_HELP_TOPIC);
        buttonWithoutHelp.handleHelp();

    }
}

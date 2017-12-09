package com.github.rmagon.behavioralpatterns.chainofresponsibility;

/**
 * Date : 10/12/17
 * An Application is the end of the chain in our example.
 *
 * @author rachitmagon
 */
public class Application extends AbstractHelpHandler {

    public Application(HelpHandler successor, Topic topic) {
        super(successor, topic);
    }

    @Override
    public void handleHelp() {
        Topic[] values = Topic.values();
        System.out.println("Application Help Topics:");
        for (Topic topic : values) {
            System.out.println(topic.name());
        }
    }
}

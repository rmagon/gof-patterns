package com.github.rmagon.behavioralpatterns.chainofresponsibility;

/**
 * Date : 10/12/17
 * The HelpHandler class defines functions for handling help requests.
 *
 * @author rachitmagon
 */
public abstract class AbstractHelpHandler implements HelpHandler {

    protected HelpHandler successor;
    protected Topic topic = Topic.NO_HELP_TOPIC;

    public AbstractHelpHandler(HelpHandler successor, Topic topic) {
        this.successor = successor;
        if (topic != null) {
            this.topic = topic;
        }
    }

    @Override
    public boolean hasHelp() {
        return topic != Topic.NO_HELP_TOPIC;
    }

    /**
     * Concrete classes override this method which want to handle the help request.
     * If they do not want to handle the request they can simply not do anything and this function would
     * send the help to it's successor
     */
    @Override
    public void handleHelp() {
        if (successor != null) {
            successor.handleHelp();
        }
    }

}

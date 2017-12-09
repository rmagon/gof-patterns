package com.github.rmagon.behavioralpatterns.chainofresponsibility;

/**
 * Date : 10/12/17
 *
 * @author rachitmagon
 */
public class Dialog extends Widget {

    /**
     * Dailog is also a Widget, difference from {@link Button} is that
     * a Dialog's successor can be any {@link HelpHandler}
     * <p/>
     * In the example which we are following, our Dialog's successor will be an Application.
     */
    public Dialog(HelpHandler successor, Topic topic) {
        super(successor, topic);
    }

    /**
     * Dialog's version of this function first checks if this object has some help.
     * If it does - then handle the help right here and get it over with.
     * If no help - then send to super (call successor)
     */
    @Override
    public void handleHelp() {
        if (hasHelp()) {
            System.out.println("Dialog Help: " + topic.name());
        } else {
            super.handleHelp();
        }
    }

}

package com.github.rmagon.behavioralpatterns.chainofresponsibility;

/**
 * Date : 10/12/17
 *
 * @author rachitmagon
 */
public class Button extends Widget {

    /**
     * Button is a sub class of widget and a child of a widget object.
     *
     * @param w     A Widget Object
     * @param topic The help topic.
     */
    public Button(Widget w, Topic topic) {
        super(w, topic);
    }

    /**
     * Button's version of this funtion first checks if this object has some help.
     * If it does - then handle the help right here and get it over with.
     * If no help - then send to super (call successor)
     */
    @Override
    public void handleHelp() {
        if (hasHelp()) {
            System.out.println("Button Help: " + topic.name());
        } else {
            super.handleHelp();
        }
    }
}

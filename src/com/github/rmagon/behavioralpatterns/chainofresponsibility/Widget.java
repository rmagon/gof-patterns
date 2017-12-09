package com.github.rmagon.behavioralpatterns.chainofresponsibility;

/**
 * Date : 10/12/17
 * All widgets are subclasses of this class
 *
 * @author rachitmagon
 */
public abstract class Widget extends AbstractHelpHandler {

    public Widget(HelpHandler successor, Topic topic) {
        super(successor, topic);
    }


}

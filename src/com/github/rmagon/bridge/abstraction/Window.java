package com.github.rmagon.bridge.abstraction;

import com.github.rmagon.bridge.implementors.WindowImplementor;
import com.github.rmagon.common.Point;

/**
 * Date : 15/11/17
 * The class {@link Window} defines the contract for client applications.
 * Windows can be Icon Windows, Transient Windows like popups etc.
 * Window maintains a reference to a {@link WindowImplementor} which is the the abstract class
 * that declares an interface to the underlying windowing system.
 * This is a sample Java Program for the example in the <a href="https://en.wikipedia.org/wiki/Design_Patterns">Design Patterns Book</a>
 *
 * @author rachitmagon
 */
public abstract class Window {

    /**
     * This composition can be called the BRIDGE here.
     * All Windows need to maintain a reference to WindowImplementor which is an interface to the underlying Window System
     */
    protected WindowImplementor windowImplementor;

    public Window(WindowImplementor windowImplementor) {
        this.windowImplementor = windowImplementor;
    }

    //************************************* REQUESTS HANDLED BY WINDOW ********************************************//
    public abstract void drawContents();

    public abstract void open();

    public abstract void close();

    //********************************* REQUESTS FORWARDED TO IMPLEMENTATION ***************************************//
    public abstract void setOrigin(Point a);

    public abstract void setExtent(Point a);

    public abstract void raise();

    public abstract void lower();

    public abstract void drawLine(Point a, Point b);

    public abstract void drawRectangle(int x0, int y0, int x1, int y1);

}

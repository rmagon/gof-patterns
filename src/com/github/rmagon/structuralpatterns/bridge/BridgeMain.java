package com.github.rmagon.structuralpatterns.bridge;

import com.github.rmagon.structuralpatterns.bridge.abstraction.IconWindow;
import com.github.rmagon.structuralpatterns.bridge.abstraction.TransientWindow;
import com.github.rmagon.structuralpatterns.bridge.abstraction.Window;
import com.github.rmagon.structuralpatterns.bridge.implementors.WindowImplementor;
import com.github.rmagon.structuralpatterns.bridge.implementors.pm.PMWindowImplementor;
import com.github.rmagon.structuralpatterns.bridge.implementors.xwindow.XWindowDisplay;
import com.github.rmagon.structuralpatterns.bridge.implementors.xwindow.XWindowDrawable;
import com.github.rmagon.structuralpatterns.bridge.implementors.xwindow.XWindowImplementor;
import com.github.rmagon.structuralpatterns.common.Point;

/**
 * Date : 15/11/17
 * <p><b>Intent as written in Design Patterns: Elements of reusable object-oriented software by Gang of Four:</b></p>
 * Decouple an abstraction <i>(what)</i> from its implementation <i>(how)</i> so that the two can vary independently.
 * This is a sample Java Program for the example in the <a href="https://en.wikipedia.org/wiki/Design_Patterns">Design Patterns Book</a>
 * It explains the following features of the Bridge Pattern
 * 1. Decoupling Interface and Implementation
 * 2. Improved Extensibility
 * 3. Hiding Implementation Details from Clients
 *
 * @author rachitmagon
 */
public class BridgeMain {

    public static void main(String args[]) {

        //XWINDOW FLOW
        IconWindow iconWindow = new IconWindow(getXWindowImpl(), "Bin");
        TransientWindow transientWindow = new TransientWindow(getXWindowImpl());
        IconWindow pmIconWindow = new IconWindow(getPMWindowImpl(), "Trash Can");
        TransientWindow pmTransientWindow = new TransientWindow(getPMWindowImpl());

        useWindow(iconWindow);
        /**
         * Output of the above function:
         * Opening an IconWindow
         * XWindow raising..
         * Drawing all IconWindow Contents
         * ___________________5,5
         * ___________________
         * ___________________
         * 0,0________________
         * (2,2) --------------------- (3,3)
         * XWindow lower..
         * Closing an IconWindow
         */


        useWindow(transientWindow);
        /**
         * Output of the above function:
         * Opening a Transient Window
         * XWindow raising..
         * Drawing TransientWindow Contents
         * ___________________5,5
         * ___________________
         * ___________________
         * 0,0________________
         * (2,2) --------------------- (3,3)
         * XWindow lower..
         * Closing a Transient Window
         */


        useWindow(pmIconWindow);
        /**
         * Opening an IconWindow
         * PM raising.. UP UP DONE
         * Drawing all IconWindow Contents
         * ||||||||||||5,5
         * |||||||||||||||
         * |||||||||||||||
         * 0,0||||||||||||
         * (2,2)____________________________(3,3)
         * PM lower.. DOWN DOWN DONE
         * Closing an IconWindow
         */

        useWindow(pmTransientWindow);
        /**
         * Opening a Transient Window
         * PM raising.. UP UP DONE
         * Drawing TransientWindow Contents
         * ||||||||||||5,5
         * |||||||||||||||
         * |||||||||||||||
         * 0,0||||||||||||
         * (2,2)____________________________(3,3)
         * PM lower.. DOWN DOWN DONE
         * Closing a Transient Window
         */
    }

    private static void useWindow(Window iconWindow) {
        iconWindow.open();
        iconWindow.raise();
        iconWindow.drawContents();
        iconWindow.drawRectangle(0, 0, 5, 5);
        iconWindow.drawLine(new Point(2, 2), new Point(3, 3));
        iconWindow.lower();
        iconWindow.close();
    }

    public static WindowImplementor getXWindowImpl() {
        XWindowDrawable xWindowDrawable = new XWindowDrawable("1");
        XWindowDisplay xWindowDisplay = new XWindowDisplay();
        return new XWindowImplementor(xWindowDisplay, xWindowDrawable);
    }

    public static WindowImplementor getPMWindowImpl() {
        return new PMWindowImplementor();
    }
}

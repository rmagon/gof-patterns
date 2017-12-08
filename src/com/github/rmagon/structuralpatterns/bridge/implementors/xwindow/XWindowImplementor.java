package com.github.rmagon.structuralpatterns.bridge.implementors.xwindow;

import com.github.rmagon.structuralpatterns.bridge.implementors.WindowImplementor;
import com.github.rmagon.structuralpatterns.common.Point;

/**
 * Date : 15/11/17
 * This class supports the X Window System.
 *
 * @author rachitmagon
 */
public class XWindowImplementor implements WindowImplementor {

    //********************************* X WINDOW SYSTEM-SPECIFIC STATE ***************************************//
    XWindowDisplay xWindowDisplay;
    XWindowDrawable xWindowId;


    public XWindowImplementor(XWindowDisplay xWindowDisplay, XWindowDrawable xWindowDrawable) {
        this.xWindowDisplay = xWindowDisplay;
        this.xWindowId = xWindowDrawable;
    }

    @Override
    public void impSetExtent(Point point) {

    }

    @Override
    public void impSetOrigin(Point point) {

    }

    @Override
    public void raise() {
        System.out.println("XWindow raising..");
    }

    @Override
    public void lower() {
        System.out.println("XWindow lower..");
    }

    @Override
    public void deviceLine(Point a, Point b) {
        System.out.println("(" + a.getX() + "," + a.getY() + ") --------------------- (" + b.getX() + "," + b.getY() + ")");
    }

    @Override
    public void deviceRectangle(int x0, int y0, int x1, int y1) {
        System.out.println("___________________" + x1 + "," + y1);
        System.out.println("___________________");
        System.out.println("___________________");
        System.out.println(x0 + "," + y0 + "________________");
    }
}

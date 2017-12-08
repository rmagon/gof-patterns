package com.github.rmagon.structuralpatterns.bridge.abstraction;

import com.github.rmagon.structuralpatterns.bridge.implementors.WindowImplementor;
import com.github.rmagon.structuralpatterns.common.Point;

/**
 * Date : 15/11/17
 *
 * @author rachitmagon
 */
public class IconWindow extends Window {

    private String bitmapName;

    /**
     * @param windowImplementor This is the composite bridge.
     */
    public IconWindow(WindowImplementor windowImplementor, String bitmapName) {
        super(windowImplementor);
        this.bitmapName = bitmapName;
    }


    //************************************* REQUESTS HANDLED BY WINDOW ********************************************//

    @Override
    public void drawContents() {
        System.out.println("Drawing all IconWindow Contents");
    }

    @Override
    public void open() {
        System.out.println("Opening an IconWindow");
    }

    @Override
    public void close() {
        System.out.println("Closing an IconWindow");
    }


    //********************************* REQUESTS FORWARDED TO IMPLEMENTATION ***************************************//

    @Override
    public void setOrigin(Point a) {
        windowImplementor.impSetOrigin(a);
    }

    @Override
    public void setExtent(Point a) {
        windowImplementor.impSetExtent(a);
    }

    @Override
    public void raise() {
        windowImplementor.raise();
    }

    @Override
    public void lower() {
        windowImplementor.lower();
    }

    @Override
    public void drawLine(Point a, Point b) {
        windowImplementor.deviceLine(a, b);
    }

    @Override
    public void drawRectangle(int x0, int y0, int x1, int y1) {
        windowImplementor.deviceRectangle(x0, y0, x1, y1);
    }
}

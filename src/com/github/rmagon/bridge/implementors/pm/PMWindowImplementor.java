package com.github.rmagon.bridge.implementors.pm;

import com.github.rmagon.bridge.implementors.WindowImplementor;
import com.github.rmagon.common.Point;

/**
 * Date : 15/11/17
 *
 * @author rachitmagon
 */
public class PMWindowImplementor implements WindowImplementor {

    @Override
    public void impSetExtent(Point point) {

    }

    @Override
    public void impSetOrigin(Point point) {

    }

    @Override
    public void raise() {
        System.out.println("PM raising.. UP UP DONE");
    }

    @Override
    public void lower() {
        System.out.println("PM lower.. DOWN DOWN DONE");
    }

    @Override
    public void deviceLine(Point a, Point b) {
        System.out.println("(" + a.getX() + "," + a.getY() + ")____________________________(" + b.getX() + "," + b.getY() + ")");
    }

    @Override
    public void deviceRectangle(int x0, int y0, int x1, int y1) {
        System.out.println("||||||||||||" + x1 + "," + y1);
        System.out.println("|||||||||||||||");
        System.out.println("|||||||||||||||");
        System.out.println(x0 + "," + y0 + "||||||||||||");
    }
}

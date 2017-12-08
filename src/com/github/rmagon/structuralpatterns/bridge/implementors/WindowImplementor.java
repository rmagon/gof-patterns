package com.github.rmagon.structuralpatterns.bridge.implementors;


import com.github.rmagon.structuralpatterns.common.Point;

/**
 * Date : 15/11/17
 *
 * @author rachitmagon
 */
public interface WindowImplementor {

    void impSetExtent(Point point);

    void impSetOrigin(Point point);

    void raise();

    void lower();

    void deviceLine(Point a, Point b);

    void deviceRectangle(int x0, int y0, int x1, int y1);

}

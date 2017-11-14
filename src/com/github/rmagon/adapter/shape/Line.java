package com.github.rmagon.adapter.shape;

import com.github.rmagon.common.Point;

/**
 * Date : 14/11/17
 * A concrete {@link Shape}
 *
 * @author rachitmagon
 */
public class Line implements Shape {

    Point[] points;

    public Line(Point a, Point b) {
        points = new Point[2];
        points[0] = a;
        points[1] = b;
    }

    @Override
    public Point[] boundingBox() {
        return points;
    }

    @Override
    public Manipulator createManipulator() {
        return new LineManipulator(this);
    }
}

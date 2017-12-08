package com.github.rmagon.structuralpatterns.common;

/**
 * Date : 14/11/17
 * Point used with the Shape interface
 *
 * @author rachitmagon
 */
public class Point {

    int x;

    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

package com.github.rmagon.adapter.textview;

/**
 * Date : 14/11/17
 * The Adaptee which needs to be Adapted as a {@link com.github.rmagon.adapter.shape.Shape}
 * So that anything which can be done using Shape can be done using this class
 *
 * @author rachitmagon
 */
public class TextView {

    int[] origin = new int[2];
    int[] extent = new int[2];

    public TextView(int bottom, int left, int height, int width) {
        this.origin[0] = bottom;
        this.origin[1] = left;
        this.extent[0] = height;
        this.extent[1] = width;
    }

    public int[] getOrigin() {
        return origin;
    }

    public int[] getExtent() {
        return extent;
    }

    public boolean isEmpty() {
        return origin == null || extent == null;
    }
}

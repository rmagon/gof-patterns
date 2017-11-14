package com.github.rmagon.adapter.adapter;

import com.github.rmagon.adapter.shape.Manipulator;
import com.github.rmagon.common.Point;
import com.github.rmagon.adapter.shape.Shape;
import com.github.rmagon.adapter.textview.TextView;

/**
 * Date : 15/11/17
 * The Adapter. Also known specifically as an Object Adapter since it uses object composition.
 * i.e. It holds the {@link TextView} instance as an object.
 * It implements the {@link Shape} interface which is the Target.
 * It adapts the {@link TextView} to {@link Shape}
 *
 * @author rachitmagon
 */
public class TextShape implements Shape {

    TextView textView;

    /**
     * An instance of this adapter only makes sense if it has an adaptee object.
     *
     * @param textView The Object to adapt.
     */
    public TextShape(TextView textView) {
        this.textView = textView;
    }

    /**
     * This is an example of an adapter function which uses some logic of it's own to present the {@link TextView}'s functionality
     * as a {@link Shape} functionality
     */
    @Override
    public Point[] boundingBox() {
        if (textView.isEmpty()) {
            return null;
        }
        int[] extent = textView.getExtent();
        int[] origin = textView.getOrigin();
        Point bottomLeft = new Point(origin[0], origin[1]);
        Point topRight = new Point(origin[0] + extent[0], origin[1] + extent[1]);
        return new Point[]{bottomLeft, topRight};
    }

    @Override
    public Manipulator createManipulator() {
        return new TextManipulator(this);
    }
}

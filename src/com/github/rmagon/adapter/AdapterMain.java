package com.github.rmagon.adapter;

import com.github.rmagon.adapter.adapter.TextShape;
import com.github.rmagon.adapter.shape.Line;
import com.github.rmagon.adapter.shape.Manipulator;
import com.github.rmagon.adapter.shape.Shape;
import com.github.rmagon.adapter.textview.TextView;
import com.github.rmagon.common.Point;

/**
 * Date : 15/11/17
 * <b>Intent as written in Design Patterns: Elements of reusable object-oriented software by Gang of Four</b>
 * Convert the interface of a class into another interface clients expect.
 * <p>
 * <br/><b>Target:</b> {@link Shape}
 * <br/><b>Adaptee:</b> {@link TextView}
 * <br/><b>Adapter:</b> {@link TextShape}
 * <br/><b>Client:</b> {@link AdapterMain}
 * This is a sample Java Program for the example in the <a href="https://en.wikipedia.org/wiki/Design_Patterns">Design Patterns Book</a>
 *
 * @author rachitmagon
 */
public class AdapterMain {

    /**
     * A Generic function which will first manipulate a shape and then print it.
     *
     * @param anyShape Any class which implements the {@link Shape} interface.
     */
    private static void manipulateAndPrint(Shape anyShape) {
        Manipulator manipulator = anyShape.createManipulator();
        manipulator.manipulate();
        Point[] points = anyShape.boundingBox();
        System.out.println("bottom left point: " + points[0].getX() + ", " + points[0].getY());
        System.out.println("top right point: " + points[1].getX() + ", " + points[1].getY());
    }

    public static void main(String args[]) {
        Shape lineShape = new Line(new Point(2, 2), new Point(2, 5));

        manipulateAndPrint(lineShape);
        //Console output:
        //I am manipulating a line!
        //bottom left point: 2, 2
        //top right point: 2, 5

        TextView textView = new TextView(1, 1, 5, 5);
        //manipulateAndPrint(textView); !This will not work because TextView is not a shape.

        TextShape textShape = new TextShape(textView); //Adapt TextView as a Shape using TextShape

        manipulateAndPrint(textShape); //Now this will work
        //Console output:
        //I am manipulating a TextShape!
        //bottom left point: 1, 1
        //top right point: 6, 6
    }
}

package com.github.rmagon.adapter.shape;

import com.github.rmagon.common.Point;

/**
 * Date : 14/11/17
 * A Generic Shape Interface. This acts as the Target
 *
 * @author rachitmagon
 */
public interface Shape {

    Point[] boundingBox();

    Manipulator createManipulator();
}

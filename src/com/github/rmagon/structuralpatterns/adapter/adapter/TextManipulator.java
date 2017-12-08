package com.github.rmagon.structuralpatterns.adapter.adapter;

import com.github.rmagon.structuralpatterns.adapter.shape.Manipulator;

/**
 * Date : 15/11/17
 * A class which knows how to manipulate a {@link TextShape}
 *
 * @author rachitmagon
 */
public class TextManipulator implements Manipulator {

    private TextShape textShape;

    public TextManipulator(TextShape textShape) {
        this.textShape = textShape;
    }

    @Override
    public void manipulate() {
        System.out.println("I am manipulating a TextShape!");
    }
}

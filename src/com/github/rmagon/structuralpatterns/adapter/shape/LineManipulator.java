package com.github.rmagon.structuralpatterns.adapter.shape;

/**
 * Date : 15/11/17
 * Concrete implementation of a Manipulator as a LineManipulator
 *
 * @author rachitmagon
 */
public class LineManipulator implements Manipulator {

    private Line line;

    public LineManipulator(Line line) {
        this.line = line;
    }

    @Override
    public void manipulate() {
        System.out.println("I am manipulating a line!");
    }

}

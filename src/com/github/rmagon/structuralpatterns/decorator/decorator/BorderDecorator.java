package com.github.rmagon.structuralpatterns.decorator.decorator;

import com.github.rmagon.structuralpatterns.decorator.component.VisualComponent;

/**
 * Date : 22/11/17
 * This class is a subclass of {@link Decorator}. It adds a border to the component which is being decorated.
 *
 * @author rachitmagon
 */
public class BorderDecorator extends Decorator {

    int width;

    public BorderDecorator(VisualComponent visualComponent, int width) {
        super(visualComponent);
        this.width = width;
    }

    private void drawBorder() {
        System.out.println("Drawing a border of width |" + width + "|.");
    }

    @Override
    public void draw() {
        //First call the draw operation of super. This will basically call the fraw operation of the visual component
        //instance variable which was passed in the constructor
        super.draw();

        //Then call the private drawBorder method. This does the decoration.
        drawBorder();
    }
}

package com.github.rmagon.decorator.decorator;

import com.github.rmagon.decorator.component.VisualComponent;

/**
 * Date : 22/11/17
 * This class is a subclass of {@link Decorator}. It adds a scroll bar to the component which is being decorated.
 *
 * @author rachitmagon
 */
public class ScrollDecorator extends Decorator {

    public ScrollDecorator(VisualComponent visualComponent) {
        super(visualComponent);
    }

    private void drawScroll() {
        System.out.println("Drawing a scroll bar <->.");
    }

    @Override
    public void draw() {
        //First call the draw operation of super. This will basically call the draw operation of the visual component
        //instance variable which was passed in the constructor
        super.draw();

        //Then call the private drawBorder method. This does the decoration.
        drawScroll();
    }

}

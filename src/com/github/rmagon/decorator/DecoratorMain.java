package com.github.rmagon.decorator;

import com.github.rmagon.decorator.component.TextView;
import com.github.rmagon.decorator.decorator.BorderDecorator;
import com.github.rmagon.decorator.decorator.ScrollDecorator;

/**
 * Date : 22/11/17
 * This is a sample Client Class.
 * Window uses a {@link com.github.rmagon.decorator.component.VisualComponent}.
 * In the first step we pass a {@link TextView} to {@link Window} which draws it.
 * If we need to pass a decorated TextView with Scroll and Border, we can decorate it with the classes
 * {@link ScrollDecorator} and {@link BorderDecorator} and pass it to {@link Window} and the
 * Window class would not know the presence of a decorator.
 * <p/>
 * As a client, {@link DecoratorMain} has a reference to the original {@link TextView} so that it can perform
 * operations which are specific to {@link TextView}
 * This is a sample Java Program for the example in the <a href="https://en.wikipedia.org/wiki/Design_Patterns">Design Patterns Book</a>
 *
 * @author rachitmagon
 */
public class DecoratorMain {

    public static void main(String args[]) {

        //We can create a Window and pass the TextView to it.
        Window window = new Window();
        TextView textView = new TextView();
        window.setContents(textView);
        /*
         * Output of the above:
         * --
         * Set Content to Window:
         * Drawing a TextView
         */

        //But we need a bordered and scrollable TextView so we can decorate it and add it to window
        window.setContents(new BorderDecorator(new ScrollDecorator(textView), 1));
        /*
         * Output of the above:
         * --
         * Set Content to Window:
         * Drawing a TextView
         * Drawing a scroll bar <->.
         * Drawing a border of width |1|.
         */
    }
}

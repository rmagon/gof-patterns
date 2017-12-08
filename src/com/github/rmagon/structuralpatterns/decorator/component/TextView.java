package com.github.rmagon.structuralpatterns.decorator.component;

/**
 * Date : 22/11/17
 * This is a sample component.
 * It implements the {@link VisualComponent} interface and also has it's own features apart from the interface.
 *
 * @author rachitmagon
 */
public class TextView implements VisualComponent {

    @Override
    public void draw() {
        System.out.println("Drawing a TextView");
    }

    @Override
    public void resize() {
        System.out.println("Resizing a TextView");
    }

    public void changeFont(int fontSize) {
        System.out.println("New font size is " + fontSize);
    }
}

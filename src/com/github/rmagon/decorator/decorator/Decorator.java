package com.github.rmagon.decorator.decorator;

import com.github.rmagon.decorator.component.VisualComponent;

/**
 * Date : 22/11/17
 * Decorator decorates the VisualComponent references the by visualComponent instance variable.
 * The default implementation is to simply pass the operation to visualComponent.
 *
 * @author rachitmagon
 */
public class Decorator implements VisualComponent {

    VisualComponent visualComponent;

    protected Decorator(VisualComponent visualComponent) {
        this.visualComponent = visualComponent;
    }

    @Override
    public void draw() {
        visualComponent.draw();
    }

    @Override
    public void resize() {
        visualComponent.resize();
    }
}

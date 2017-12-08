package com.github.rmagon.structuralpatterns.decorator.component;

/**
 * Date : 22/11/17
 * This is the Component Interface.
 * It defined the interface for objects that can have responsibilities added to them dynamically
 *
 * @author rachitmagon
 */
public interface VisualComponent {

    void draw();

    void resize();
}

package com.github.rmagon.structuralpatterns.decorator;

import com.github.rmagon.structuralpatterns.decorator.component.VisualComponent;

/**
 * Date : 22/11/17
 * This class accesses the component through {@link VisualComponent} interface
 * So it will always be unaware whether the component is decorated or not.
 *
 * @author rachitmagon
 */
public class Window {

    VisualComponent visualComponent;

    public void setContents(VisualComponent visualComponent) {

        //Set the VisualComponent object.
        this.visualComponent = visualComponent;
        System.out.println("--");
        System.out.println("Set Content to Window:");

        //Draw the VisualComponent - here, we do not know what the VisualComponent is.
        visualComponent.draw();
    }

}

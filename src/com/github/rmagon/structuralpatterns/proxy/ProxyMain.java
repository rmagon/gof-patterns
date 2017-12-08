package com.github.rmagon.structuralpatterns.proxy;

/**
 * Date : 08/12/17
 * <p>Intent</p>
 * <p>Provide a surrogate or placeholder for another object to control access to it.</p>
 * This is a sample Java Program for the example in the <a href="https://en.wikipedia.org/wiki/Design_Patterns">Design Patterns Book</a>
 *
 * @author rachitmagon
 */
public class ProxyMain {

    public static void main(String args[]) {

        ImagePtr image = new ImagePtr("/mnt1/config/data/");

        //do a lot of other work

        /**
         * This approach lets you call Image operations through ImagePtr
         * objects without going to the trouble of making the operations part of the ImagePtr
         * It also lazy loads the image object and then returns the same object everytime
         */
        image.operatorGetImage().draw();

    }

}

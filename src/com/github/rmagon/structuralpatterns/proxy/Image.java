package com.github.rmagon.structuralpatterns.proxy;

/**
 * Date : 08/12/17
 *
 * @author rachitmagon
 */
public class Image {

    private String path;

    private String name;

    public Image(String path, String name) {
        this.path = path;
        this.name = name;
    }

    public void draw() {
        System.out.print("|| " + name + " at " + path + "||");
    }
}

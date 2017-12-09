package com.github.rmagon.behavioralpatterns.command;

/**
 * Date : 10/12/17
 *
 * @author rachitmagon
 */
public class Document {

    String name;

    public Document(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println(name + " open().");
    }

    public void paste(){
        System.out.println(name + " paste().");
    }
}

package com.github.rmagon.structuralpatterns.composite.composite;

/**
 * Date : 22/11/17
 *
 * @author rachitmagon
 */
public class Cabinet extends CompositeEquipment {

    public Cabinet(String name) {
        System.out.println("Creating new Cabinet:" + name);
        this.name = name;
    }

    @Override
    public String getName() {
        return "Cabinet";
    }
}

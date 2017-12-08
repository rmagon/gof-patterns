package com.github.rmagon.structuralpatterns.composite.composite;

/**
 * Date : 22/11/17
 *
 * @author rachitmagon
 */
public class Bus extends CompositeEquipment {

    public Bus(String name){
        System.out.println("Creating new Bus:" + name);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

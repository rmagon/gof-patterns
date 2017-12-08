package com.github.rmagon.structuralpatterns.composite.composite;

/**
 * Date : 22/11/17
 *
 * @author rachitmagon
 */
public class Chassis extends CompositeEquipment {

    public Chassis(String name){
        System.out.println("Creating new Chassis:" + name);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

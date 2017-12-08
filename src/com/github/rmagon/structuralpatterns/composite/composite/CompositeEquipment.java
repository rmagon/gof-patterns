package com.github.rmagon.structuralpatterns.composite.composite;

import com.github.rmagon.structuralpatterns.composite.component.Equipment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Date : 17/11/17
 *
 * @author rachitmagon
 */
public abstract class CompositeEquipment implements Equipment {

    private List<Equipment> equipmentList;

    protected String name;

    public CompositeEquipment(String name) {
        this.name = name;
    }

    protected CompositeEquipment() {
        equipmentList = new ArrayList<>();
    }

    /**
     * Delegate operations to contained objects.
     */
    @Override
    public Double getPower() {
        Double totalPower = 0.0;
        double sum = equipmentList.stream().mapToDouble(Equipment::getPower).sum();
        System.out.println("Price for " + name + ": " + sum);
        return sum;
    }

    /**
     * Delegate operations to contained objects.
     */
    @Override
    public Double getNetPrice() {
        Double totalPower = 0.0;
        return equipmentList.stream().mapToDouble(Equipment::getNetPrice).sum();
    }

    /**
     * Delegate operations to contained objects.
     */
    @Override
    public Double getDiscountPrice() {
        Double totalPower = 0.0;
        return equipmentList.stream().mapToDouble(Equipment::getDiscountPrice).sum();
    }

    /**
     * @param e The {@link Equipment} to add
     */
    @Override
    public void add(Equipment e) {
        System.out.println("Adding " + e.getName() + " to " + name);
        equipmentList.add(e);
    }

    /**
     * @param e The {@link Equipment} to remove
     */
    @Override
    public void remove(Equipment e) {
        equipmentList.remove(e);
    }

    /**
     * @return Iterator of the equipmentList
     */
    @Override
    public Iterator<Equipment> createIterator() {
        return equipmentList.iterator();
    }
}

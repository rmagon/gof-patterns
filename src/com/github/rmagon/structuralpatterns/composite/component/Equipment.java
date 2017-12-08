package com.github.rmagon.structuralpatterns.composite.component;

import java.util.Iterator;

/**
 * Date : 17/11/17
 *
 * @author rachitmagon
 */
public interface Equipment {

    String getName();

    Double getPower();

    Double getNetPrice();

    Double getDiscountPrice();

    /**
     * The default add implementation - nothing.
     * Because LEAF Elements will not support this operation
     */
    default void add(Equipment e) {
    }

    /**
     * The default remove implementation - nothing.
     * Because LEAF Elements will not support this operation
     */
    default void remove(Equipment e) {
    }

    /**
     * The default createIterator returns null.
     * Because LEAF Elements will not support this operation
     *
     * @return null
     */
    default Iterator<Equipment> createIterator() {
        return null;
    }

}

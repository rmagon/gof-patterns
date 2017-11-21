package com.github.rmagon.composite.component;

/**
 * Date : 17/11/17
 * This is a leaf element.
 *
 * @author rachitmagon
 */
public class FloppyDisk implements Equipment {

    public FloppyDisk(){
        System.out.println("Creating new Floppy Disk");
    }

    @Override
    public String getName() {
        return "Floppy Disk";
    }

    @Override
    public Double getPower() {
        return 1.0;
    }

    @Override
    public Double getNetPrice() {
        System.out.println("Price for FloppyDisk:" + 10.0);
        return 10.0;
    }

    @Override
    public Double getDiscountPrice() {
        return 9.9;
    }

}

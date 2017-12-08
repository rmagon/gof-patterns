package com.github.rmagon.structuralpatterns.composite;

import com.github.rmagon.structuralpatterns.composite.component.Card;
import com.github.rmagon.structuralpatterns.composite.component.FloppyDisk;
import com.github.rmagon.structuralpatterns.composite.composite.Bus;
import com.github.rmagon.structuralpatterns.composite.composite.Cabinet;
import com.github.rmagon.structuralpatterns.composite.composite.Chassis;

/**
 * Date : 17/11/17
 * <b>Intent as written in Design Patterns: Elements of reusable object-oriented software by Gang of Four</b>
 * Compose objects into tree structures to represent part-whole hierarchies.
 * Composite lets clients treat individual objects & compositions of objects uniformly.
 * This is a sample Java Program for the example in the <a href="https://en.wikipedia.org/wiki/Design_Patterns">Design Patterns Book</a>
 *
 * @author rachitmagon
 */
public class CompositeMain {

    public static void main(String args[]) {

        Cabinet cabinet = new Cabinet("PC Cabinet");
        //Creating new Cabinet:PC Cabinet


        Chassis chassis = new Chassis("PC Chassis");
        //Creating new Chassis:PC Chassis


        cabinet.add(chassis);
        //Adding PC Chassis to PC Cabinet


        Bus bus = new Bus("MCA Bus");
        //Creating new Bus:MCA Bus


        bus.add(new Card("16Mbs Token Ring"));
        //Creating new Card:16Mbs Token Ring
        //Adding PCI CARD to MCA Bus


        chassis.add(bus);
        //Adding MCA Bus to PC Chassis


        chassis.add(new FloppyDisk());
        //Creating new Floppy Disk
        //Adding Floppy Disk to PC Chassis


        System.out.println("Chassis price is:" + chassis.getNetPrice());
        //Price for Card:1.0
        //Price for FloppyDisk:10.0
        //Chassis price is:11.0
    }

}

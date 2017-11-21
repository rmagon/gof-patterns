package com.github.rmagon.composite.component;

/**
 * Date : 22/11/17
 * This is a leaf element.
 *
 * @author rachitmagon
 */
public class Card implements Equipment {

    String cardName;

    public Card(String cardName) {
        System.out.println("Creating new Card:" + cardName);
        this.cardName = cardName;
    }

    @Override
    public String getName() {
        return "PCI CARD";
    }

    @Override
    public Double getPower() {
        return 2.0;
    }

    @Override
    public Double getNetPrice() {
        System.out.println("Price for Card:" + 1.0);
        return 1.0;
    }

    @Override
    public Double getDiscountPrice() {
        return 0.9;
    }
}

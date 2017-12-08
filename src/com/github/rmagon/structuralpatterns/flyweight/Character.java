package com.github.rmagon.structuralpatterns.flyweight;

/**
 * Date : 01/12/17
 * The Character class stores a character code
 *
 * @author rachitmagon
 */
public class Character extends GlyphImpl {

    private int character;

    public Character(int code) {
        this.character = code;
    }

    @Override
    public void draw(GlyphContext glyphContext) {
        System.out.println(glyphContext.getFont().getFontName() + ": " + (char) character);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Character character1 = (Character) o;

        return character == character1.character;

    }

    @Override
    public int hashCode() {
        return character;
    }
}

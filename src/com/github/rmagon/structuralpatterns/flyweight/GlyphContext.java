package com.github.rmagon.structuralpatterns.flyweight;

/**
 * Date : 01/12/17
 * GlyphContext acts as a repository of <b>extrinsic state. </b>
 * It maintains a mapping between a glyph and its font through position of the glyph.
 * This is a sample Java Program for the example in the <a href="https://en.wikipedia.org/wiki/Design_Patterns">Design Patterns Book</a>
 *
 * @author rachitmagon
 */
public interface GlyphContext {

    /**
     * All {@link Glyph} classes will implement {@link Glyph#next(GlyphContext)}
     * which will call this function
     *
     * @param step number of steps to move. Can be +ive or -ive.
     */
    void next(Integer step);

    void start();

    /**
     * This function will return the font at the current position.
     * Implementation of this interface need to store the current position.
     */
    Font getFont();

    /**
     * @param font The {@link Font} to set
     * @param span Number of elements which have this font.
     */
    void setFont(Font font, Integer span);

}

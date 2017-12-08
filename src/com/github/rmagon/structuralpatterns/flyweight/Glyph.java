package com.github.rmagon.structuralpatterns.flyweight;

/**
 * Date : 01/12/17
 * Glyphs have graphical attributes and can draw themselves.
 * This is a sample Java Program for the example in the <a href="https://en.wikipedia.org/wiki/Design_Patterns">Design Patterns Book</a>
 *
 * @author rachitmagon
 */
public interface Glyph {

    void draw(GlyphContext glyphContext);

    void setFont(Font font, GlyphContext glyphContext);

    Font getFont(GlyphContext glyphContext);

    void first(GlyphContext glyphContext);

    void next(GlyphContext glyphContext);

    GlyphImpl current(GlyphContext glyphContext);

    /**
     * A Glyph can behave like a Composite and contain many different Glyphs.
     */
    void insert(Glyph glyph, GlyphContext glyphContext);

    void remove(GlyphContext glyphContext);
}

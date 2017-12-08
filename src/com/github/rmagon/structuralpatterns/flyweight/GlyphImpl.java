package com.github.rmagon.structuralpatterns.flyweight;

/**
 * Date : 01/12/17
 *
 * @author rachitmagon
 */
public class GlyphImpl implements Glyph {

    @Override
    public void draw(GlyphContext glyphContext) {
        //not implemented
    }

    @Override
    public void setFont(Font font, GlyphContext glyphContext) {
        glyphContext.setFont(font, 1);
        glyphContext.next(1);
    }

    @Override
    public Font getFont(GlyphContext glyphContext) {
        return null;
    }

    @Override
    public void first(GlyphContext glyphContext) {
        //not implemented
    }

    @Override
    public void next(GlyphContext glyphContext) {
        glyphContext.next(1);
    }

    @Override
    public GlyphImpl current(GlyphContext glyphContext) {
        return null;
    }

    @Override
    public void insert(Glyph glyph, GlyphContext glyphContext) {
        //not implemented
    }

    @Override
    public void remove(GlyphContext glyphContext) {
        //not implemented
    }
}

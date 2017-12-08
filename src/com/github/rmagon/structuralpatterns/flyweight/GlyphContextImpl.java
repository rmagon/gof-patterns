package com.github.rmagon.structuralpatterns.flyweight;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * Date : 07/12/17
 *
 * @author rachitmagon
 */
public class GlyphContextImpl implements GlyphContext {

    /**
     * GlyphContext knows about the current position during traversal
     */
    Integer currentPosition = 0;

    NavigableMap<Integer, Font> navigableMap = new TreeMap<>();

    /**
     * All {@link Glyph} classes will implement {@link Glyph#next(GlyphContext)}
     * which will call this function {@link GlyphContext#next(Integer)}
     *
     * @param step number of steps to move. Can be +ive or -ive.
     */
    @Override
    public void next(Integer step) {
        currentPosition += step;
    }

    @Override
    public void start() {
        currentPosition = 0;
    }

    /**
     * This function will return the font at the current position.
     * Implementation of this interface need to store the current position.
     */
    @Override
    public Font getFont() {
        if(navigableMap.floorEntry(currentPosition) != null){
            return navigableMap.floorEntry(currentPosition).getValue();
        }
        return null;
    }

    /**
     *
     * @param font  The {@link Font} to set
     * @param span  Number of elements which have this font.
     */
    @Override
    public void setFont(Font font, Integer span) {
        Font currentFont = getFont();
        navigableMap.put(currentPosition, font);
        if (currentFont != null) {
            navigableMap.put(currentPosition + span, currentFont);
        }

    }

}

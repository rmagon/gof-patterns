package com.github.rmagon.structuralpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Date : 08/12/17
 *
 * @author rachitmagon
 */
public class GlyphFactory {

    /**
     * The characterMap contains all Character glyphs indexed by character code.
     */
    private Map<Integer, Character> characterMap = new HashMap<>();

    /**
     * Finds a character in the map and it returns the corresponding glyph if it exists.
     * If it doesn't exist already, then create the glyph, put it in the map & return it.
     */
    public Character createCharacter(Integer code) {
        if (!characterMap.containsKey(code)) {
            Character character = new Character(code);
            characterMap.put(code, character);
        }
        return characterMap.get(code);
    }



}

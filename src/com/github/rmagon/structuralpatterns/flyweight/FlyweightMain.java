package com.github.rmagon.structuralpatterns.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Date : 08/12/17
 * This is a sample Java Program for the example in the <a href="https://en.wikipedia.org/wiki/Design_Patterns">Design Patterns Book</a>
 *
 * @author rachitmagon
 */
public class FlyweightMain {

    public static void main(String args[]) {

        GlyphFactory glyphFactory = new GlyphFactory();

        GlyphContext glyphContext = new GlyphContextImpl();
        Font roman = new Font("roman");
        Font arial = new Font("arial");
        Font times = new Font("times");
        List<Character> characters = new ArrayList<>();

        //a with roman font
        Character a = glyphFactory.createCharacter((int) 'a');
        a.setFont(roman, glyphContext);
        characters.add(a);

        //b with arial font
        Character b = glyphFactory.createCharacter((int) 'b');
        b.setFont(arial, glyphContext);
        characters.add(b);

        //c with arial font
        Character c1 = glyphFactory.createCharacter((int) 'c');
        c1.setFont(arial, glyphContext);
        characters.add(c1);

        //c with times font
        //c2 is the same as c1
        Character c2 = glyphFactory.createCharacter((int) 'c');
        c2.setFont(times, glyphContext);
        characters.add(c2);

        printAll(characters, glyphContext);
        /*
         * Output:
         * roman: a
         * arial: b
         * arial: c
         * times: c
         */
    }

    public static void printAll(List<Character> characters, GlyphContext glyphContext) {
        glyphContext.start();
        for (Character character : characters) {
            character.draw(glyphContext);
            character.next(glyphContext);
        }
    }
}

package com.github.rmagon.structuralpatterns.flyweight;

/**
 * Date : 01/12/17
 *
 * @author rachitmagon
 */
public class Font {

    String fontName = "";

    public Font(String fontName){
        this.fontName = fontName;
    }

    public String getFontName(){
        return fontName;
    }
}

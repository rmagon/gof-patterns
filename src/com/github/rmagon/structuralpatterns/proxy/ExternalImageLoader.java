package com.github.rmagon.structuralpatterns.proxy;

/**
 * Date : 08/12/17
 *
 * @author rachitmagon
 */
public class ExternalImageLoader {

    /**
     * Heavy operation
     *
     * @param filePath The path from which we need to load an image
     * @return a new Image
     */
    public static Image loadAnImage(String filePath) {
        return new Image(filePath, "Smiley.jpeg");
    }
}

package com.github.rmagon.structuralpatterns.proxy;

/**
 * Date : 08/12/17
 *
 * @author rachitmagon
 */
public class ImagePtr {

    private String filePath;

    private Image image;

    public ImagePtr(String filePath) {
        this.filePath = filePath;
    }

    public Image operatorGetImage() {
        return loadImage();
    }

    private Image loadImage() {
        if (image == null) {
            this.image = ExternalImageLoader.loadAnImage(filePath);
        }
        return image;
    }
}

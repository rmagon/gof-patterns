package com.github.rmagon.bridge.implementors.xwindow;

/**
 * Date : 15/11/17
 * This is a dummy class which stores XWindow System specific state
 *
 * @author rachitmagon
 */
public class XWindowDrawable {

    private String id;

    public XWindowDrawable(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

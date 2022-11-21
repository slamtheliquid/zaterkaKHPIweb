package com.lab5.renderer;

/**
 * Used builder pattern
 */
public interface Render {

    Render addTitle(String title);
    Render addContent(String content);
    Render addImage(String image);
    Render addIdentifier(long identifier);
    void doRender();
}

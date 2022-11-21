package com.lab5.renderer;

/**
 * Used builder pattern
 */
public abstract class AbstractRender implements Render {

    protected String title;
    protected String content;
    protected String image;
    protected long identifier;

    public Render addTitle(String title) {
        this.title = title;
        return this;
    }

    public Render addContent(String content) {
        this.content = content;
        return this;
    }

    public Render addImage(String image) {
        this.image = image;
        return this;
    }

    public Render addIdentifier(long identifier) {
        this.identifier = identifier;
        return this;
    }

    public abstract void doRender();
}

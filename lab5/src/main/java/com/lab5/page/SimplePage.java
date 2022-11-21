package com.lab5.page;

import com.lab5.renderer.Render;

public class SimplePage implements Page {

    private Render render;
    private String title;
    private String content;

    public SimplePage(Render render) {
        this.render = render;
    }

    public void setRender(Render render) {
        this.render = render;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void renderPage() {
        render.addTitle(title).addContent(content).doRender();
    }
}

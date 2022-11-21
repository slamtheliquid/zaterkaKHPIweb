package com.lab5.renderer;

public class XMLRender extends AbstractRender {

    public void doRender() {
        System.out.println("<== rendering XML ==>");
        System.out.println(buildPage());
    }

    private String buildPage() {
        StringBuilder sb = new StringBuilder();
        sb.append("<page>\n");
        if (title != null) {
            sb.append("    <title>").append(title).append("</title>\n");
        }
        if (content != null) {
            sb.append("    <content>").append(content).append("</content>\n");
        }
        if (image != null) {
            sb.append("    <image>").append(image).append("</image>\n");
        }
        if (identifier != 0L) {
            sb.append("    <id>").append(identifier).append("</id>\n");
        }
        sb.append("</page>\n");

        return sb.toString();
    }
}

package com.lab5.renderer;

public class JSONRender extends AbstractRender {

    public void doRender() {
        System.out.println("<== rendering JSON ==>");
        System.out.println(buildPage());
    }

    private String buildPage() {
        StringBuilder sb = new StringBuilder();
        sb.append("page: {\n");
        if (title != null) {
            sb.append("  \"title\": \"").append(title).append("\"");
        }
        if (content != null) {
            sb.append(",\n  \"content\": \"").append(content).append("\"");
        }
        if (image != null) {
            sb.append(",\n  \"image\": \"").append(image).append("\"");
        }
        if (identifier != 0L) {
            sb.append(",\n  \"id\": ").append(identifier);
        }
        sb.append("\n}\n");

        return sb.toString();
    }
}

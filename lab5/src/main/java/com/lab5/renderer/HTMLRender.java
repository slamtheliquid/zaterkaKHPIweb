package com.lab5.renderer;

public class HTMLRender extends AbstractRender {

    public void doRender() {
        System.out.println("<== rendering HTML ==>");
        System.out.println(buildPage());
    }

    private String buildPage() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>\n  <body>\n");
        if (title != null) {
            sb.append("    <h1>").append(title).append("</h1>\n");
        }
        if (content != null) {
            sb.append("    <div>").append(content).append("</div>\n");
        }
        if (image != null) {
            sb.append("    <img src=\"").append(image).append("\" alt='image'/>\n");
        }
        if (identifier != 0L) {
            sb.append("    <a href=\"").append(identifier).append("\">buy</a>\n");
        }
        sb.append("  </body>\n</html>\n");

        return sb.toString();
    }
}

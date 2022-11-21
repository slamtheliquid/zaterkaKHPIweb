package com.lab5.page;

import com.lab5.entity.Product;
import com.lab5.renderer.Render;

public class ProductPage implements Page {

    private Render render;
    private Product product;

    public ProductPage(Render render) {
        this.render = render;
    }

    public void setRender(Render render) {
        this.render = render;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void renderPage() {
        render.addTitle(product.getName()).addContent(product.getDescription()).addImage(product.getImageLink()).addIdentifier(product.getId()).doRender();
    }
}

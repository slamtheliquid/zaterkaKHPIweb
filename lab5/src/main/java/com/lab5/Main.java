package com.lab5;

import com.lab5.entity.Product;
import com.lab5.page.ProductPage;
import com.lab5.page.SimplePage;
import com.lab5.renderer.HTMLRender;
import com.lab5.renderer.JSONRender;
import com.lab5.renderer.Render;
import com.lab5.renderer.XMLRender;

public class Main {

    public static void main(String[] args) {
        Render htmlRender = new HTMLRender();
        Render jsonRender = new JSONRender();
        Render xmlRender = new XMLRender();

        ProductPage productPage = new ProductPage(htmlRender);
        Product product = new Product(1L, "product_name_example", "product_description_example", "http://image-link-example/image-example.jpeg");
        productPage.setProduct(product);

        SimplePage simplePage = new SimplePage(htmlRender);
        simplePage.setTitle("page_title");
        simplePage.setContent("page_content");

        simplePage.renderPage();
        productPage.renderPage();

        simplePage.setRender(jsonRender);
        productPage.setRender(jsonRender);
        simplePage.renderPage();
        productPage.renderPage();

        simplePage.setRender(xmlRender);
        productPage.setRender(xmlRender);
        simplePage.renderPage();
        productPage.renderPage();
    }
}

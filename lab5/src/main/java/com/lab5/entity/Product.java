package com.lab5.entity;

public class Product {
    private long id;
    private String name;
    private String description;
    private String imageLink;

    public Product(long id, String name, String description, String imageLink) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageLink = imageLink;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
}


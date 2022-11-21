package com.lab2.entity;

import com.lab2.fileManagement.FileManager;

public class User {
    private long id;
    private String name;
    private FileManager fileManager;

    public User(long id, String name, FileManager fileManager) {
        this.id = id;
        this.name = name;
        this.fileManager = fileManager;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFileManager(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public FileManager getFileManager() {
        return fileManager;
    }
}

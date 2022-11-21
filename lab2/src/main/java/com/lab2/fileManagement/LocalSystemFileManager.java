package com.lab2.fileManagement;

import java.io.File;

public class LocalSystemFileManager implements FileManager {

    private static LocalSystemFileManager instance;

    private LocalSystemFileManager() {}

    public static LocalSystemFileManager getInstance() {
        if (instance == null) {
            instance = new LocalSystemFileManager();
        }
        return instance;
    }

    public File downloadFile(String fileIdentifier) {
        System.out.println("downloading local file by id: " + fileIdentifier);
        return new File("path.txt");
    }

    public void uploadFile(String fileIdentifier, File file) {
        System.out.println("uploading local file with id: " + fileIdentifier + " and path " + file.getPath());
    }
}

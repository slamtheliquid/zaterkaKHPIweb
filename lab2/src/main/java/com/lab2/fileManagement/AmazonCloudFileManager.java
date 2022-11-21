package com.lab2.fileManagement;

import java.io.File;

public class AmazonCloudFileManager implements FileManager {

    private static AmazonCloudFileManager instance;

    private AmazonCloudFileManager() {}

    public static AmazonCloudFileManager getInstance() {
        if (instance == null) {
            instance = new AmazonCloudFileManager();
        }
        return instance;
    }

    public File downloadFile(String fileIdentifier) {
        System.out.println("downloading file from amazon by id: " + fileIdentifier);
        return new File("path.txt");
    }

    public void uploadFile(String fileIdentifier, File file) {
        System.out.println("uploading file to amazon with id: " + fileIdentifier + " and path " + file.getPath());
    }
}

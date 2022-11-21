package com.lab2;

import com.lab2.entity.User;
import com.lab2.fileManagement.AmazonCloudFileManager;
import com.lab2.fileManagement.LocalSystemFileManager;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        User u1LocalFM = new User(1, "name1", LocalSystemFileManager.getInstance());
        User u2LocalFM = new User(2, "name2", LocalSystemFileManager.getInstance());

        boolean isTheSameLocalFMInstance = u1LocalFM.getFileManager() == u2LocalFM.getFileManager();
        System.out.println("same lfm inst?: " + isTheSameLocalFMInstance); //true

        User u1CloudFM = new User(3, "name3", AmazonCloudFileManager.getInstance());
        User u2CloudFM = new User(4, "name4", AmazonCloudFileManager.getInstance());

        boolean isTheSameAmazonFMInstance = u1CloudFM.getFileManager() == u2CloudFM.getFileManager();
        System.out.println("same afm inst?: " + isTheSameAmazonFMInstance); //true

        File file = u1LocalFM.getFileManager().downloadFile("localFileID");
        u2CloudFM.getFileManager().uploadFile("cloudFileID", file);
    }
}

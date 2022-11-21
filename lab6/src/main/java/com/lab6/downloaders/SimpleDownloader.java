package com.lab6.downloaders;

import java.io.File;

public class SimpleDownloader implements Downloader {

    public File downloadFile(String fileName) {
        System.out.println(
                "/_/_/ 5imple downloader log: downloading file with com.lab6.downloaders.SimpleDownloader by fileName: " + fileName + " /_/_/");
        return new File("/fileName");
    }
}

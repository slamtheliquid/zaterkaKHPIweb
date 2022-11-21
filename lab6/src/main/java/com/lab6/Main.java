package com.lab6;

import com.lab6.downloaders.ProxyDownloaderWithCache;
import com.lab6.downloaders.Downloader;
import com.lab6.downloaders.SimpleDownloader;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        Downloader simpleDownloader = new SimpleDownloader();
        Downloader cacheProxyDownloader = new ProxyDownloaderWithCache(simpleDownloader);

        File file1 = cacheProxyDownloader.downloadFile("file_name_example_0");
        File file2 = cacheProxyDownloader.downloadFile("file_name_example_0");

        File file3 = cacheProxyDownloader.downloadFile("file_name_example_1");
        File file4 = cacheProxyDownloader.downloadFile("file_name_example_1");
    }
}
